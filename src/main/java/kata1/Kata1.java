package kata1;

import java.util.Date;

public class Kata1 {
    
    public static void main(String[] args){
        Person person = new Person("oscar", new Date(97,0,10));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }

}
