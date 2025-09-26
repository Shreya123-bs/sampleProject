package assignment.java.practice;
	import java.io.FileWriter;
	import java.io.IOException;

	public class EmployeeSalary {
		    public static void main(String[] args) {
		        String file = "EmployeeSalaryReport.csv";
		        try (FileWriter fw = new FileWriter(file)) {
		            // Write header
		            fw.write("EmployeeID,Name,Department,Salary\n");
		            // Write records
		            fw.write("1,satya,PhysicalDesign,700000\n");
		            fw.write("2,shreya,Automation,450000\n");
		            fw.write("3,anki,Developer,500000\n");
		            System.out.println("CSV file created successfully!");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}
		 

