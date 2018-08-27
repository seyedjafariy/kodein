package com.worldsnas.kodeinsample

interface Logger{
    fun log(tag : String , level : Level = Level.Verbose, message : String)

    sealed class Level {
        object Verbose : Level()
        object Info : Level()
        object Debug : Level()
        object Warning : Level()
        object Error : Level()

    }
}