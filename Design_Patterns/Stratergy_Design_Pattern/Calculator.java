package Design_Patterns.Stratergy_Design_Pattern;

interface Operation {
    public int doOperation(int num1, int num2);
}

class Addition implements Operation {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
    
}

class Subtraction implements Operation {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
    
}

class Multiplication implements Operation {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
    
}

class Stratergy {

    private Operation operation;

    Stratergy(Operation operation) {
        this.operation = operation;
    }

    public int printOutput(int num1, int num2) {
        return operation.doOperation(num1, num2);
    }
}


public class Calculator {

    public static void main(String[] args) {

        Stratergy addStratergy = new Stratergy(new Addition());
        System.out.println("6 + 5 = " + addStratergy.printOutput(6, 5));

        Stratergy subStratergy = new Stratergy(new Subtraction());
        System.out.println("6 - 5 = " + subStratergy.printOutput(6, 5));

        Stratergy mulStratergy = new Stratergy(new Multiplication());
        System.out.println("6 * 5 = " + mulStratergy.printOutput(6, 5));
    }
    
}
