package org.example.Stratergy;

public class Main {

    public static void main(String[] args) {
        Stratergy stratergy = new OperationAdd();
        Context context = new Context(stratergy);
        Stratergy stratergy2 = new OperationSub();
        Context context2 = new Context(stratergy2);
        System.out.println(context.executeStratergy(5,6));
        System.out.println(context2.executeStratergy(5,6));
    }
}
