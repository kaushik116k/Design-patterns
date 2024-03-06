package Design_Patterns.Abstract_Factory_Design_Pattern;

interface IFactory {
    abstract Button createButton();
    abstract TextBox creaTextBox();
}


class MacFactory implements IFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox creaTextBox() {
        return new MacTextBox();
    }
    
}

class WinFactory implements IFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextBox creaTextBox() {
        return new WinTextBox();
    }
    
}
