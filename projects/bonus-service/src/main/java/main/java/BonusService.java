package main.java;

public class BonusService {

    int limit = 500; // 500 - default value

    public BonusService() {
    }

    public BonusService(int limit ) {

        this.limit = limit;
    }

    public int calcBonus(int amount, boolean isRegistered){
        int percent = isRegistered ? 3 : 1;
        int bonus= amount * percent / 100;
        if (bonus>limit) {
            bonus = limit;
        }
        return  bonus;
    }


}