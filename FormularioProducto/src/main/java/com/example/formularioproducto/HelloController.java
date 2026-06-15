package com.example.formularioproducto;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.TextField;


public class HelloController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField passContra;

    @FXML
    private ComboBox<String> cmbselect;

    @FXML
    private void ingresar() {

        String usuario = txtUsuario.getText();
        String pass = passContra.getText();
        String rol = cmbselect.getValue();

        try {
            FXMLLoader loader = null;

            if (usuario.equals("admi") && pass.equals("1234") && rol.equals("Administrador")) {
                loader = new FXMLLoader(getClass().getResource("/com/example/formularioproducto/Administrador.fxml"));

            } else if (usuario.equals("cajero") && pass.equals("1234") && rol.equals("Vendedor")) {
                loader = new FXMLLoader(getClass().getResource("/com/example/formularioproducto/Vendedor.fxml"));

            } else if (usuario.equals("cajero") && pass.equals("1234") && rol.equals("Cajero")) {
                loader = new FXMLLoader(getClass().getResource("/com/example/formularioproducto/Cajero.fxml"));
            }

            Stage stage = (Stage) txtUsuario.getScene().getWindow();
            stage.setScene(new Scene(loader.load()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

