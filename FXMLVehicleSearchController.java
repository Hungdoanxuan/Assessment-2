package vehicleregistrationfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.IOException;

public class FXMLVehicleSearchController {

    final static int MENU = 0;

    // Declare instance variables corresponding to the UI controls placed on the scene 
    // Action event handler for the Submit button on the Private Owner tab
    @FXML
    private void handleButtonOwnerPrivateSearchAction(ActionEvent event) throws Exception {
        System.out.println("You submitted private owner ID!");
        // TODO -- Write code to read owner ID and search for the owner
        // Display owner details if found, otherwise display an error message
        Alert alert = new Alert(Alert.AlertType.ERROR, "No record found!!!");
        alert.showAndWait();

    }

    //Action event handler for the Exit button on the Private Owner tab
    @FXML
    private void handleButtonOwnerPrivateExitAction(ActionEvent event) throws Exception {
        System.out.println("You pressed the Exit button!");
        //Go back to the menu scene
        try {
            App.setRoot("FXMLMenu");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    //Action event handler for the Submit button on the Corporate Owner tab
    @FXML
    private void handleButtonOwnerCorpSearchAction(ActionEvent event) throws Exception {
        System.out.println("You submitted corporate owner ABN!");
        // TODO -- Write code to read owner ABN and search for the owner
        // Display owner details if found, otherwise display an error message
        Alert alert = new Alert(Alert.AlertType.ERROR, "No record found!!!");
        alert.showAndWait();

    }

    //Action event handler for the Exit button on the Corporate Owner tab
    @FXML
    private void handleButtonOwnerCorpExitAction(ActionEvent event) throws Exception {
        System.out.println("You pressed the Exit button");
        //Go back to the menu scene
        try {
            App.setRoot("FXMLMenu");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
