package HomeWork6_ColorAndCalculator;

public class Color {
    private int numberColor;
    private int colorNumber;

    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int SKY = 5;
    private final int BLUE = 6;
    private final int PURPLE = 7;

    public Color(int number) {
        this.numberColor = number;
        this.colorNumber = number;
    }

    public int getNumber() {
        return numberColor;
    }

    public int getName() {
        switch (colorNumber) {
            case RED:
                System.out.println("Красный");
                break;
            case ORANGE:
                System.out.println("Оранжевый");
                break;
            case YELLOW:
                System.out.println("Желтый");
                break;
            case GREEN:
                System.out.println("Зеленый");
                break;
            case SKY:
                System.out.println("Голубой");
                break;
            case BLUE:
                System.out.println("Cиний");
                break;
            case PURPLE:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Неизвестно");
        }
        return colorNumber;
    }
}