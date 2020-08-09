package HomeWork4To30_06_2020;

public class BelarusBankLoader extends SiteLoader {
    public static final char COLON = ':'; // COLON - рус. двоеточие

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://belarusbank.by/api/kursExchange", currencyName);
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
        int rateIndex = content.indexOf(currencyName.getId());

        String substring = content.substring(rateIndex);
        int i = substring.indexOf(COLON);

        String value = substring.substring(i + 2, i + 8);

        return Double.parseDouble(value);
    }
}