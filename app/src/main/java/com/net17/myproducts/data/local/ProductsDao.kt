package com.net17.myproducts.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.net17.myproducts.domain.model.Product
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Product)

    @Delete
    suspend fun delete(article: Product)

    @Query("SELECT * FROM Product")
    fun getArticles(): Flow<List<Product>>

    @Query("SELECT * FROM Product WHERE id=:id")
    suspend fun getArticle(id: String): Product?

}