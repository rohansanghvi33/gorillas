package com.rohan.gorillas.models

import com.expediagroup.graphql.generator.annotations.GraphQLIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.Date
import java.util.function.Supplier

@Table("deliveries")
data class Delivery (
    @Id @Column("id") val deliveryId: String,
    val product: String,
    val supplier: String,
    val quantity: Int,
    @Column("expecteddate") val expectedDate: String,
    @Column("warehouse") val expectedWarehouse: String,
    @GraphQLIgnore val isreceived : Boolean
    )