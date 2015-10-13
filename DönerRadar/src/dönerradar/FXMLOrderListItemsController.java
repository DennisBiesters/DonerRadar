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
public class FXMLOrderListItemsController implements Initializable {

    @FXML
    private Button btnMenu;

    @FXML
    private ListView listView;

    @FXML
    private Button btAddProduct;

    private List<String> productList = Arrays.asList("Durum doner", "Durum kip", "Pizza kebab");
    private ObservableList<String> obsProductList = FXCollections.observableArrayList(productList);

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnMenu.setGraphic(new ImageView(new Image("dönerradar/images/menu.png")));

        listView.setItems(obsProductList);
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {

            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {

            }
        });

    }

    public void handleMenuButton() {
        try {
            Parent window1;
            window1 = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
            DönerRadar.currentStage.getScene().setRoot(window1);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void handleBackButton() {
        try {
            Parent window1;
            window1 = FXMLLoader.load(getClass().getResource("FXMLOrderList.fxml"));
            DönerRadar.currentStage.getScene().setRoot(window1);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void handleBtAddProduct() {
        obsProductList.add("Turkse pizza");
    }

}
