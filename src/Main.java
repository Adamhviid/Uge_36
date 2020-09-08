import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

            //Exercise 2;
        FileHandler fh = new FileHandler();
        System.out.println( FileHandler.numberOfLines("resources\\data") );

            //Exercise 3;
        Person one = new Person("bent",160,25);
        Person two  = new Person("John", 219, 25);
        Person three = new Person("Karen",140,58);
        Person four = new Person("karl",180,30);
        Person five = new Person("Blixen",155,34);
        Person six = new Person("Trump",160,90);
        Person seven = new Person("Anton Riis",110,10);
        Person eight = new Person("Trump jr.",143,33);
        Person nine = new Person("Bob",140,10);
        Person ten = new Person("Marie",140,16);

        ArrayList<Person> bunchOfPeople = new ArrayList<Person>(
                Arrays.asList(one,two,three,four,five,six,seven,eight,nine,ten)
        );

        Collections.sort(bunchOfPeople);

        for (Person a : bunchOfPeople) {
            System.out.println(a.toString());
        }

    }
}
