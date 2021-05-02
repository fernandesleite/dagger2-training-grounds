package me.fernandesleite.dagger2traininggrounds.dagger

import dagger.Module
import dagger.Provides
import me.fernandesleite.dagger2traininggrounds.car.Driver
import javax.inject.Singleton

@Module
abstract class DriverModule {
    companion object {
        @Provides
        @Singleton
        fun provideDriver(): Driver {
            return Driver()
        }
    }
}