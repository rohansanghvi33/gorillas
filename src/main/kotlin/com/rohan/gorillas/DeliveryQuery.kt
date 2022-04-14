package com.rohan.gorillas

import com.expediagroup.graphql.server.operations.Query
import com.rohan.gorillas.models.Delivery
import com.rohan.gorillas.service.DeliveryService
import org.springframework.stereotype.Component

@Component
class DeliveryQuery(private val deliveryService: DeliveryService) : Query {

    suspend fun getDeliveries() : List<Delivery> = deliveryService.getAllDeliveries()

    suspend fun getPendingDeliveries() : List<Delivery> = deliveryService.getPendingDeliveries()

}