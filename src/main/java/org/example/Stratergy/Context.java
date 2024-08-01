package org.example.Stratergy;

public class Context {

    private Stratergy stratergy;

    public Context(Stratergy stratergy) {
        this.stratergy = stratergy;
    }

    public int executeStratergy(int num1, int num2) {
        return this.stratergy.doOperation(num1, num2);
    }
}
