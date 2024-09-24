package com.net17.myproducts.domain.repository

import androidx.paging.PagingData
import com.net17.myproducts.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductsRepository {

    fun getProducts(sources: List<String>): Flow<PagingData<Product>>

    fun searchProducts(searchQuery: String, sources: List<String>): Flow<PagingData<Product>>

    suspend fun upsertProduct(product: Product)

    suspend fun deleteProduct(product: Product)

    fun getProducts(): Flow<List<Product>>

    suspend fun getProduct(url: String): Product?

}