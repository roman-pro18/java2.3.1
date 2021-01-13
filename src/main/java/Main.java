public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        //подготавливаем данные
        long amount = 1000_60;
        boolean registred = true;
        long expected = 30;

        //вызываем целевой метод
        long actual = service.calculate(amount, registred);

        //производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        boolean passed = expected == actual;

        // выводим результаты
        System.out.println(passed);




        long bonusUnderLimitRegistred = service.calculate(10060, true);
        System.out.println(bonusUnderLimitRegistred);

        long bonusUnderLimitNotRegistred = service.calculate(10060, false);
        System.out.println(bonusUnderLimitNotRegistred);


    }
}
