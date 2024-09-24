package com.net17.myproducts.domain.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
data class Product(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val description: String,
    val category: String,
    val price: Double,
    val discountPercentage: Double,
    val rating: Double,
    val stock: Long,
//    val tags: List<String> = emptyList(),
    val brand: String,
    val sku: String,
    val weight: Long,
//    val dimensions: Dimensions,
    val warrantyInformation: String,
    val shippingInformation: String,
    val availabilityStatus: String,
//    val reviews: List<Review> = emptyList(),
    val returnPolicy: String,
    val minimumOrderQuantity: Long,
//    val meta: Meta,
    val thumbnail: String,
//    val images: List<String>
) : Parcelable

@Parcelize
@Entity
data class Dimensions(
    val width: Double,
    val height: Double,
    val depth: Double
) : Parcelable

@Parcelize
@Entity
data class Meta(
    val createdAt: String,
    val updatedAt: String,
    val barcode: String,
    val qrCode: String
) : Parcelable

@Parcelize
@Entity
data class Review(
    val rating: Long,
    val comment: String,
    val date: String,
    val reviewerName: String,
    val reviewerEmail: String
) : Parcelable