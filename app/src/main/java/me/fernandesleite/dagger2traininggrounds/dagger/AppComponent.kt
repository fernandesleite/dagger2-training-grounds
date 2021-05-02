package me.fernandesleite.dagger2traininggrounds.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    //    fun getActivityComponentBuilder(): ActivityComponent.Builder
    fun getActivityComponentFactory(): ActivityComponent.Factory

    /**
     * Component factories are compile-time safe and more
     * concise alternatives to component builders
     * for passing values to the dependency graph at runtime.
     */
    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }
}