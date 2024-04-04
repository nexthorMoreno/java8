package co.com.architecture.creational.factorymethod.example1.buttons.factory;

import co.com.architecture.creational.factorymethod.example1.buttons.Button;
import co.com.architecture.creational.factorymethod.example1.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

	@Override
	public Button createButton() {
		return new HtmlButton();
	}
	
}
