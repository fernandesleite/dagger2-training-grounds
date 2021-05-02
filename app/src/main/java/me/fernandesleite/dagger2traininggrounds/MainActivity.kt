package me.fernandesleite.dagger2traininggrounds

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.fernandesleite.dagger2traininggrounds.car.Car
import me.fernandesleite.dagger2traininggrounds.dagger.ActivityComponent
import me.fernandesleite.dagger2traininggrounds.dagger.DaggerActivityComponent
import me.fernandesleite.dagger2traininggrounds.dagger.ExampleApp
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    /**
     * Field Injection: when Dagger sets an @Inject annotated field on a class
     * Use case: Injecting objects Dagger can't create, like mainActivity
     */

    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: ActivityComponent = DaggerActivityComponent.builder()
            .horsePower(120)
            .engineCapacity(1400)
            .appComponent((application as ExampleApp).getAppComponent())
            .build()
        component.inject(this)
        car1.drive()
        car2.drive()

        /** Create Component **/
//        val component: CarComponent =
//            DaggerCarComponent.builder().horsePower(100).engineCapacity(250).build()
//
//        val component: ActivityComponent = Dagger
//
//        /** inject is a void method that take a parameter of a specific type **/
//        component.inject(this)
//
//        // car = component.getCar()
//        car1.drive()
//        car2.drive()
    }
}