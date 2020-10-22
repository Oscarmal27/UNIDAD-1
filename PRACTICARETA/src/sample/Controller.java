package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Controller {
    @FXML TextArea txtReceta, txtIngre, txtProce, txtPconr;
    //String texto="";

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
        int ancho=0;
        int guajillo=0;
        int pasilla=0;
        for (int x=0;x<arregloLineas.length;x++) {
            if (x==4){
                String[] arrAncho=arregloLineas[x].split(" ");
                ancho= Integer.parseInt(arrAncho[0]);
            }
            if (x==5){
                String[] arrGuajillo=arregloLineas[x].split(" ");
                guajillo= Integer.parseInt(arrGuajillo[0]);
            }
            if (x==6){
                String[] arrpasilla=arregloLineas[x].split(" ");
                pasilla= Integer.parseInt(arrpasilla[0]);
            }
            txtIngre.setText(arregloLineas[3]+"\n"+arregloLineas[4]+"\n"+arregloLineas[5]+
                    "\n"+arregloLineas[7]+"\n"+arregloLineas[8]+"\n"+arregloLineas[9]+"\n"+arregloLineas[10]+
                    "\n"+arregloLineas[11]+"\n"+arregloLineas[12]+"\n"+arregloLineas[13]+"\n"+arregloLineas[14]+
                    "\n"+arregloLineas[15]+"\n"+arregloLineas[16]+"\n"+arregloLineas[17]);
            txtProce.setText(arregloLineas[20]+"\n"+arregloLineas[21]+"\n"+arregloLineas[23]+
                    "\n"+arregloLineas[25]+"\n"+arregloLineas[27]+"\n"+arregloLineas[29]+"\n"+arregloLineas[31]);
            txtPconr.setText(arregloLineas[34]+"\n"+ (ancho+guajillo+pasilla) +" gramos"+"\n"+" "+"\n"+arregloLineas[35]+"\n"+arregloLineas[25]+
                    "\n"+" "+"\n"+arregloLineas[36]+"\n"+arregloLineas[7]+"\n"+arregloLineas[8]+"\n"+arregloLineas[14]+"\n"+" "+"\n"+arregloLineas[37]+"\n"+" ");
        }//llave for
    }//llave procesar
}//llave Controller