package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

interface HeroRepository {

    val heroes : Map<Int,List<Hero>>
    val page1 : List<Hero>
    val page2 : List<Hero>
    val page3 : List<Hero>
    val page4 : List<Hero>
    val page5 : List<Hero>

    suspend fun getallheroes(page : Int=1) : ApiResponse
    suspend fun Searchheroes(name : String?) : ApiResponse
}