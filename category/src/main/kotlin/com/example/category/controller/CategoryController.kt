package com.example.category.controller

import com.example.category.entity.Category
import com.example.category.service.CategoryService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/categories")
class CategoryController(private val categoryService: CategoryService) {

    @GetMapping("/all")
    fun getAllCategories(): Flux<Category> {
        return categoryService.getAllCategories()
    }

    @GetMapping("/{id}")
    fun getCategoryById(@PathVariable id: String): Mono<Category> {
        return categoryService.getCategoryById(id)
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    fun createCategory(@RequestBody category: Category): Mono<Category> {
        return categoryService.createCategory(category)
    }

    @PutMapping("/update/{id}")
    fun updateCategory(@PathVariable id: String, @RequestBody category: Category): Mono<Category> {
        return categoryService.updateCategory(id, category)
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteCategory(@PathVariable id: String): Mono<Void> {
        return categoryService.deleteCategory(id)
    }
}
