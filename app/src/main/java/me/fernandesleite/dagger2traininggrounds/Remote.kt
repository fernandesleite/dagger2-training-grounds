package me.fernandesleite.dagger2traininggrounds

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){
    private val TAG: String = "Car"

    /** Method injection* is when Dagger calls an @Inject-annotated method on a class. **/
    fun setListener(car: Car) {
        Log.d(TAG, "Remote connected")
    }
}