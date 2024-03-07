package Design_Patterns.Abstract_Factory_Design_Pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("what is your os type???");
        String OSType = scanner.next();

        IFactory factory = GUIFactory.createFactory(OSType);
        Button button = factory.createButton();
        button.press();
    
        TextBox textBox = factory.creaTextBox();
        textBox.show();

    }
}
