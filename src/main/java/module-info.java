module com.project.gamecatalogue {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.gamecatalogue to javafx.fxml;
    exports com.project.gamecatalogue;
}