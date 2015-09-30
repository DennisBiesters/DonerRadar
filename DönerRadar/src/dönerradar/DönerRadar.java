/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dönerradar;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Dennis
 */
public class DönerRadar extends Application {
    public static Stage currentStage;
    
    @Override
    public void start(Stage stage) throws IOException {
        currentStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
