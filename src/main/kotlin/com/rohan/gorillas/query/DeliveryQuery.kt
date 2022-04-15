package com.rohan.gorillas.query

import com.expediagroup.graphql.generator.annotations.GraphQLDescription
import com.expediagroup.graphql.server.operations.Query
import com.rohan.gorillas.models.Delivery
import com.rohan.gorillas.service.DeliveryService
import org.springframework.stereotype.Component

@Component
class DeliveryQuery(private val deliveryService: DeliveryService) : Query {

    @GraphQLDescription("Query to get all Deliveries")
    suspend fun getAllDeliveries() : List<Delivery> = deliveryService.getAllDeliveries()

    @GraphQLDescription("Query to get all pending deliveries")
    suspend fun getPendingDeliveries() : List<Delivery> = deliveryService.getPendingDeliveries()

}