package com.example.moviedatabase.services

import com.example.moviedatabase.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/movie/popular?api_key=3a865db9e58cc2800725dd903c820dab")
    fun getMovieList(): Call<MovieResponse>

}