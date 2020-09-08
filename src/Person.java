public class Person implements Comparable<Person>{

    private String name;
    private int height;
    private int age;

    public Person(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {

        if (person.getAge() < age) {
            return -1;

        } if (person.getAge() > age) {
            return 1;

        } else if (person.getHeight() < height) {
            return -1;

        } else if (person.getHeight() > height) {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "['" + name + "' \t " + height + "cm, \t " + age + " år]";
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

}
