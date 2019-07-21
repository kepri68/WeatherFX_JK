package pl.sda.weather;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application{

    public static void main( String[] args ){
    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //załadowanie naszego pliku root.fxml
        Parent root =
                FXMLLoader.load(
                        getClass()
                                .getResource("/root.fxml"));
        //^ służy do załadowania widoku - za każdym razem tak samo musimy zrobić

        //teraz na obiekcie Stage musimy wstawić scenę z widokiem xmlowym:
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
