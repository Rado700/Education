package OOP.Enum.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee>employees = new ArrayList<>();



        Employee designer = Employee.DESIGNER;
        Employee developer = Employee.DEVELOPER;
        Employee manager = Employee.MANAGER;

        employees.add(designer);
        employees.add(developer);
        employees.add(manager);

        for (Employee e : employees) {
            System.out.println(e);

        }
//
//        for (Employee employees: Employee.values()) {
//            System.out.println(employees);
////
//        }



    }
}
