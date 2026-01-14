import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    void shouldCalculateBelowLimitForRegistered() {
        BonusService service = new BonusService();
        assertEquals(30, service.calcBonus(1000, true));}

    @Test
    void shouldCalculateOverLimitForRegistered() {
        BonusService service = new BonusService();
        assertEquals(500, service.calcBonus(100000, true), "Registered over limit should be capped to 500");}

    @Test
    void shouldCalculateBelowLimitForUnregistered() {
        BonusService service = new BonusService();
        assertEquals(2, service.calcBonus(200, false));}

    @Test
    void shouldCalculateOverLimitForUnregistered() {
        BonusService service = new BonusService();
        assertEquals(500, service.calcBonus(200000, false), "Registered over limit should be capped to 500");}
}
