package com.example.photogallery.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface FlickrApi {

    /*@GET(/*"/")
    fun fetchContents(): Call<String>*/
        "servises/rest/?method=flickr.interestingness.getList" +
                "@&api_key=e6e28bca87ed6ee5ece0cbc9effe783f" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )*/

    @GET("services/rest?method=flickr.interestingness.getList")
    fun fetchPhotos(): Call<FlickrResponse>

    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>

    @GET("services/rest?method=flickr.photos.search")
    fun searchPhotos(@Query("text") query: String): Call<FlickrResponse>
}