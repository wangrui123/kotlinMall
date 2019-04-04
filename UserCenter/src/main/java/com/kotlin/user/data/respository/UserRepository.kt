package com.kotlin.user.data.respository

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.prorocel.BaseResp
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.*
import rx.Observable

/*
    用户相关数据层
 */
class UserRepository{
    /*
        用户注册
     */
    fun register(mobile:String,verifyCode:String,pwd:String): Observable<BaseResp<String>>{
        return RetrofitFactory.instance.create(UserApi::class.java).register(RegisterRep(mobile,verifyCode,pwd))
    }

}
