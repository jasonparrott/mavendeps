package test.library2;

import test.library2.model.Employee;

public class EmployeeDAO {

    public Employee getEmployee(String firstName, String lastName) {
        return new Employee(firstName, lastName);
    }
}
