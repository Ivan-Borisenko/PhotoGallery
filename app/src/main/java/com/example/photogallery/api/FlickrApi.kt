package com.example.photogallery.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {

    @GET(/*"/")
    fun fetchContents(): Call<String>*/
        "servises/rest/?method=flickr.interestingness.getList" +
                "@&api_key=e6e28bca87ed6ee5ece0cbc9effe783f" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
}