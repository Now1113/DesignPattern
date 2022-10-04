package main.java.designpattern.adpater;

public class Main {

    public static void main(String[] args) {

        Adapter adapter = new AdapterImpl();

        Float float1 = adapter.twiceOf(20.0f);
        Float float2 = adapter.halfOf(20.0f);

        System.out.println("float1 = " + float1);
        System.out.println("float2 = " + float2);

    }
}
