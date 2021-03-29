package org.jacobarchambault.buttons;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

class ThreeButtonGrid extends GridPane {

	Button button1;
	Button button2;
	Button button3;
	Label output;

	ThreeButtonGrid(final Button button1, final Button button2, final Button button3, final Label output) {
		add(button1, 0, 0);
		add(button2, 0, 1);
		add(button3, 0, 2);
		add(output, 0, 3);
		setPadding(new Insets(10));
		setVgap(10);
		setAlignment(Pos.CENTER);
		GridPane.setHalignment(button1, HPos.CENTER);
		GridPane.setHalignment(button2, HPos.CENTER);
		GridPane.setHalignment(button3, HPos.CENTER);
		GridPane.setHalignment(output, HPos.CENTER);

	}
}
