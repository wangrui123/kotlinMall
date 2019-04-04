package com.kotlin.user.service.impl

import com.kotlin.base.data.prorocel.BaseResp
import com.kotlin.base.rx.BaseException
import com.kotlin.user.data.respository.UserRepository
import com.kotlin.user.service.UserService
import rx.Observable
import rx.functions.Func1

class UserServiceImpl : UserService {
    override fun register(mobile: String, verifyCode: String,pwd: String ): Observable<Boolean> {
        val userRepository = UserRepository()
        return userRepository.register(mobile, verifyCode, pwd).flatMap(object : Func1<BaseResp<String>, Observable<Boolean>> {
            override fun call(t: BaseResp<String>): Observable<Boolean> {
                if (t.status != 0) {
                    return Observable.error(BaseException(t.status, t.message))
                }
                return Observable.just(true)
            }
        })
    }

}