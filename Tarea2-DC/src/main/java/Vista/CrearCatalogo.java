package Vista;

import Controlador.CatalogoControlador;
import Controlador.ClienteControlador;
import Modelo.Catalogo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class CrearCatalogo {
    @FXML
    Button btnMostrar;
    @FXML Button btnAgregar;
    @FXML
    TextArea txtCamisas;
    @FXML
    TextField txtCamisaAgregar;
    @FXML Button btnRegresar;

    public void guardarDatos() throws Exception {
        CatalogoControlador.registrarCatalago();
        mensajeExitoso();
        limpiarCampos();
        System.out.println(CatalogoControlador.conjuntoCatalogo.toString());
    }


    public void mensajeError(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("Ha ocurrido un erorr");
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
        txtCamisaAgregar.setText("");
    }
    public void agregarCamisa(){
        int camisa= Integer.parseInt(txtCamisaAgregar.getText());
        CatalogoControlador.registrarCamisa(camisa);
        txtCamisas.setText("");
    }
    public void mostrarDatos(){
        txtCamisas.setText(String.valueOf(CatalogoControlador.conjuntoCamisas));
    }
}

