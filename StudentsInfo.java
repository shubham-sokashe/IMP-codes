package userDefinedEqualsAndHashCode;


public class StudentsInfo {
	int studentId;
	String studentName;
	double studentPointer;

	public StudentsInfo(int id, String name, double pointer) {
		this.studentId = id;
		this.studentName = name;
		this.studentPointer = pointer;
	}

	@Override
	public String toString() {
		return "[studentId=" + studentId + "\t, studentName=" + studentName + "\t, studentPointer=" + studentPointer
				+ "]";
	}

	
	public boolean equals(Object obj) {
		StudentsInfo std = (StudentsInfo) obj;
		if (this == null)
			return false;
		else if (this == obj)
			return true;
		else if (this.studentId == std.studentId)
			return true;
		else if (this.getClass() == obj.getClass())
			return true;
		else
			return false;

	}
	

	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + this.studentId;
		return result;

	}

}
