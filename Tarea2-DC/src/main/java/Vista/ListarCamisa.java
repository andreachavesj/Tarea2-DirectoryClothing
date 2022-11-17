package Vista;

import Controlador.CamisaControlador;
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

public class ListarCamisa {
    @FXML
    Button btnRegresar;
    @FXML Button btnListarCamisas;
    @FXML
    TextArea txtCamisas;
    public void IrMenu(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Inicio.class.getResource("Inicio.fxml")));
        Stage window = (Stage) btnRegresar.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void listarClientes(ActionEvent actionEvent) {
        txtCamisas.setText(CamisaControlador.conjuntoCamisas.toString());
    }
}
