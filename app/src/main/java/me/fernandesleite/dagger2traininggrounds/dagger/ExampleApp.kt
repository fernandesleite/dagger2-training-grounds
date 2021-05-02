package me.fernandesleite.dagger2traininggrounds.dagger

import android.app.Application

class ExampleApp: Application() {

    lateinit var component: AppComponent
    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.factory().create()
    }

    fun getAppComponent(): AppComponent {
        return component
    }
}