package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.printf("Employee #%d:%n", i+1);
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (employee == null) {
			System.out.println("This id does not exists!");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			employee.increaseSalary(percent);
		}
	
		System.out.println("List of Employees");
		for (Employee x : list) {
			System.out.println(x);
		}
		
		
		sc.close();

	}

}
