package Controlador;

import Modelo.Cliente;
import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClienteControlador {
    public static ArrayList<Cliente> conjuntoClientes=new ArrayList<>();
    public static ArrayList<String> conjuntoCedulas=new ArrayList<>();
    public static boolean validarEmail(String email){
        Pattern Correo =null;
        Matcher ResultadoCorreo=null;

        Correo=Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");

        ResultadoCorreo= Correo.matcher(email);

        if(ResultadoCorreo.find()==false){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Incorrecto");
            alert.setContentText("El formato de correo ingresado no es permitido");
            alert.showAndWait();
            return false;
        }else{
            return true;
        }

    }

    public static boolean registrarCliente(String nombre, String apellido1, String apellido2, String cedula, String direccion, String email) {
        boolean cedulaRepetida=false;
        for (int i=0;i<conjuntoCedulas.size();i++){
            if (cedula.equals(conjuntoCedulas.get(i))){
                cedulaRepetida=true;
                break;
            }
        }
        if(cedulaRepetida==false){
            Cliente cliente = new Cliente(nombre, apellido1,apellido2,cedula, direccion, email);
            conjuntoClientes.add(cliente);
            conjuntoCedulas.add(cliente.getCedula());
            return true;
        }else{
            return false;
        }
    }
}
