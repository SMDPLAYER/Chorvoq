package uz.smd.marketplatform.data.service

import retrofit2.Call

import retrofit2.http.POST
import retrofit2.http.Query
import uz.smd.marketplatform.data.entities.PassData


interface ApiService {

    @POST("vehicle/check")
    fun checkPassNumber(@Query("reg_number") reg_number:String): Call<ResponseData<PassData>>

}