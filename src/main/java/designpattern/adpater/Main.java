package main.java.designpattern.adpater;

public class Main {

    public static void main(String[] args) {

        Adapter adapter = new AdapterImpl();

        Float aFloat = adapter.twiceOf(100f);
        Float aFloat1 = adapter.halfOf(88f);

    }
}
