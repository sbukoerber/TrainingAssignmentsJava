import com.training.model.persistance.Employee;
import com.training.model.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");

        EmployeeService employeeService = (EmployeeService) context.getBean("es");

        System.out.println("All Employees:");
        for (Employee emp : employeeService.getAllEmployees()) {
            System.out.println(emp.getName());
        }

    }
}
