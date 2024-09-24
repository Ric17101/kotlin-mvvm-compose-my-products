package com.net17.myproducts.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.net17.myproducts.domain.model.Product

@Database(entities = [Product::class], version = 1, exportSchema = false)
@TypeConverters(ProductsTypeConvertor::class)
abstract class ProductsDatabase : RoomDatabase() {

    abstract val productsDao: ProductsDao

}