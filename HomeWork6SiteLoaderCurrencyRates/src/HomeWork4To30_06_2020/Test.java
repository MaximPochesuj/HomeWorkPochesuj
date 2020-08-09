package HomeWork4To30_06_2020;

public class Test {
    public static void main(String[] args) {
        NBRBLoader loader = new NBRBLoader();
        System.out.println("Курсы НБРБ:");
        System.out.println(loader.load(SiteLoader.Currency.EUR_NBRB));
        System.out.println(loader.load(SiteLoader.Currency.RUS_NBRB));
        System.out.println(loader.load(SiteLoader.Currency.USD_NBRB));
        System.out.println("Курсы АльфаБанка:");
        AlfaBankLoader alfaBankLoader = new AlfaBankLoader();
        System.out.println(alfaBankLoader.load(SiteLoader.Currency.EUR_ALFA));
        System.out.println(alfaBankLoader.load(SiteLoader.Currency.RUS_ALFA));
        System.out.println(alfaBankLoader.load(SiteLoader.Currency.USD_ALFA));
        System.out.println("Курсы Беларусбанка:");
        BelarusBankLoader belarusBankLoader = new BelarusBankLoader();
        System.out.println(belarusBankLoader.load(SiteLoader.Currency.EUR_BELARUS));
        System.out.println(belarusBankLoader.load(SiteLoader.Currency.RUS_BELARUS));
        System.out.println(belarusBankLoader.load(SiteLoader.Currency.USD_BELARUS));
    }
}
