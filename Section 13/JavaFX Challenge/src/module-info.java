module JavaFX.Challenge {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.xml;

    opens sample.datamodel to javafx.base;
    opens sample to javafx.fxml;

    exports sample to javafx.graphics;
}