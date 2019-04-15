package hashmap.com.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import Model.Employee;
import Model.Student;

public class App {
	public static void main(String[] args) {
		// For Student
		Student st = new Student("1", "Joyee", 145, "CSE");
		Student st1 = new Student("2", "Ana", 135, "EEE");
		Student st2 = new Student("3", "Riffu", 125, "Pharm");
		Student st3 = new Student("4", "Ria", 105, "GEB");

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(st);
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);

		HashMap<String, ArrayList<Student>> map = new HashMap<String, ArrayList<Student>>();
		map.put("Student", studentList);
		// System.out.println(map);

		// For Employee
		Employee em = new Employee("1", "ABC", "Senior teacher");
		Employee em1 = new Employee("2", "BVSD", " teacher");
		Employee em2 = new Employee("3", "ABC", "Senior teacher");

		ArrayList<Employee> employeelist = new ArrayList<Employee>();
		employeelist.add(em);
		employeelist.add(em1);
		employeelist.add(em2);

		HashMap<String, ArrayList<Employee>> map1 = new HashMap<String, ArrayList<Employee>>();
		map1.put("Employee", employeelist);
		// System.out.println(map1);

		for (Map.Entry<String, ArrayList<Student>> entry : map.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		for (Map.Entry<String, ArrayList<Employee>> entry1 : map1.entrySet())
			System.out.println("Key = " + entry1.getKey() + ", Value = " + entry1.getValue());

		// System.out.println(n);

	}
}