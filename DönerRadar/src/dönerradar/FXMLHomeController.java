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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Dennis
 */
public class FXMLHomeController implements Initializable {

    @FXML
    private Button btnMenu;
    
    @FXML
    private ImageView imgView;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnMenu.setGraphic(new ImageView(new Image("dönerradar/images/menu.png")));
        imgView.setImage(new Image("dönerradar/images/doner.jpg"));
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
    
    public void handleSearchButton(){
        try {
            Parent window1;
            window1 = FXMLLoader.load(getClass().getResource("FXMLLocationFinder.fxml"));
            DönerRadar.currentStage.getScene().setRoot(window1);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
