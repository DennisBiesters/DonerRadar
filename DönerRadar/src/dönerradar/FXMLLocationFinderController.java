/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dönerradar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jordy
 */
public class FXMLLocationFinderController implements Initializable {

    
    @FXML
    private Button btnSearch;
    
    @FXML
    private Label lblTitle;
    
    @FXML
    private Label lblPostcode;
    
    @FXML
    private TextField tbPostcode;
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }    
    
    public void handleButton() throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("FXMLRestaurants.fxml"));
        DönerRadar.currentStage.getScene().setRoot(p);
    }
    
    public void handleMenuButton(){
        try {
            Parent window1;
            window1 = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
            DönerRadar.currentStage.getScene().setRoot(window1);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
