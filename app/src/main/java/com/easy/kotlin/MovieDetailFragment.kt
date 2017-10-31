package com.easy.kotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.easy.kotlin.bean.MovieContent
import com.easy.kotlin.util.HttpUtil
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.movie_detail.view.*

class MovieDetailFragment : Fragment() {
    private var mItem: MovieContent.Movie? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (arguments.containsKey(ARG_MOVIE_ID)) {

            mItem = MovieContent.MOVIE_MAP[arguments.getString(ARG_MOVIE_ID)]
            mItem?.let {
                activity.toolbar_layout?.title = it.title
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // 绑定 movieDetailView
        val movieDetailView = inflater.inflate(R.layout.movie_detail, container, false)
        mItem?.let {
            movieDetailView.movie_poster_image.setImageBitmap(HttpUtil.getBitmapFromURL(it.posterPath))
            movieDetailView.movie_overview.text = "影片简介： ${it.overview}"
            movieDetailView.movie_vote_count.text = "打分次数：${it.vote_count}"
            movieDetailView.movie_vote_average.text = "评分：${it.vote_average}"
            movieDetailView.movie_release_date.text = "发行日期：${it.release_date}"
        }

        return movieDetailView
    }

    companion object {
        const val ARG_MOVIE_ID = "movie_id"
    }
}
