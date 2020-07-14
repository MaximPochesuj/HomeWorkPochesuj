package HomeWork8PersonAndAnimal;

public class Animal<T> extends RandomString {
    private int age; // возраст
    private String nick;  // кличка

    // конструктор
    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    // геттеры и сеттеры

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
