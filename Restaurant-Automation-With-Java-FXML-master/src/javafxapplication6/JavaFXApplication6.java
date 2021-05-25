package javafxapplication6;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.stage.*;
public class JavaFXApplication6 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("SFCRestaurant");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
