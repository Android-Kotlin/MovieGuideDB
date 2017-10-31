package com.easy.kotlin.bean

import android.os.StrictMode
import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONArray
import java.net.URL
import java.nio.charset.Charset
import java.util.*


object MovieContent {

    val MOVIES: MutableList<Movie> = ArrayList()
    val MOVIE_MAP: MutableMap<String, Movie> = HashMap()

    val VOTE_AVERAGE_API = "http://api.themoviedb.org//3/discover/movie?sort_by=popularity.desc&api_key=7e55a88ece9f03408b895a96c1487979&page=1"

    init {
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        initMovieListData()
    }

    private fun initMovieListData() {

        val jsonstr = URL(VOTE_AVERAGE_API).readText(Charset.defaultCharset())
        try {
            val obj = JSON.parse(jsonstr) as Map<*, *>
            val dataArray = obj.get("results") as JSONArray

            dataArray.forEachIndexed { index, it ->
                val title = (it as Map<*, *>).get("title") as String
                val overview = it.get("overview") as String
                val poster_path = it.get("poster_path") as String
                val vote_count = it.get("vote_count").toString()
                val vote_average = it.get("vote_average").toString()
                val release_date = it.get("release_date").toString()
                addMovie(Movie(id = index.toString(),
                        title = title,
                        overview = overview,
                        vote_count = vote_count,
                        vote_average = vote_average,
                        release_date = release_date,
                        posterPath = getPosterUrl(poster_path)))
            }

        } catch (ex: Exception) {
            ex.printStackTrace()
        }

    }

    private fun addMovie(movie: Movie) {
        MOVIES.add(movie)
        MOVIE_MAP.put(movie.id, movie)
    }


    fun getPosterUrl(posterPath: String): String {
        return "https://image.tmdb.org/t/p/w185_and_h278_bestv2$posterPath"
    }

    data class Movie(val id: String,
                     val title: String,
                     val overview: String,
                     val vote_count: String,
                     val vote_average: String,
                     val release_date: String,
                     val posterPath: String)


}
