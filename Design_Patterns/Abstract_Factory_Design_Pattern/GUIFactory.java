package Design_Patterns.Abstract_Factory_Design_Pattern;

class GUIFactory {
    static IFactory createFactory(String factoryType) {
        if(factoryType == "Mac") {
            return new MacFactory();
        } else if (factoryType == "Linux") {
            return new LinuxFactory();
        } else {
            return new WinFactory();
        }
    }
}

