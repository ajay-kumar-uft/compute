package com.ext.compute.ui

import android.content.Context
import androidx.startup.Initializer
import com.exe.engine.ContourEngine

class ComputeInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        ContourEngine.register(ComputeEngine())
    }

    override fun dependencies() = emptyList<Class<out Initializer<*>>>()
}