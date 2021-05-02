package me.fernandesleite.dagger2traininggrounds.dagger

import dagger.BindsInstance
import dagger.Component
import me.fernandesleite.dagger2traininggrounds.MainActivity
import me.fernandesleite.dagger2traininggrounds.car.Car
import javax.inject.Named


/**
 * To connect two components of different scopes, declare the outer component as a dependency
 * of the inner component and pass it as a Builder argument
 */
@PerActivity
@Component(dependencies = [AppComponent::class], modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        fun appComponent(component: AppComponent): Builder

        fun build(): ActivityComponent
    }
}