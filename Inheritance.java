class Company {
    void provideWork() {
        System.out.println("Company provides work.");
    }
}

class Employee extends Company {
    void doWork() {
        System.out.println("Employee is doing work.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.provideWork(); 
        emp.doWork();      
    }
}
