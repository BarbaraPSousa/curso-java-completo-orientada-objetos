package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class PrograL {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.println("Id already tanken Try gain: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salario = sc.nextDouble();

			Employee emp = new Employee(id, name, salario);
			list.add(emp);
		}
		System.out.println();
		System.out.print("Enter the employee id that have salary increase: ");
		int idSalary = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

		// Integer pos = position(list,idSalary);

		if (emp == null) {
			System.out.println("This id does not exist! ");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of empleyee: ");
		for (Employee e : list)
			System.out.println(e);

		sc.close();

	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
