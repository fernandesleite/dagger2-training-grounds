package me.fernandesleite.dagger2traininggrounds

import android.util.Log
import javax.inject.Inject

// @Inject annotate the constructor that Dagger should use to create instances of a class
// Constructor injection: Defining the list of required dependencies as parameters to the class's constructor
class Car @Inject constructor(private val engine: Engine, private val wheels: Wheels) {
    private val TAG: String = "Car"

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive(){
        engine.start()
        Log.d(TAG, "driving...")
    }
}
