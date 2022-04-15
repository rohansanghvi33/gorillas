package com.rohan.gorillas.models

import com.expediagroup.graphql.generator.annotations.GraphQLDescription
import com.expediagroup.graphql.generator.annotations.GraphQLIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.Date
import java.util.function.Supplier

@Table("deliveries")
data class Delivery (
    @GraphQLDescription("Delivery ID of the product")
    @Id @Column("id") val deliveryId: String,
    @GraphQLDescription("Product name")
    val product: String,
    @GraphQLDescription("Supplier of the product")
    val supplier: String,
    @GraphQLDescription("Quantity of the product")
    val quantity: Int,
    @GraphQLDescription("ExpectedDate of delivery")
    @Column("expecteddate") val expectedDate: String,
    @GraphQLDescription("Expected Warehouse to be delivered to")
    @Column("warehouse") val expectedWarehouse: String,
    @GraphQLIgnore val isreceived : Boolean
    )