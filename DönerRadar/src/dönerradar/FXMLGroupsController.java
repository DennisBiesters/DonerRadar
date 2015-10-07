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
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Jelle
 */
public class FXMLGroupsController implements Initializable {

    @FXML
    private Button btnMenu;

    @FXML
    private TreeView tvGroups;

    @FXML
    private TextField tfGroupName;

    private TreeItem<String> root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btnMenu.setGraphic(new ImageView(new Image("dönerradar/images/menu.png")));
        root = new TreeItem<>("Groepen");
        root.setExpanded(true);
        tvGroups.setRoot(root);
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

    public void addGroup() {
        if (!tfGroupName.getText().isEmpty()) {
            if (tvGroups.getSelectionModel().getSelectedItem() == null) {
                TreeItem<String> newGroup = new TreeItem<>(tfGroupName.getText());
                newGroup.setExpanded(true);
                root.getChildren().add(newGroup);
            }
            else {
                TreeItem<String> selectedItem = (TreeItem<String>) tvGroups.getSelectionModel().getSelectedItem();
                TreeItem<String> newMember = new TreeItem<>(tfGroupName.getText());
                newMember.setExpanded(true);
                selectedItem.getChildren().add(newMember);
            }
        }
    }

}
