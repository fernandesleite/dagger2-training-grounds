package me.fernandesleite.dagger2traininggrounds

import javax.inject.Inject

class Wheels constructor(private val rims: Rims, private val tires: Tires){
    // Simulation: we don't own this class, can't @Inject

}