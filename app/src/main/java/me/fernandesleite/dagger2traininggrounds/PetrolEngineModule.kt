package me.fernandesleite.dagger2traininggrounds

import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    /**
     *  Binds methods are more concise because they are declared as abstract methods without a body,
     *  and they are more efficient because Dagger doesn’t have to
     *  invoke them or even instantiate their containing module.
     ***/
    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}