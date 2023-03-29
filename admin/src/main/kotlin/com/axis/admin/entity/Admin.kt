package com.axis.admin.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection="admin")
data class Admin(
    @Id

    val id: Long = 0,
    val username: String,
    val password: String
)
