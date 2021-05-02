package me.fernandesleite.dagger2traininggrounds.dagger

import dagger.BindsInstance
import dagger.Subcomponent
import me.fernandesleite.dagger2traininggrounds.MainActivity
import me.fernandesleite.dagger2traininggrounds.car.Car
import javax.inject.Named


/**
 * To connect two components of different scopes, declare the outer component as a dependency
 * of the inner component and pass it as a Builder argument
 */

/**
 * Subcomponents are an alternative to component dependencies for connecting multiple components
 * and applying different scopes.
 * A Subcomponent is generated as a non-static inner class of its parent component
 * and this way can access its whole object graph.
 */

@PerActivity
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    /**
     * Subcomponent builders follow the same rules as normal component builders
     * but can be returned from a parent component as an alternative
     * to subcomponent factory methods.
     */
//    @Subcomponent.Builder
//    interface Builder {
//        @BindsInstance
//        fun horsePower(@Named("horse power") horsePower: Int): Builder
//
//        @BindsInstance
//        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder
//
//        fun build(): ActivityComponent
//    }

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("horse power") horsePower: Int,
            @BindsInstance @Named("engine capacity") engineCapacity: Int
        ) : ActivityComponent
    }
}