package vehicleregistrationfx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        
        // TODO -- Write code to create ArrayLists for owners and vehicles
        // TODO -- Write code to load records form the text file into the ArrayLists
        // If the text files don't exist, display an error message but don't exit 
        
        // Loads the Menu scene
        scene = new Scene(loadFXML("FXMLMenu"), 600, 480);
        stage.setScene(scene);
        stage.show();
        
        
    }
    
    // Method for switching scenes
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    // Method for exiting the app
    public static void exit()
    {
        // TODO -- Write code to save all the objects from the ArrayLists as records in the relevant text files
        // If the files don’t exist, create new files  
        
        Platform.exit();
        
    }
    
    public static void main(String[] args) {
       
        launch();
    }

}