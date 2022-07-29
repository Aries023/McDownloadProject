package com.example.mcdownload;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void fritezaButt() {
        welcomeText.setText("friteza");
    }
    @FXML
    protected void iniciatorButt() {
        welcomeText.setText("iniciator");
    }
    @FXML
    protected void assemblerButt() {
        welcomeText.setText("assembler");
    }
    @FXML
    protected void finisherButt() {
        welcomeText.setText("finisher");
    }
    @FXML
    protected void grillButt() {
        welcomeText.setText("grill");
    }
}