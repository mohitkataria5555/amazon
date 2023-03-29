package com.axis.customer.service

import com.axis.customer.entity.Customer
import com.axis.customer.repo.CustomerRepo
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class CustomerService(private val customerRepository: CustomerRepo) {
    fun findById(id: String): Mono<Customer> = customerRepository.findById(id)

    fun findByEmail(email: String): Mono<Customer> = customerRepository.findByEmail(email)

    fun findAll(): Flux<Customer> = customerRepository.findAll()

    fun save(user: Customer): Mono<Customer> = customerRepository.save(user)

    fun deleteById(id: String): Mono<Void> = customerRepository.deleteById(id)
}