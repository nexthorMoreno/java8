package co.com.architecture.creational.factorymethod.example1.buttons;

public class HtmlButton implements Button {

	@Override
	public void render() {
		System.out.println("<button>Test Button</button>");
	}

	@Override
	public void onClick() {
		System.out.println("Click! Button says - 'Hello World'");
	}
	
}
