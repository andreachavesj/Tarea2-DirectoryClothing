package Vista;

import Controlador.CatalogoControlador;
import Controlador.ClienteControlador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ListarCatalogo {
    @FXML
    TextArea txtCatalogo;
    @FXML
    Button btnRegresar;
    @FXML Button btnMostrar;

    public void IrMenu(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Inicio.class.getResource("Inicio.fxml")));
        Stage window = (Stage) btnRegresar.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void listarCatalogo(ActionEvent actionEvent) {
        txtCatalogo.setText(CatalogoControlador.conjuntoCatalogo.toString());
    }
}
