package HomeWork8PersonAndAnimal;

import java.util.Comparator;

public class PersonPassLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int passL1 = o1.getPassword().length();
        int passL2 = o2.getPassword().length();

        if (passL1 < passL2)
            return -1;
        else if (passL1 > passL2)
            return 1;
        else
            return 0;
    }
}
