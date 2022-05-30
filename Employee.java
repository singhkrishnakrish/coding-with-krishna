import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
	 
public class Employee {
	String name;
	Integer salary;
	//Implement setter and getter

	    Employee(String name, Integer salary) {
		   this.name = name; 
		   this.salary = salary;
		
		}

	    public static void main(String[] args) {
			/*
			 * Employee e1 = new Employee("aTestName", 3000); Employee e2 = new
			 * Employee("nTestName", 2000); Employee e3 = new Employee("kTestName", 2500);
			 * 
			 * List<Employee> employees = new ArrayList<Employee>(); employees.add(e2);
			 * employees.add(e3); employees.add(e1);
			 * 
			 * // after sorting System.out.println(employees); employees.stream().sorted().;
			 */
	    	// Declaring the String
			String str = "Alice is girl and Bob is boy";			
			String[] temp = str.split(" ");
			int count = 0;
			for (int i = 0; i < temp.length; i++) {
					System.out.println(temp[i]);
					String temp1 = temp[i];
					String tmp2 = temp1;
			}
	    }
	}
