package com.net17.myproducts.di

import android.app.Application
import androidx.room.Room
import com.net17.myproducts.data.local.ProductsDao
import com.net17.myproducts.data.local.ProductsDatabase
import com.net17.myproducts.data.local.ProductsTypeConvertor
import com.net17.myproducts.data.remote.ProductsApi
import com.net17.myproducts.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApiInstance(): ProductsApi {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ProductsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideProductsDatabase(
        application: Application
    ): ProductsDatabase {
        return Room.databaseBuilder(
            context = application,
            klass = ProductsDatabase::class.java,
            name = "products_db"
        ).addTypeConverter(ProductsTypeConvertor())
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideProductsDao(
        productsDatabase: ProductsDatabase
    ): ProductsDao = productsDatabase.productsDao

}