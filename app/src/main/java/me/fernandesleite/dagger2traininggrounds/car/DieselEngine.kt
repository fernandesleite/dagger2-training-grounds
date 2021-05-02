package me.fernandesleite.dagger2traininggrounds.car

import android.util.Log

class DieselEngine constructor(private val horsePower: Int) : Engine {
    /**
     * Since we want to inject variables into our dependency graph at run time
     * we create @Provide with the constructor to the module
     * and pass the parameter set it on the Component builder
     */
    private val TAG = "Car"
    override fun start() {
        Log.d(TAG, "Diesel engine started. Horsepower: $horsePower")
    }
}