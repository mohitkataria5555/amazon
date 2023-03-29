package com.axis.customer.service

import com.axis.customer.entity.Customer
import com.axis.customer.repo.CustomerRepo
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class CustomerServiceImpl(private val customerRepo: CustomerRepo) : CustomerService(customerRepo) {
    override fun findById(id: String): Mono<Customer> {
        return customerRepo.findById(id)
    }

    override fun findByEmail(email: String): Mono<Customer> {
        return customerRepo.findByEmail(email)
    }

    override fun findAll(): Flux<Customer> {
        return customerRepo.findAll()
    }

    override fun save(user: Customer): Mono<Customer> {
        return customerRepo.save(user)
    }

    override fun deleteById(id: String): Mono<Void> {
        return customerRepo.deleteById(id)
    }
}