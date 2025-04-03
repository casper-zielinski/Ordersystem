package at.fhj.msd;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Test extends Application {
      @Override
    public void start(Stage stage) {
        Label label = new Label("Hallo, JavaFX mit Maven!");
        Scene scene = new Scene(label, 300, 200);
        
        stage.setTitle("JavaFX Maven Test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
