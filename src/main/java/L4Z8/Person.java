package L4Z8;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final int bornYear;

    public Person(String name, String lastName, int yearBorn) {
        this.name = name;
        this.surname = lastName;
        this.bornYear = yearBorn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, bornYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return bornYear == person.bornYear && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }


}