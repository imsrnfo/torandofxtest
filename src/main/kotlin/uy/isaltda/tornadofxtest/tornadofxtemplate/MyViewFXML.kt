package uy.isaltda.tornadofxtest.tornadofxtemplate

import javafx.scene.layout.GridPane
import tornadofx.*

class MyViewFXML: View() {
    override val root : GridPane by fxml("/tornadofxtemplatesfxml/sample.fxml")

    fun accionBoton(){
        println("Boton clickeado")
    }

}