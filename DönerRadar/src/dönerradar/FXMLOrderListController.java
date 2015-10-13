/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dönerradar;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Sven
 */
public class FXMLOrderListController implements Initializable {

    @FXML
    private Button btnMenu;
    
    @FXML
    private Button btSelectOrderList;
    
    @FXML
    private Button btDeleteOrderList;

    @FXML
    private ListView listView;

    @FXML
    private Button btAddOrderList;

    private List<String> bestellijsten = Arrays.asList("Donerdinsdaglijstje", "Zaterdagavond");
    private ObservableList<String> obsBestellijst = FXCollections.observableArrayList(bestellijsten);

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnMenu.setGraphic(new ImageView(new Image("dönerradar/images/menu.png")));

        listView.setItems(obsBestellijst); 
    }

    public void handleMenuButton() {
        try {
            Parent window1;
            window1 = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
            DönerRadar.currentStage.getScene().setRoot(window1);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void handleBtAddOrderList() {
        obsBestellijst.add("Nieuwe lijst");
    }
    
    public void handleBtSelectOrderList(){
          try {
            Parent window1;
            window1 = FXMLLoader.load(getClass().getResource("FXMLOrderListItems.fxml"));
            DönerRadar.currentStage.getScene().setRoot(window1);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void handleDeleteOrderList(){
        if (listView.getSelectionModel().getSelectedItem() != null)
        {
            obsBestellijst.remove(listView.getSelectionModel().getSelectedItem());
        }
    }
}
