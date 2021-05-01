package me.fernandesleite.dagger2traininggrounds

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horse power") private val horsePower: Int,
    @Named("engine capacity") private val engineCapacity: Int
) : Engine {

    private val TAG = "Car"
    override fun start() {
        Log.d(TAG, "Petrol engine started. Horsepower: $horsePower, Engine Capacity: $engineCapacity")
    }
}