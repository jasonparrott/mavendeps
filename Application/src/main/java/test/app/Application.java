package test.app;

import test.library1.ScreenPrinter;
import test.library2.EmployeeDAO;
import test.library2.model.Employee;

public class Application {
    private static EmployeeDAO dao = new EmployeeDAO();
    public static  void main(String... args) {

        Employee employee = dao.getEmployee(args[0], args[1]);
        ScreenPrinter.printIt(employee);
    }
}
