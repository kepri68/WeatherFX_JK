package pl.sda.weather.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.plaf.basic.BasicButtonUI;

public class RootController {

    //tworzymy teraz pole typu textField z controll:

    @FXML
    private TextField city;//city bo taką nazwę identyfikatora podaliśmy w root.fxml

    @FXML
    private Button find;

    @FXML
    private Label temperature;


    public void getWeather(ActionEvent actionEvent) {

        temperature.setText("Nowa wartosc");//zmienienie tekstu "Label" po wcisnieciu przycisku "szukaj"
        System.out.println("KLIK");
    }
}
