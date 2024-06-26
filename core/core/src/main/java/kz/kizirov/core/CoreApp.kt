package kz.kizirov.core

import android.app.Application
import io.paperdb.Paper

abstract class CoreApp: Application() {

    override fun onCreate() {
        super.onCreate()

        Paper.init(applicationContext)
    }

    companion object {
        fun logOut(isAuth: Boolean) {

        }
    }
}