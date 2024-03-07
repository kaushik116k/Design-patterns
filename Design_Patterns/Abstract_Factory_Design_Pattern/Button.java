package Design_Patterns.Abstract_Factory_Design_Pattern;

interface Button {
    abstract void press();
}

class MacButton implements Button {

    @Override
    public void press() {
        System.out.println("Mac Button is pressed");
    }

}

class WinButton implements Button {

    @Override
    public void press() {
        System.out.println("Windows Button is pressed");
    }
    
}

class LinuxButton implements Button {

    @Override
    public void press() {
        System.out.println("Linux Button is pressed");
    }

}