package me.fernandesleite.dagger2traininggrounds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    /**
     * Field Injection: when Dagger sets an @Inject annotated field on a class
     * Use case: Injecting objects Dagger can't create, like mainActivity
     */

    @Inject lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Create Component **/
        val component: CarComponent = DaggerCarComponent.builder().dieselEngineModule(DieselEngineModule(100)).build()

        /** inject is a void method that take a parameter of a specific type **/
        component.inject(this)

        // car = component.getCar()
        car.drive()
    }
}