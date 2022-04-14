package com.rohan.gorillas.service

import com.rohan.gorillas.models.Delivery
import com.rohan.gorillas.repository.DeliveryRepository
import kotlinx.coroutines.reactive.awaitFirst
import kotlinx.coroutines.reactive.awaitFirstOrElse
import kotlinx.coroutines.reactive.awaitFirstOrNull
import org.springframework.r2dbc.core.DatabaseClient
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.switchIfEmpty

@Service
class DeliveryService(private val deliveryRepository: DeliveryRepository) {

    suspend fun getAllDeliveries() : List<Delivery> = deliveryRepository.findAll().collectList().awaitFirst()

    suspend fun updateDeliveryById( deliveryId : String ) : Delivery? {
        val storedDelivery = deliveryRepository.findById(deliveryId).awaitFirstOrNull()
        if(storedDelivery != null)
        {
            val updatedDelivery = Delivery(storedDelivery.deliveryId,storedDelivery.product,storedDelivery.supplier,storedDelivery.quantity,storedDelivery.expectedDate,storedDelivery.expectedWarehouse,true)
            return deliveryRepository.save(updatedDelivery).awaitFirstOrNull()
        }
        else
            return null
    }

    suspend fun getPendingDeliveries() : List<Delivery> = deliveryRepository.findAll().filter { !it.isdelivered }.collectList().awaitFirst()
}