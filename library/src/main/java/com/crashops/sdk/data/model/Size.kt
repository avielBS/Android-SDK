package com.crashops.sdk.data.model

import org.json.JSONObject

class Size(val width: Int, val height: Int) {
    override fun toString(): String {
        return "($width x $height)"
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Size) return false
        if (other.width != width) return false
        if (other.height != height) return false

        return true
    }

    override fun hashCode(): Int {
        return toString().hashCode()
    }
}

class Position(val x: Float, val y: Float) {
    override fun toString(): String {
        return "($x x $y)"
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Position) return false
        if (other.x != x) return false
        if (other.y != y) return false

        return true
    }

    override fun hashCode(): Int {
        return toString().hashCode()
    }
}


internal fun Size.toJson(): JSONObject {
    return JSONObject()
            .put("width", width)
            .put("height", height)
}

internal fun Position.toJson(): JSONObject {
    return JSONObject()
            .put("x", x.toInt())
            .put("y", y.toInt())
}
