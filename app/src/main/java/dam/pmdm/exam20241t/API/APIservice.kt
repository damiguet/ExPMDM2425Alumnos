package dam.pmdm.exam20241t.API

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIservice {
    @GET
    suspend fun getPlayas(@Url url:String): Response<PlayasResponse>
}