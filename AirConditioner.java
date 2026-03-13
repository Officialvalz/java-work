import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class AirConditioner{
    AirConditioner ac = new AirConditioner;

    @BeforeEach
    void setUp() {
        ac = new AirConditioner();
    }

    @Test
    void whenITurnItOn_itShouldBeOn() {
        ac.turnOn();
        assertTrue(ac.isOn());
    }

    @Test
    void whenITurnItOff_itShouldBeOff() {
        ac.turnOn();
        ac.turnOff();
        assertFalse(ac.isOn());
    }

    @Test
    void whenIIncreaseTemperature_itShouldGoUpByOne() {
        ac.turnOn();
        int before = ac.getTemperature();
        ac.increaseTemperature();
        assertEquals(before + 1, ac.getTemperature());
    }

    @Test
    void whenIDecreaseTemperature_itShouldGoDownByOne() {
        ac.turnOn();
        int before = ac.getTemperature();
        ac.decreaseTemperature();
        assertEquals(before - 1, ac.getTemperature());
    }

    @Test
    void whenIIncreaseTemperatureBeyond30_itShouldStayAt30() {
        ac.turnOn();
        for (int increase = 0; increase  < 20; increase ++) ac.increaseTemperature(); 
        assertEquals(30, ac.getTemperature());
    }

    @Test
    void whenIDecreaseTemperatureBelow16_itShouldStayAt16() {
        ac.turnOn();
        for (int decrease = 0; decrease < 20; decrease++) ac.decreaseTemperature(); 
        assertEquals(16, ac.getTemperature());
    }
}
