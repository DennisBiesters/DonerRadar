/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dönerradar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

/**
 * FXML Controller class
 *
 * @author Dennis
 */
public class FXMLMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void handleHomeButton() {
        try {
            Parent window1;
            window1 = FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));
            DönerRadar.currentStage.getScene().setRoot(window1);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void handleNameChooserButton() {
        try {
            Parent window1;
            window1 = FXMLLoader.load(getClass().getResource("FXMLNamePicker.fxml"));
            DönerRadar.currentStage.getScene().setRoot(window1);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
        public void handleOrderListButton() {
        try {
            Parent window1;
            window1 = FXMLLoader.load(getClass().getResource("FXMLOrderList.fxml"));
            DönerRadar.currentStage.getScene().setRoot(window1);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
