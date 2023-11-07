package November7Lab;

public class Person {
    private String name;

    Person () {

    }
    Person (String newname){
        name = newname;
    }

    public String toString(){
        return "Regular Person";
    }

    class Student extends Person {
        Student() {

        }

        public String toString(){
            return "Student";
        }
    }

    class Employee extends Person {
        Employee(){

        }

        public String toString(){
            return "Employee";
        }
    }
}