package random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		// Scene Setup
		Group group = new Group();

		Scene scene = new Scene(group, 600, 300);

		scene.setFill(Color.BROWN);

		stage.setTitle("Sample Application");

		stage.setScene(scene);

		stage.show();

		// Sprite Test
		Image sprite = new Image(getClass().getResource("/pacman.png").toExternalForm());
		ImageView imageView = new ImageView(sprite);
		group.getChildren().add(imageView);

	}

}
