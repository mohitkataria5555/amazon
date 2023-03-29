package com.example.category.repo

import com.example.category.entity.Category
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : ReactiveMongoRepository<Category, String>