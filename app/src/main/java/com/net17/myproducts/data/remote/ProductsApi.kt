package com.net17.myproducts.data.remote

import com.net17.myproducts.data.remote.dto.ProductsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ProductsApi {

    @GET("everything")
    suspend fun getProducts(
        @Query("sources") sources: String,
        @Query("page") page: Int,
    ): ProductsResponse

    @GET("everything")
    suspend fun searchProducts(
        @Query("q") searchQuery: String,
        @Query("sources") sources: String,
        @Query("page") page: Int,
    ): ProductsResponse
}