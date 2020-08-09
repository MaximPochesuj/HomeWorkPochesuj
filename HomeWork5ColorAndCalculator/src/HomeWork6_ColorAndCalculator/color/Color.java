package HomeWork6_ColorAndCalculator.color;

public class Color {
    private int colorName;

    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int SKY = 5;
    private final int BLUE = 6;
    private final int PURPLE = 7;

    public Color(int colorName) {
        this.colorName = colorName;
    }

    public int getNumber() {
        return this.colorName;
    }

    public String getName() {
        switch (colorName) {
            case RED:
                return "Красный";
            case ORANGE:
                return "Оранжевый";
            case YELLOW:
                return "Желтый";
            case GREEN:
                return "Зеленый";
            case SKY:
                return "Голубой";
            case BLUE:
                return "Cиний";
            case PURPLE:
                return "Фиолетовый";
            default:
                return "Неизвестно";
        }
    }
}