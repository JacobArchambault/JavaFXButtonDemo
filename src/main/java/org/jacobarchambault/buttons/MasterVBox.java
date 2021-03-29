package org.jacobarchambault.buttons;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

public class MasterVBox extends VBox {

	MasterVBox(final int spacing, final Node... children) {
		super(spacing, children);
		setAlignment(Pos.CENTER);
	}
}
