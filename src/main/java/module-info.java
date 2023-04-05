module nyt.spellingbee {
    requires javafx.controls;
    requires javafx.fxml;

    opens nyt.spellingbee to javafx.fxml;
    exports nyt.spellingbee;
}
