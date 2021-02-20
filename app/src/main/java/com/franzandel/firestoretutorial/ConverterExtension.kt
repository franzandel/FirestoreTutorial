package com.franzandel.firestoretutorial

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

// convert a data class to a map
fun <DC> DC.serializeToMap(): Map<String, Any> {
    return convert()
}

// convert a map to a data class
inline fun <reified DC> Map<String, Any>.toDataClass(): DC {
    return convert()
}

// convert an object of type J(son) to type D(ata)C(lass)
inline fun <J, reified DC> J.convert(): DC {
    val gson = Gson()
    val json = gson.toJson(this)
    return gson.fromJson(json, object : TypeToken<DC>() {}.type)
}
 