/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dönerradar;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Jelle
 */
public class FXMLNamePickerController implements Initializable {

    @FXML
    private Button btnMenu;
    
    @FXML
    private TextField tfDeelnemerNaam;
    
    @FXML
    private ListView lvDeelnemers;
    
    private ObservableList<String> deelnemers;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnMenu.setGraphic(new ImageView(new Image("dönerradar/images/menu.png")));
        deelnemers = FXCollections.observableArrayList("Dennis", "Jordy", "Sven", "Jelle");
        lvDeelnemers.setItems(deelnemers);
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
        
    public void addDeelnemer()
    {
        if (!tfDeelnemerNaam.getText().isEmpty())
        {
            deelnemers.add(tfDeelnemerNaam.getText());
            tfDeelnemerNaam.clear();
        }  
    }
    
    public void selectRandomPerson()
    {
        Random rand = new Random();
        int index = rand.nextInt(deelnemers.size());
        JOptionPane.showMessageDialog(null, deelnemers.get(index));
    }
    
    
}
