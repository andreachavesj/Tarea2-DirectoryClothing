package Vista;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Menu {
    @FXML
    Button btnRegistrarCliente;
    @FXML Button btnListarCliente;
    @FXML Button btnRegistrarCamisa;
    @FXML Button btnListarCamisa;
    @FXML Button btnRegistrarCatalogo;
    @FXML Button btnListarCatalogo;

    public void IrCrearCliente(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Inicio.class.getResource("CrearCliente.fxml")));
        Stage window = (Stage) btnRegistrarCliente.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    public void IrListarCliente(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Inicio.class.getResource("ListarClientes.fxml")));
        Stage window = (Stage) btnListarCliente.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    public void IrCrearCamisa(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Inicio.class.getResource("CrearCamisa.fxml")));
        Stage window = (Stage) btnRegistrarCamisa.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    public void IrListarCamisa(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Inicio.class.getResource("ListarCamisa.fxml")));
        Stage window = (Stage) btnListarCamisa.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    public void IrCrearCatalogo(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Inicio.class.getResource("CrearCatalogo.fxml")));
        Stage window = (Stage) btnRegistrarCatalogo.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
