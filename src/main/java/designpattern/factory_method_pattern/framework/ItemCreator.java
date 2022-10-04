package main.java.designpattern.factory_method_pattern.framework;

public abstract class ItemCreator {

    public Item create() {
        
        Item item;

        //step1 : 아이템 정보 가져옴
        requestItemInfo();
        //step2 : 아이템 생성
        item = createItem();
        //step3 : 아이템 생성정보 남김
        createItemLog();

        return item;
    }

    //아이템을 생성하기 전에 DB에서 아이템 정보 요청
    abstract protected void requestItemInfo();

    //아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 DB에 아이템 생성정보 남김
    abstract protected void createItemLog();

    //아이템을 생성하는 알고리즘
    abstract protected Item createItem();

}
