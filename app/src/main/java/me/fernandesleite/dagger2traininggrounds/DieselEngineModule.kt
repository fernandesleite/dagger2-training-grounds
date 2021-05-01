package me.fernandesleite.dagger2traininggrounds

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {
    @Provides
    fun provideEngine(): Engine {
        return DieselEngine(horsePower)
    }
}