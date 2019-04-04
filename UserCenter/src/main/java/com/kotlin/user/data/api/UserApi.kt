package com.kotlin.user.data.api

import com.kotlin.base.data.prorocel.BaseResp
import com.kotlin.user.data.protocol.RegisterRep
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

interface UserApi {

    /*
       用户注册
    */
    @POST("kl/userCenter/register")
    fun register(@Body s: RegisterRep): Observable<BaseResp<String>>

}