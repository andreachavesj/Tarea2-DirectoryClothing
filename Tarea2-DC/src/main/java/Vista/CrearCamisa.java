package Vista;

import Controlador.CamisaControlador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class CrearCamisa {
    @FXML
    TextField txtId;
    @FXML TextField txtColor;
    @FXML TextField txtTamaño;
    @FXML TextField txtDescripcion;
    @FXML TextField txtImagen;
    @FXML TextField txtPrecio;
    @FXML
    Button btnRegresar;
    @FXML Button btnRegistrar;
    @FXML Button btnAgregarColor;
    @FXML TextField txtAgregarColor;
    @FXML
    TextArea txtColores;


    public void guardarCamisa() throws Exception {
        int id= Integer.valueOf(txtId.getText());
        int color= Integer.valueOf(txtColor.getText());
        String tamaño= txtTamaño.getText();
        String descripcion= txtDescripcion.getText();
        String imagen= txtImagen.getText();
        Double precio= Double.valueOf(txtPrecio.getText());
        if(ValidarCampos(tamaño, precio)==true&&CamisaControlador.registrarCamisa(id, color, tamaño, descripcion, imagen, precio)==true){
            mensajeExitoso();
            System.out.println(CamisaControlador.conjuntoCamisas.toString());
            limpiarCampos();
        }else{
            mensajeError();
        }
    }


    public boolean ValidarCampos(String tamaño, double precio){

        boolean completo=true;
        if(txtId== null||txtColor==null||txtTamaño== null||txtDescripcion== null||txtImagen==null||txtPrecio==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error debido a espacios en blanco");
            alert.showAndWait();
            return completo=false;
        }else if(precio<=0){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error debido a precio inferior a 0");
            alert.showAndWait();
            return completo=false;
        }else {
            return completo=true;
        }
    }

    /**
     * Funcion que muestra un mensaje exitoso cuando se registra
     * @param
     */
    public void mensajeExitoso(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Exito");
        alert.setContentText("Su registro ha sido exitoso");
        alert.showAndWait();
    }

    /**
     * Funcion que muestra un mensaje de error en caso de que no se registre
     */
    public void mensajeError(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("Ocurrio un error, verifique los datos ingresados");
        alert.showAndWait();
    }

    /**
     * Funcion que pemite ir a la ventana de crear cuenta mediante un boton
     * @param actionEvent
     * @throws IOException
     */
    public void IrMenu(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Inicio.class.getResource("Inicio.fxml")));
        Stage window = (Stage) btnRegresar.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    /**
     * Funcion que limpia los campos despues de registarse
     */
    public void limpiarCampos(){
        txtId.setText("");
        txtColor.setText("");
        txtTamaño.setText("");
        txtDescripcion.setText("");
        txtImagen.setText("");
        txtPrecio.setText("");
    }
    public void listarColores(){
        CamisaControlador.colores();
        txtColores.setText(String.valueOf(CamisaControlador.conjuntoColores));
    }
    public void agregarColor(){
        int color= Integer.parseInt(txtAgregarColor.getText());
        CamisaControlador.agregarColor(color);
    }
}
