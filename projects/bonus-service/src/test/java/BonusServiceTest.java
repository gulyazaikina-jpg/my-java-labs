import main.java.BonusService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    void shouldCalculateBelowLimitForRegistered() {
        BonusService service = new BonusService();
        assertEquals(30, service.calcBonus(1000, true));
    }

    @Test
    void shouldCalculateOverLimitForRegistered() {
        BonusService service = new BonusService();
        assertEquals(500, service.calcBonus(100000, true), "Registered over limit should be capped to 500");
    }

    @Test
    void shouldCalculateBelowLimitForUnregistered() {
        BonusService service = new BonusService();
        assertEquals(2, service.calcBonus(200, false));
    }

    @Test
    void shouldCalculateOverLimitForUnregistered() {
        BonusService service = new BonusService();
        assertEquals(500, service.calcBonus(200000, false), "Unregistered over limit should be capped to 500");
    }

    @Test
    void shouldCalculateOverLimitForRegistered2() {
        BonusService shop2Service = new BonusService(11000);
        assertEquals(11000, shop2Service.calcBonus(10000000, true), "Registered over limit should be capped to 11000");
    }

    @Test
    void shouldCalculateBelowLimitForRegistered2() {
        BonusService shop2Service = new BonusService(11000);
        assertEquals(3000, shop2Service.calcBonus(100000, true));
    }
}