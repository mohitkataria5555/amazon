package com.example.category.service

import com.example.category.entity.Category
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface CategoryService {
    fun getAllCategories(): Flux<Category>
    fun getCategoryById(id: String): Mono<Category>
    fun createCategory(category: Category): Mono<Category>
    fun updateCategory(id: String, category: Category): Mono<Category>
    fun deleteCategory(id: String): Mono<Void>
}


