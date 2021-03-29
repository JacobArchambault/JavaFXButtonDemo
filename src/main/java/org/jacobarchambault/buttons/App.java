package org.jacobarchambault.buttons;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
	public static void main(final String[] args) {
		Application.launch();
	}

	Label label = new Label();

	@Override
	public void start(final Stage stage) {
		stage
				.setScene(
						new Scene(
								new ThreeButtonGrid(
										new EventButton("Sinister", e -> label.setText("Left")),
										new EventButton("Medium", e -> label.setText("Center")),
										new EventButton("Dexter", e -> label.setText("Right")),
										label)));
		stage.show();
	}

}