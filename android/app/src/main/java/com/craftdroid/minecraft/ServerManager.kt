package com.craftdroid.minecraft

import java.io.File

class ServerManager {

    fun createServer(name: String) {

        val container = File("/data/data/com.craftdroid/containers/$name")

        if (!container.exists()) {
            container.mkdirs()
        }

        File(container, "logs").mkdirs()
        File(container, "plugins").mkdirs()
        File(container, "worlds").mkdirs()
        File(container, "server").mkdirs()
    }

    fun startPocketMine(name: String) {
        Runtime.getRuntime().exec(
            "sh scripts/start_container.sh $name"
        )
    }

    fun stopServer(process: Process) {
        process.destroy()
    }
}