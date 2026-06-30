package com.ext.compute.ui

import com.exe.engine.Engine
import org.opencv.core.Mat

class ComputeEngine : Engine {

    companion object {
        init {
            System.loadLibrary("opencv_java4")
        }
    }

    override fun process() {
        println("---- Processing using OpenCV")
        val mat = Mat()
        mat.size()
    }
}