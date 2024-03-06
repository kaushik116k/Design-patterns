package Design_Patterns.Abstract_Factory_Design_Pattern;

interface TextBox {
    abstract void show();
}

class MacTextBox implements TextBox {

    @Override
    public void show() {
        System.out.println("show mac text box");
    }

}

class WinTextBox implements TextBox {

    @Override
    public void show() {
        System.out.println("show windows text box");
    }

}