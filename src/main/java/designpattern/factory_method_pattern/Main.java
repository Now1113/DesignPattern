package main.java.designpattern.factory_method_pattern;

import main.java.designpattern.factory_method_pattern.concrate.HpCreator;
import main.java.designpattern.factory_method_pattern.concrate.HpPotion;
import main.java.designpattern.factory_method_pattern.concrate.MpCreator;
import main.java.designpattern.factory_method_pattern.framework.Item;
import main.java.designpattern.factory_method_pattern.framework.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();

        item.use();

        creator = new MpCreator();
        item = creator.create();

        item.use();
    }
}
