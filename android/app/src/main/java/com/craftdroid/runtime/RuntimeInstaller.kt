package com.craftdroid.runtime

import java.io.File

class RuntimeInstaller {

    fun installUbuntu(root: String) {

        val runtimeDir = File(root)

        if (!runtimeDir.exists()) {
            runtimeDir.mkdirs()
        }

        File(runtimeDir, "rootfs").mkdirs()
        File(runtimeDir, "tmp").mkdirs()
        File(runtimeDir, "home").mkdirs()
    }
}