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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author jordy
 */
public class FXMLRestaurantsController implements Initializable {

    
    @FXML
    Label lblAddress01;
    
    @FXML
    Label lblAddress02;
    
    @FXML
    Label lblTitle;
    
    @FXML
    ImageView iviewNavi;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        iviewNavi.setImage(new Image("dönerradar/images/navi.PNG"));
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
