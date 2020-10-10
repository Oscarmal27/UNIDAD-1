package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.regex.Pattern;

public class Controller {
    @FXML TextField txtFrase;
    @FXML Label lblResultado;
    @FXML ComboBox comboBox;

    @FXML protected void initialize(){
        comboBox.getItems().addAll("CharAt", "CompareTo", "EqualsIgnoreCase", "IndexOf", "LastIndexOf", "Replace", "ReplaceFirst", "Split", "Startwith", "Substring");

    }
    public void evento (ActionEvent event){
        String texto=txtFrase.getText();
        switch (comboBox.getSelectionModel().getSelectedIndex()){
            case 0:{
                char res=texto.charAt(2);
                lblResultado.setText(res+"");
                break;
            }
            case 1:{
                int res =texto.compareTo("Hola");
                lblResultado.setText(res+"");
                break;
            }
            case 2:{
                Boolean res=texto.equalsIgnoreCase("gato");
                lblResultado.setText(res+"");
                break;
            }
            case 3:{
                int res=texto.indexOf("a");
                lblResultado.setText((1+res)+"");
                break;
            }
            case 4:{
                int res=texto.lastIndexOf("c");
                lblResultado.setText((1+res)+"");
                break;
            }
            case 5:{
                String res=texto.replace("o", "Parangaricutirimicuaro");
                lblResultado.setText(res+"");
                break;
            }
            case 6:{
                String res=texto.replaceFirst("e","Pajaro Caripocápote");
                lblResultado.setText(res+"");
                break;
            }
            case 7:{
                String separador = Pattern.quote("-");
                String[] res=texto.split(separador);
                String part1=res[0];
                lblResultado.setText(part1+"");
                break;
            }
            case 8:{
                Boolean res=texto.startsWith("La");
                lblResultado.setText(res+"");
                break;
            }
            case 9:{
                String res=texto.substring(0,10);
                lblResultado.setText(res+"");
                break;
            }
        }
    }
}
