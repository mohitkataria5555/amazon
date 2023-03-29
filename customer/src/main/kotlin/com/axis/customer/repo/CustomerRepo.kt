package com.axis.customer.repo

import com.axis.customer.entity.Customer
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Mono

interface CustomerRepo : ReactiveMongoRepository<Customer, String> {
    fun findByEmail(email: String): Mono<Customer>
}
