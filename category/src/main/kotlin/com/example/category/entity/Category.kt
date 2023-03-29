package com.example.category.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "category")
data class Category(
    @Id
    var id: String?,
    var name: String,
    var description: String,

) {
    constructor(name: String, description: String) : this(null, name, description)
}

