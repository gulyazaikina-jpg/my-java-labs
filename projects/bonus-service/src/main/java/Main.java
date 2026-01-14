 public class Main {
        public static void main(String[] args) {
            BonusService service = new BonusService();

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
        }
    }

