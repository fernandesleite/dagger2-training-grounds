package me.fernandesleite.dagger2traininggrounds.dagger

import dagger.Module
import dagger.Provides
import me.fernandesleite.dagger2traininggrounds.car.Rims
import me.fernandesleite.dagger2traininggrounds.car.Tires
import me.fernandesleite.dagger2traininggrounds.car.Wheels

/**
 * Modules: class that provides or builds the objects dependencies
 * Describe how you want to build your dependencies
 **/
@Module
class WheelsModule {

    /**
     * Can be used on methods in classes annotated with @Module and
     * is used for methods which provides objects for dependencies injection.
     * **/
    @Provides
    fun  provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        val tires: Tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }
}