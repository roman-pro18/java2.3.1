public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();


        long bonusUnderLimitRegistred = service.calculate(10060, true);
        System.out.println(bonusUnderLimitRegistred);

        long bonusUnderLimitNotRegistred = service.calculate(10060, false);
        System.out.println(bonusUnderLimitNotRegistred);


    }
}
