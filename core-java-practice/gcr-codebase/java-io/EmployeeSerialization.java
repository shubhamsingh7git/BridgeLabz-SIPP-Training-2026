import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, dept, salary);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
            oos.writeObject(emp);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
            Employee recovered = (Employee) ois.readObject();
            ois.close();

            System.out.println("Recovered Employee:");
            System.out.println(recovered.employeeId);
            System.out.println(recovered.name);
            System.out.println(recovered.department);
            System.out.println(recovered.salary);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}