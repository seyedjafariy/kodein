package com.worldsnas.kodeinsample

import android.util.Log

class AndroidLogger : Logger{
    override fun log(tag: String, level: Logger.Level, message: String) {
        when(level){
            Logger.Level.Verbose -> Log.v(tag, message)
            Logger.Level.Debug -> Log.d(tag, message)
            Logger.Level.Info -> Log.i(tag, message)
            Logger.Level.Warning -> Log.w(tag, message)
            Logger.Level.Error -> Log.e(tag, message)


        }
    }
}