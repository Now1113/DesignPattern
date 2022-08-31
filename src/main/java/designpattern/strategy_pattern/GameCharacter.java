package main.java.designpattern.strategy_pattern;

public class GameCharacter {
    
    //접근점
    private Weapon weapon;

    //교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println("맨손 공격");
        }else{
            //델리 게이트
            weapon.attack();
        }
    }
}
