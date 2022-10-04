package main.java.designpattern.factory_method_pattern.concrate;

import main.java.designpattern.factory_method_pattern.framework.Item;
import main.java.designpattern.factory_method_pattern.framework.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator {
    
    @Override
    protected void requestItemInfo() {
        System.out.println("데이터 베이스에서 체력 회복 물약의 정보를 가져옴.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("체력 회복 물약을 새로 생성 했습니다. " + new Date());
    }

    @Override
    protected Item createItem() {
        //작업
        System.out.println("아이템 생성");
        return new HpPotion();
    }
    
}
