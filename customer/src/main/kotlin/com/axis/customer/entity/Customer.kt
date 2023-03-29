package com.axis.customer.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "customers")
data class Customer(
    @Id val id: String?,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String

) {
    constructor(firstName: String, lastName: String, email: String, password: String) :
            this(null, firstName, lastName, email, password)

    fun getFullName(): String = "$firstName $lastName"

    override fun toString(): String {
        return "User(id=$id, firstName='$firstName', lastName='$lastName', email='$email', password='$password')"
    }
}
