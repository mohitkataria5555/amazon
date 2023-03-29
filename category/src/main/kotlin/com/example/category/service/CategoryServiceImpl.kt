package com.example.category.service

import com.example.category.entity.Category
import com.example.category.repo.CategoryRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class CategoryServiceImpl(private val categoryRepository: CategoryRepository) : CategoryService {

    override fun getAllCategories(): Flux<Category> {
        return categoryRepository.findAll()
    }

    override fun getCategoryById(id: String): Mono<Category> {
        return categoryRepository.findById(id)
    }

    override fun createCategory(category: Category): Mono<Category> {
        return categoryRepository.save(category)
    }

    override fun updateCategory(id: String, category: Category): Mono<Category> {
        return categoryRepository.findById(id)
            .flatMap { existingCategory ->
                val updatedCategory = existingCategory.copy(
                    name = category.name,
                    description = category.description,
                   // products = category.products
                )
                categoryRepository.save(updatedCategory)
            }
    }

    override fun deleteCategory(id: String): Mono<Void> {
        return categoryRepository.deleteById(id)
    }
}