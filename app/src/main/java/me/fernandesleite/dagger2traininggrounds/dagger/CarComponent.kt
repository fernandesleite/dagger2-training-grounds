//package me.fernandesleite.dagger2traininggrounds.dagger
//
//import dagger.BindsInstance
//import dagger.Component
//import me.fernandesleite.dagger2traininggrounds.MainActivity
//import me.fernandesleite.dagger2traininggrounds.car.Car
//import javax.inject.Named
//import javax.inject.Singleton
//
//// The interface that will generate Car instances,
//// a way of telling Dagger2 what dependencies should be bundled together
//@Singleton
//@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
//interface CarComponent {
//    fun getCar(): Car
//
//    fun inject(mainActivity: MainActivity)
//
//    /**
//     * @BindsInstance must be declared inside @Component.Builder
//     * **/
//    @Component.Builder
//    interface Builder {
//        /**
//         * @BindsInstance to bind variables to our dependency
//         * graph at runtime as an alternative to
//         * providing them from a stateful module.
//         * **/
//        @BindsInstance
//        fun horsePower(@Named("horse power") horsePower: Int): Builder
//        /**
//         * To distinguish between multiple bindings from the same type,
//         * we will use the @Named qualifier.
//         * **/
//        @BindsInstance
//        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder
//
//        fun build(): CarComponent
//    }
//}
//
