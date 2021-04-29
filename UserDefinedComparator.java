package CustomComparator;

import java.util.Comparator;
public class UserDefinedComparator implements Comparator <EmployeeDetails> {

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		Integer e1Id = o1.getEmployeeId();
		Integer e2Id = o2.getEmployeeId();
		return	e1Id.compareTo(e2Id) ;
	}
	
	
	

}
