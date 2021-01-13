import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegistredAndUnderLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные
        long amount = 1000_60;
        boolean registred = true;
        long expected = 30;

        //вызываем целевой метод
        long actual = service.calculate(amount, registred);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateRegistredAndOverLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные
        long amount = 1_000_000_60;
        boolean registred = true;
        long expected = 500;

        //вызываем целевой метод
        long actual = service.calculate(amount, registred);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNotRegistredAndUnderLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные
        long amount = 1_000_60;
        boolean registred = false;
        long expected = 10;

        //вызываем целевой метод
        long actual = service.calculate(amount, registred);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNotRegistredAndOverLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные
        long amount = 1_000_000_60;
        boolean registred = false;
        long expected = 500;

        //вызываем целевой метод
        long actual = service.calculate(amount, registred);

        assertEquals(expected, actual);
    }

}