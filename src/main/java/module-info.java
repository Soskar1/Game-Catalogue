module com.project.gamecatalogue {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.gamecatalogue to javafx.fxml;
    exports com.project.gamecatalogue;
    exports com.project.gamecatalogue.games;
    opens com.project.gamecatalogue.games to javafx.fxml;
}