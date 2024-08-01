package org.example.State;

public class Main {

    public static void main(String[] args) {

        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);
        //Now in context we have start state

        State stopState = new StopState();
        stopState.doAction(context);
        // Now it will be in stop state.
    }
}
