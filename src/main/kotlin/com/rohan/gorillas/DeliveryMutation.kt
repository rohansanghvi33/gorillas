package com.rohan.gorillas

import com.expediagroup.graphql.server.operations.Mutation
import com.rohan.gorillas.models.Delivery
import com.rohan.gorillas.service.DeliveryService
import kotlinx.coroutines.reactor.awaitSingle
import org.springframework.stereotype.Component

@Component
class DeliveryMutation(private val deliveryService: DeliveryService) : Mutation {

    suspend fun updateDelivery(deliveryId : String) : Delivery? = deliveryService.updateDeliveryById(deliveryId)
}