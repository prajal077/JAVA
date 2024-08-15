class Employee {
    int salary = 60000;
    void printCompanyName () {
        System.out.println("The name of the company is: LeapFrog");
    }
}

class Engineer extends Employee {
    int benefits = 10000;

    void printDepartmentName () {
        System.out.println("The department is: IT Department");
    }
}

public class inheritance_example {
    public static void main (String [] args) {
        Engineer obj  = new Engineer();
        obj.printCompanyName();
        obj.printDepartmentName();
        System.out.println("The salary is Rs." +obj.salary + " With the benefits of Rs."+obj.benefits);
    }
}
