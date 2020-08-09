package HomeWork4To30_06_2020;

public class AlfaBankLoader extends SiteLoader {
    public static final String RATE = "rate"; // RATE - рус. курс
    public static final char COLON = ':'; // COLON - рус. двоеточие

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/nationalRates?currencyCode=" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     *
     * @param content      то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        int rateIndex = content.lastIndexOf(RATE);

        String substring = content.substring(rateIndex);
        int i = substring.indexOf(COLON);

        String value = substring.substring(i + 1, i + 9);

        return Double.parseDouble(value);
    }
}

