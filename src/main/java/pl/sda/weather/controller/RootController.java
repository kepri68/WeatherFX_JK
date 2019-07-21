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

        String text = city.getText();

        //to poniżej wzięliśmy z poprzedniego projektu z pogodą
         // JsonDataOrg jsonDataOrg = new JsonDataOrg();
        //        jsonDataOrg.setApiKey("91977fee60544a1e88170057191407");
        //        jsonDataOrg.setUrl("http://api.apixu.com/v1/current.json");
        //        jsonDataOrg.setCity("Warszawa");
        //        jsonDataOrg.build();
        //        System.out.println(jsonDataOrg.getWeather());

        temperature.setText(text);//zmienienie tekstu "Label" po wcisnieciu przycisku "szukaj"
        System.out.println("KLIK");
    }
}
