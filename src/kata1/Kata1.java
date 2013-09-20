
package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Student ed = new Student("Eduardo", new Date(93, 9, 13));
        
        System.out.println("name: " + ed.getName());
        System.out.println("birthday: " + ed.getBirthday());
        System.out.println("age: " + ed.getAge());
    }
}
