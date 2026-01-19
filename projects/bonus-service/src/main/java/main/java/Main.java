package main.java;

public class Main {
        public static void main(String[] args) {
            // shop1
            System.out.println("shop1");
            BonusService service = new BonusService(); // limit 500

            long bonusBelowLimitForRegistered = service.calcBonus(1000, true);
            System.out.println(bonusBelowLimitForRegistered);
            System.out.println();
            long bonusOverLimitForRegistered = service.calcBonus(100000, true);
            System.out.println(bonusOverLimitForRegistered);
            System.out.println();
            long bonusBelowLimitForUnregistered = service.calcBonus(200, false);
            System.out.println(bonusBelowLimitForUnregistered);
            System.out.println();
            long bonusOverLimitForUnregistered = service.calcBonus(200000, false);
            System.out.println(bonusOverLimitForUnregistered);

            // shop 2
            System.out.println("shop2");
            BonusService shop2Service = new BonusService(11000);

            long bonusOverLimitForRegistered2 = shop2Service.calcBonus(10000000, true);
            System.out.println(bonusOverLimitForRegistered2);
            System.out.println();

        }
    }

