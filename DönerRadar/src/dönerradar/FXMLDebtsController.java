/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dönerradar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
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

/**
 * FXML Controller class
 *
 * @author Dennis
 */
public class FXMLDebtsController implements Initializable {

    @FXML
    private Button btnMenu;
    
    @FXML
    private ListView lvPersonWithDebts;
    
    @FXML
    private TextField tbAddDebt;
    
    private ObservableList<String> personsWithDebt;
    
    /**
     * Initializes the controller class.
     */  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnMenu.setGraphic(new ImageView(new Image("dönerradar/images/menu.png")));
        personsWithDebt = FXCollections.observableArrayList("Dennis €5,-", "Jordy €10,-", "Sven €13,-", "Jelle €133,-");
        lvPersonWithDebts.setItems(personsWithDebt);
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
    
    public void handleAddButton(){
        if(!(tbAddDebt.getText().isEmpty())){
            personsWithDebt.add(tbAddDebt.getText());
            tbAddDebt.clear();
        }
    }
}
