<<<<<<< HEAD
package HomeWork8PersonAndAnimal;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int age1 = o1.getAge();
        int age2 = o2.getAge();

        if (age1 < age2)
            return -1;
        else if (age1 > age2)
            return 1;
        else
            return 0;
    }
}

=======
package HomeWork8PersonAndAnimal;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int age1 = o1.getAge();
        int age2 = o2.getAge();

        if (age1 < age2)
            return -1;
        else if (age1 > age2)
            return 1;
        else
            return 0;
    }
}

>>>>>>> abe840cce869bab4642684965272763598f8cc0b
