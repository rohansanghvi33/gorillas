package com.rohan.gorillas.repository

import com.rohan.gorillas.models.Delivery
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DeliveryRepository : ReactiveCrudRepository<Delivery,String> {}