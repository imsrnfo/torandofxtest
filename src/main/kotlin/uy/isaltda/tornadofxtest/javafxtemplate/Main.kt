package uy.isaltda.tornadofxtest.javafxtemplate

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

fun main (args : Array<String>){
    Application.launch(Main::class.java)
}

class Main : Application() {

    override fun start(primaryStage: Stage?) {
        val url = javaClass.classLoader.getResource("javafxtemplatesfxml/sample.fxml")
        val root = FXMLLoader.load<Parent>(url!!)
        primaryStage?.title = "Hello World"
        primaryStage?.scene = Scene(root, 1240.0, 640.0)
        primaryStage?.show()
    }

}