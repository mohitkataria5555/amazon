package com.axis.customer.controller

import com.axis.customer.entity.Customer
import com.axis.customer.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/customers")
class CustomerController(private val customerService: CustomerService) {
    @GetMapping("/{id}")
    fun findById(@PathVariable id: String): Mono<Customer> {
        return customerService.findById(id)
    }

    @GetMapping("/email")
    fun findByEmail(@RequestParam email: String): Mono<Customer> {
        return customerService.findByEmail(email)
    }

    @GetMapping("/all")
    fun findAll(): Flux<Customer> {
        return customerService.findAll()
    }

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@RequestBody user: Customer): Mono<Customer> {
        return customerService.save(user)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteById(@PathVariable id: String): Mono<Void> {
        return customerService.deleteById(id)
    }
}