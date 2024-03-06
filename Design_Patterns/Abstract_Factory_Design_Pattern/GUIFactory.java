package Design_Patterns.Abstract_Factory_Design_Pattern;

class GUIFactory {
    static IFactory createFactory(String factoryType) {
        if(factoryType == "Mac") {
            return new MacFactory();
        } else {
            return new WinFactory();
        }
    }
}

