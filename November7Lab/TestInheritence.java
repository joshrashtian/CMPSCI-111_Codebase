package November7Lab;

import November7Lab.Person.Employee;
import November7Lab.Person.Student;

public class TestInheritence {
    public static void main(String[] args) {
        Person Joshua = new Person("Joshua");
        Student Danna = Joshua.new Student();
        Employee Michael = Joshua.new Employee();

        System.out.println(Joshua.toString() + ", " + Danna.toString() + ", " + Michael.toString());
    }
}
