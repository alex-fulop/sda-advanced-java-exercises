package inputoutput.csvdata;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataAnalysis {
	public static void main(String[] args) {

		String inputFilePath = "resources/data.csv";
		String outputFilePath = "resources/results.txt";

		List<Employee> employees = new ArrayList<>();

		try {
			FileReader reader = new FileReader(inputFilePath);
			BufferedReader csvReader = new BufferedReader(reader);

			String line;
			csvReader.readLine();
			//folosim buffered reader ca sa citim informatiile din csv
			while((line = csvReader.readLine()) != null) {
				String[] data = line.split(", ");
				if(data.length == 2) {
					String name = data[0];
					int salary = Integer.parseInt(data[1]);

					Employee employee = new Employee(name, salary);
					employees.add(employee);
				}
			}
			csvReader.close();

//			for (Employee employee: employees) {
//				System.out.println(employee.getName() + " " + employee.getSalary());
//			}

//			o sa calculam: total salarii, medie salarii,
//			o sa cautam angajatul cu cel mai mare salar

			int totalSalary = 0;
			int highestSalary = 0;
			int averageSalary = 0;
			String highestPaidEmployee = "";

			for(Employee employee: employees) {
//				adunam toate salariile la total
				totalSalary += employee.getSalary();

//				verificam daca salarul angajatului este cel mai mare si il salvam
				if(employee.getSalary() > highestSalary) {
					highestSalary = employee.getSalary();
					highestPaidEmployee = employee.getName();
				}

				if(employees.isEmpty()) {
					averageSalary = 0;
				} else {
					averageSalary = totalSalary / employees.size();
				}

				averageSalary = employees.isEmpty() ? 0 : totalSalary / employees.size();
//				averageSalary = employees.isEmpty() ? 0 : ;
			}

//			printarea rezultatelor
//			System.out.println("Total salary: " + totalSalary);
//			System.out.println("Highest salary: " + highestSalary + " of employee " + highestPaidEmployee);
//			System.out.println("Average salary: " + averageSalary);

//			scrierea rezultatelor intr-un fisier
			FileWriter writer = new FileWriter(outputFilePath);
			writer.write("Total Salary: " + totalSalary + "\n");
			writer.write("Average Salary: " + averageSalary + "\n");
			writer.write("Highest Paid Employee: " + highestPaidEmployee + "\n");
			writer.write("Highest Paid Employee Salary: " + highestSalary + "\n");
			writer.close();

			System.out.println("Results calculated and written to " + outputFilePath);
		} catch (FileNotFoundException fnfe) {
			System.out.println("The file could not be found.");
		} catch (IOException e) {
			System.out.println("There was an input/output exception");
		}

	}
}
