package com.worldsnas.kodeinsample

import android.content.Context
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

fun appModule(context: Context) = Kodein.Module {

    bind<Logger>() with singleton { AndroidLogger() }
}