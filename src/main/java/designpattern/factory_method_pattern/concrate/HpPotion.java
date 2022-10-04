package main.java.designpattern.factory_method_pattern.concrate;

import main.java.designpattern.factory_method_pattern.framework.Item;

public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("체력 회복!");
    }
}
