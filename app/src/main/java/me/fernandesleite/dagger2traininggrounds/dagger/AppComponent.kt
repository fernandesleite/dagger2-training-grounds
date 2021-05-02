package me.fernandesleite.dagger2traininggrounds.dagger

import dagger.Component
import me.fernandesleite.dagger2traininggrounds.car.Driver
import javax.inject.Scope
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getActivityComponentBuilder(): ActivityComponent.Builder
}