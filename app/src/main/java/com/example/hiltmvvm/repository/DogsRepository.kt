package com.example.hiltmvvm.repository

import com.example.hiltmvvm.entity.Dog

interface DogsRepository {
    fun getBreeds(): List<Dog>
}
