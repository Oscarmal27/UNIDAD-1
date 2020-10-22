package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Controller {
    @FXML TextArea txtReceta, txtIngre, txtProce, txtPconr;

    @FXML protected void initialize(){
        try {
            File f=new File("./src/sample/Receta.txt");
            BufferedReader br=new BufferedReader((new FileReader(f)));
            String texto="";
            while ((texto=br.readLine())!=null){
                txtReceta.appendText("\n"+texto);
            }//while
        }catch (Exception e){
            txtReceta.setText(e.getMessage());
        }//catch
    }//llave initialize

    public void procesar (ActionEvent event){
        String[] arregloLineas= txtReceta.getText().split("\n");
        boolean encontro=false;
        for (int x=0; x<arregloLineas.length;x++) {
            if (encontro){
                txtIngre.setText(arregloLineas[x]);
            }
            if (arregloLineas[x].contains("-------")){
                encontro=true;
            }
        }//llave for
    }//llave procesar
}//llave Controller