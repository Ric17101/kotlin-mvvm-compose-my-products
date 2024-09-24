package com.net17.myproducts.data.remote.dto

import com.net17.myproducts.domain.model.Product

data class ProductsResponse(
    val articles: List<Product>,
    val status: String,
    val totalResults: Int
)