package week3.day2;

class WebElements{ //BaseClass
	
	public void click() {
		System.out.println("The button is clicked");
	}
	public void setText() {
		System.out.println("Send the text");
	}
}

class Button extends WebElements{
	public void submit() {
		System.out.println("Button Submitted");
	}
	}
class TextFeild extends WebElements{
	public void getText() {
		System.out.println("Get the text");
	}
}

class CheckBoxButton extends Button{ // Subclass of Button
	public void clickCheckButton() {
		System.out.println("Checkbox is checked");
	}
}

class RadioButton extends Button{ //Subclass of Button
	public void selectRadioButton() {
		System.out.println("Radio button selected");
	}
}

public class ElementsInheritance {
	
	public static void main(String[] args) {
		
		WebElements we = new WebElements(); //Instance for WebElements
		we.click();
		we.setText();
		
		Button bu = new Button(); //Button Instance
		bu.submit();
		
		TextFeild tf = new TextFeild(); //TextFeild Instance
		tf.getText();
		
		CheckBoxButton cb = new CheckBoxButton(); 
		cb.clickCheckButton();
		cb.click(); //calling superclass method - webelements
		cb.submit();
		
		RadioButton rb = new RadioButton();
		rb.selectRadioButton();
		
		}

}
