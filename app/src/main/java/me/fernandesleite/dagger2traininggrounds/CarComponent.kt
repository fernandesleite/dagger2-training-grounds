package me.fernandesleite.dagger2traininggrounds

import dagger.Component

// The interface that will generate Car instances,
// a way of telling Dagger2 what dependencies should be bundled together
@Component(modules = [WheelsModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}

