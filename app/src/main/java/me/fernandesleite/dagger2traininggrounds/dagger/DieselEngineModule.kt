package me.fernandesleite.dagger2traininggrounds.dagger

import dagger.Module
import dagger.Provides
import me.fernandesleite.dagger2traininggrounds.car.DieselEngine
import me.fernandesleite.dagger2traininggrounds.car.Engine

@Module
class DieselEngineModule(private val horsePower: Int) {

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun provideEngine(engine: DieselEngine): Engine {
        return engine
    }
}