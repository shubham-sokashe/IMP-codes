package CustomComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class TestComparator {
	
	// method to get Employee details
	public static List<EmployeeDetails> getEmployeeDetails() {
		List <EmployeeDetails> EmployeeList = new ArrayList <EmployeeDetails> ();
		
		EmployeeDetails emp1 = new EmployeeDetails(1 , "Shubham" , "Ichalkaranji");
		EmployeeDetails emp2 = new EmployeeDetails(2 , "Akshay" , "Kolhapur");
		EmployeeDetails emp3 = new EmployeeDetails(3 , "Aniket" , "Islampur");
		EmployeeDetails emp4 = new EmployeeDetails(4 , "Sushil" , "Murgud");
		
		EmployeeList.add(emp1);
		EmployeeList.add(emp2);
		EmployeeList.add(emp3);
		EmployeeList.add(emp4);
		
		
		return EmployeeList;
	}
	
	
	// method to sort employee by their name		-------------------------------------------------------------------------------------------
	
	public static void sortEmployeeByName(List<EmployeeDetails> empList) { // using default sorting order 
		Set <EmployeeDetails> empSet = new TreeSet <EmployeeDetails>();
		
		ListIterator <EmployeeDetails> empItr = empList.listIterator();
		while(empItr.hasNext()) {
			empSet.add(empItr.next());
		}
		System.out.println("Employee Details Sorted by their name :");
		printEmployeeDetails(empSet);
	}
	
	// method to sort employee by their id		----------------------------------------------------------------------------------------------
	
	public static void sortEmployeeById(List <EmployeeDetails> empList) {
		Set <EmployeeDetails> empSet = new TreeSet <EmployeeDetails>(new UserDefinedComparator()); // user defined comparator class
		ListIterator <EmployeeDetails> empItr = empList.listIterator();
		while(empItr.hasNext()) {
			empSet.add(empItr.next());
		}
		
		System.out.println("Employee Details Sorted by their Id :");
		printEmployeeDetails(empSet);
	}
	
	
	// method to sort employee by their Address		----------------------------------------------------------------------------------------------
	
	public static void sortEmployeeByAddress(List <EmployeeDetails> empList) {
		Set <EmployeeDetails> empSet = new TreeSet <EmployeeDetails>(new UserDefinedComparator() {  // in-line implementation
			public int compare(EmployeeDetails o1, EmployeeDetails o2) {
				String emp1Address = o1.getEmployeeAddress();
				String emp2Address = o2.getEmployeeAddress();
				return emp1Address.compareTo(emp2Address);
			}
		});
		
		Iterator<EmployeeDetails> itr = empList.iterator();
		while(itr.hasNext()) {
			empSet.add(itr.next());
		}
		
		System.out.println("Employee Details Sorted by their Address :");
		printEmployeeDetails(empSet);
		
		
	}
	
	// method to sort employee by their id	in descending order	----------------------------------------------------------------------------------------------
	
	public static void sortEmployeeByIdDescending(List <EmployeeDetails> empList) {
		Comparator <EmployeeDetails> Descending = new Comparator <EmployeeDetails>() {


			@Override
			public int compare(EmployeeDetails o1, EmployeeDetails o2) {
				Integer e1Id = o1.getEmployeeId();
				Integer e2Id = o2.getEmployeeId();
				
				if(e1Id  <  e2Id) {
					return 1;
				}
				
				else if(e1Id > e2Id) {
					return -1;
				}
				else {
					return 0;
				}
			}
			
		};
		
		
		Set <EmployeeDetails> empSet = new TreeSet <EmployeeDetails> (Descending);
		
		Iterator <EmployeeDetails> itr = empList.iterator();
		while(itr.hasNext()) {
			empSet.add(itr.next());
		}
		
		System.out.println("Employee Details Sorted by their Id (Descending) :");
		printEmployeeDetails(empSet);
	}
	
	// method to print employee details		---------------------------------------------------------------------------------------------------------
	
	public static void printEmployeeDetails(Set <EmployeeDetails> empSet) {
			for(EmployeeDetails empd : empSet) {
				System.out.println( empd);
			}
	}
	
	
	
	public static void main(String[] args) {
		sortEmployeeByName(getEmployeeDetails());
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		sortEmployeeById(getEmployeeDetails());
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		sortEmployeeByAddress(getEmployeeDetails());
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		sortEmployeeByIdDescending(getEmployeeDetails());
		
	}

}
