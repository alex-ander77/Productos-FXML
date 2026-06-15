module com.example.formularioproducto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.formularioproducto to javafx.fxml;
    exports com.example.formularioproducto;
}