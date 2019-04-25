package uy.isaltda.tornadofxtest.tornadofxtemplate

import tornadofx.*
import uy.isaltda.tornadofxtest.tornadofxtemplate.views.WelcomeScreen

fun main(args: Array<String>) {
    launch<MyApp>(args)
}

//elegir con que vista va a comenzar
class MyApp: App(WelcomeScreen/*MyViewFXML*/::class)