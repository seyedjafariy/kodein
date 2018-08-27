package com.worldsnas.kodeinsample

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.instance

class App :Application(), KodeinAware{

    private val logger by instance<Logger>()

    override val kodein = Kodein.lazy{
        import(appModule(applicationContext))
    }

    override fun onCreate() {
        super.onCreate()
        logger.log("tag", Logger.Level.Error, "first injection")
    }

}