package vehicleregistrationfx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FXMLOwnerRecordController {

    @FXML
    private TextField enterName;
    @FXML
    private TextField enterAddress;
    @FXML
    private TextField enterPhoneNo;
    @FXML
    private TextField enterOwnerID;
    @FXML
    private TextField enterDateBirth;

    
    
    // Declare instance variables corresponding to the UI controls placed the scene 
    
    //Action event handler for the Submit button on the Private Owner tab
    @FXML
    private void handleButtonOwnerPrivateSubmitAction (ActionEvent event) throws Exception  {
        PrivateOwner OP = new PrivateOwner(enterName.getText(), enterAddress.getText(), enterPhoneNo.getText(), Integer.parseInt(enterOwnerID.getText()), enterDateBirth.getText());
        List<PrivateOwner> ownerprivate = new ArrayList<>();
                ownerprivate.add(OP);
        for (PrivateOwner owner : ownerprivate)
              { RecordFile recordFile = new RecordFile();
            recordFile.writeToFile(owner);
            System.out.println(owner.toString());

        }


                
              
        
        // TODO -- Write code to capture the private owner details, crete an Owner object, append the object to the Owner ArrayList
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Owner record inserted!");
        alert.showAndWait();
        
        
    }
    
    //Action event handler for the Exit button on the Private Owner tab
    @FXML
    private void handleButtonOwnerPrivateExitAction (ActionEvent event) throws Exception  {
        System.out.println("You pressed the Exit button!");
        // Go back to the menu scene
        try {
            App.setRoot("FXMLMenu");
        } catch (IOException e){
           System.out.println(e); 
        }
        
    }
    
    //Action event handler for the Submit button on the Corporate Owner tab
    @FXML
    private void handleButtonOwnerCorpSubmitAction (ActionEvent event) throws Exception {
        System.out.println("You submitted corporate owner details!");
        
        // TODO -- Write code to capture the corporate owner details, crete an Owner object, append the object to the Owner ArrayList
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Owner record inserted!");
        alert.showAndWait();
        
    }
    
    //Action event handler for the Exit button on the Corporate Owner tab
    @FXML
    private void handleButtonOwnerCorpExitAction (ActionEvent event) throws Exception {
        System.out.println("You pressed the Exit button");
        //Go back to the menu scene
        try {
            App.setRoot("FXMLMenu");
        } catch (IOException e){
           System.out.println(e); 
        }
        
    }  
    
}

