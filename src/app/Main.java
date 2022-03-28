package app;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override 
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/app/views/mainView.fxml"));
        primaryStage.setTitle("MVC Example App");
        //primaryStage.getIcons().add(new Image(getClass().getResource("/img/EdenCodingIcon.png").toExternalForm()));
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
