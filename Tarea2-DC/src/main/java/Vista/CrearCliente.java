package Vista;

import Controlador.ClienteControlador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.Buffer;
import java.util.Objects;

public class CrearCliente {
    @FXML TextField txtNombre;
    @FXML TextField txtApellido1;
    @FXML TextField txtApellido2;
    @FXML TextField txtCedula;
    @FXML TextField txtDireccion;
    @FXML TextField txtEmail;
    @FXML Button btnRegresar;
    @FXML Button btnRegistrar;

    public void guardarDatos() throws Exception {
        String nombre=txtNombre.getText();
        String apellido1=txtApellido1.getText();
        String apellido2= txtApellido2.getText();
        String cedula= txtCedula.getText();
        String direccion= txtDireccion.getText();
        String email= txtEmail.getText();
        if(ClienteControlador.registrarCliente(nombre,apellido1, apellido2,cedula, direccion, email)==true && ValidarCampos(nombre,apellido1, apellido2,cedula, direccion, email)==true){
            mensajeExitoso();
        }else{
            mensajeCedulaExistente();
        }

    }

    public boolean ValidarCampos( String nombre, String apellido1, String apellido2,String identificacion, String direccion, String email){
        boolean completo=true;
        if(nombre.isEmpty()||apellido1.isEmpty()||apellido2.isEmpty()|| identificacion.isEmpty() || direccion.isEmpty()||email.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error debido a espacios en blanco");
            alert.showAndWait();
            return completo=false;
        } else if(ClienteControlador.validarEmail(email)==false){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error debido a formato de email");
            alert.showAndWait();
            return completo=false;
        } else{
            limpiarCampos();
            return completo=true;

        }
    }

    public void mensajeCedulaExistente(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("Ha ocurrido un erorr por espacios en blanco o cédula repetida");
        alert.showAndWait();
    }

    public void mensajeExitoso(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Exito");
        alert.setContentText("Su registro ha sido exitoso");
        alert.showAndWait();
    }
    public void IrMenu(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Inicio.class.getResource("Inicio.fxml")));
        Stage window = (Stage) btnRegresar.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    public void limpiarCampos(){
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        txtCedula.setText("");
        txtDireccion.setText("");
        txtCedula.setText("");
    }
}
