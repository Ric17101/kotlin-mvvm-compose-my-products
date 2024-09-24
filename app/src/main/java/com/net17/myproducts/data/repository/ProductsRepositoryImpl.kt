package com.net17.myproducts.data.repository

import androidx.paging.PagingData
import com.net17.myproducts.domain.model.Product
import com.net17.myproducts.domain.repository.ProductsRepository
import kotlinx.coroutines.flow.Flow

class ProductsRepositoryImpl : ProductsRepository {
    override fun getProducts(sources: List<String>): Flow<PagingData<Product>> {
        TODO("Not yet implemented")
    }

    override fun searchProducts(searchQuery: String, sources: List<String>): Flow<PagingData<Product>> {
        TODO("Not yet implemented")
    }

    override suspend fun upsertProduct(product: Product) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteProduct(product: Product) {
        TODO("Not yet implemented")
    }

    override fun getProducts(): Flow<List<Product>> {
        TODO("Not yet implemented")
    }

    override suspend fun getProduct(url: String): Product? {
        TODO("Not yet implemented")
    }
}