import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class AppTest {
    ArrayList<Employee> employees;

    @BeforeEach
    public void addEmployee() {
        employees.add(new Employee("2019XXXX", "Haytham", 10000.0));
        employees.add(new Employee("2020XXXX", "Haytham", 10000.0)); 
    }

    @Test
    public void canDeleteEmployee() {
        employees.remove(0);

        Assertions.assertAll(
                () -> Assertions.assertEquals(1, employees.size()),
                () -> Assertions.assertTrue(employees.contains(new Employee("2020XXXX", "Haytham", 10000.0))),
                () -> Assertions.assertFalse(employees.contains(new Employee("2019XXXX", "Haytham", 10000.0)))
        );

        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals(1, employees.size());
                    Assertions.assertTrue(employees.contains(new Employee("2020XXXX", "Haytham", 10000.0)));
                    Assertions.assertFalse(employees.contains(new Employee("2019XXXX", "Haytham", 10000.0)));
                },
                () -> Assertions.assertTrue(employees.contains(new Employee("2020XXXX", "Haytham", 10000.0))),
                () -> Assertions.assertFalse(employees.contains(new Employee("2019XXXX", "Haytham", 10000.0)))
        );
    }

    @Test
    public void canCalAvg() {
        Assertions.assertEquals(10000.0, employees.get(0).getAvgSalary());
    }
}
