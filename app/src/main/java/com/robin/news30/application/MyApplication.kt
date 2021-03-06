package com.robin.news30.application

import android.app.Application
import com.robin.news30.di.app.AppComponent
import com.robin.news30.di.app.AppModule
import com.robin.news30.di.app.DaggerAppComponent


class MyApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

}