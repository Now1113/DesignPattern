package main.java.designpattern.strategy_pattern;

public class AObject {

    Ainterface ainterface;

    public AObject() {
        ainterface = new AinterfaceImpl();
    }

    public void funcAA() {

        //다른 객체 기능을 빌려서 사용 하는 것 : 위임한다
        ainterface.funcA();
        ainterface.funcA();

        //System.out.println("AAA");
        //System.out.println("AAA");

        // ~ 기능이 필요합니다. 개발해주세요
    }
}
