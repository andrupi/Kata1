package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Andres", new Date(102, 5, 19));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
