package me.fernandesleite.dagger2traininggrounds.car

import android.util.Log

class Tires {
    // Simulation: we don't own this class, can't @Inject

    private val TAG = "Car"
    fun inflate() {
        Log.d(TAG, "Tires inflated")
    }
}