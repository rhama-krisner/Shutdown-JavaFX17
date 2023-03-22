module application.desligaautomatico {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.desligaautomatico to javafx.fxml;
    exports application.desligaautomatico;
}