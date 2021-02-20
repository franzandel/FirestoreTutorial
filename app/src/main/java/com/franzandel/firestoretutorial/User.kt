package com.franzandel.firestoretutorial

/**
 * Created by Franz Andel on 20/02/21.
 * Android Engineer
 */

// Variable name should be exactly the same as Key in Map
data class User(
    val firsta: String,
    val middle: String,
    val last: String,
    val born: Int,
    val address: String
)