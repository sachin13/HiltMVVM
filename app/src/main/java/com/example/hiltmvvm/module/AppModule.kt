package com.example.hiltmvvm.module

import com.example.hiltmvvm.repository.DogsRepository
import com.example.hiltmvvm.repository.DogsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideDogsRepository(): DogsRepository = DogsRepositoryImpl()
}
