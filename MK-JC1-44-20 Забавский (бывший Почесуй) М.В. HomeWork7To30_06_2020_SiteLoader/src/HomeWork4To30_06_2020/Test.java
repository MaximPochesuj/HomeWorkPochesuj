package HomeWork4To30_06_2020;

public class Test {
    public static void main(String[] args) {
        NBRBLoader loader = new NBRBLoader();
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUS));
        System.out.println(loader.load(SiteLoader.Currency.USD));
    }
}
