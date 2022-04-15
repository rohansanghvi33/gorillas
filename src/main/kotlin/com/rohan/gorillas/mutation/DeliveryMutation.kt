package com.rohan.gorillas.mutation

import com.expediagroup.graphql.generator.annotations.GraphQLDescription
import com.expediagroup.graphql.server.operations.Mutation
import com.rohan.gorillas.models.Delivery
import com.rohan.gorillas.service.DeliveryService
import kotlinx.coroutines.reactor.awaitSingle
import org.springframework.stereotype.Component

@Component
class DeliveryMutation(private val deliveryService: DeliveryService) : Mutation {
    @GraphQLDescription("Marks the product (deliveryId) as received and returns the the information of the delivery or shows error if the product is not in delivery manifest")
    suspend fun receiveDelivery(deliveryId : String) : Delivery? = deliveryService.updateDeliveryById(deliveryId)
}