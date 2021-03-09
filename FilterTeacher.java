package com.programmimgWing.hw1902021;

public class FilterTeacher {
	String[] etcDepartmentTeachers = new String[3];
	
	
	void findTeacherDeparment() {
		int etcDeptTechIndexNo = 0;
		TeacherDetails objectOfTeacher = new TeacherDetails();
		TeacherDetails teacher1st = new TeacherDetails();
		objectOfTeacher.TeacherDirectory();
		System.out.println("Teachers of Electronics & telecommunication Engineering Department :");
		for (int i = 0; i < objectOfTeacher.teacherList.length; i++) {
			
			teacher1st = objectOfTeacher.teacherList[i];
			if (teacher1st.teacherDepartment == "Electronics & telecommunication Engineering") {
				etcDepartmentTeachers[etcDeptTechIndexNo] = teacher1st.teacherName;
				etcDeptTechIndexNo++;

			}
		}

	}

	double findHighestSallery() {
		double highestSalary = 0;
		TeacherDetails objectOfTeacher2 = new TeacherDetails();
		objectOfTeacher2.TeacherDirectory();
		TeacherDetails objectOfTeacher3 =  new TeacherDetails();
		for(int j=0; j< objectOfTeacher2.teacherList.length ;  j++) {
		
			objectOfTeacher3 = objectOfTeacher2.teacherList[j];
			
			if(objectOfTeacher3.teacherSalary > highestSalary) {
				highestSalary = objectOfTeacher3.teacherSalary;
			}
			
		}
		
		return highestSalary;
		
	}
	
	
	public static void main(String[] args) {
		FilterTeacher object1 = new FilterTeacher();
		object1.findTeacherDeparment();
		
		for (int i = 0; i < object1.etcDepartmentTeachers.length; i++) {
			System.out.println(object1.etcDepartmentTeachers[i]);
		}
		
		System.out.println("Highest Sallery from all teacher is =" + object1.findHighestSallery() + " Per month.");
	}

}

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------

class TeacherDetails {

	String teacherName;
	String teacherDepartment;
	double teacherSalary;
	TeacherDetails[] teacherList = new TeacherDetails[5];

	public TeacherDetails(String tname, String tdept, double tsallery) {
		this.teacherName = tname;
		this.teacherDepartment = tdept;
		this.teacherSalary = tsallery;

	}

	void TeacherDirectory() {

		TeacherDetails teacher1 = new TeacherDetails("Aniket sir", "Electrical Engineering", 50000);
		TeacherDetails teacher2 = new TeacherDetails("Akshay sir", "Mechanical Engineering", 70000);
		TeacherDetails teacher3 = new TeacherDetails("Sudarshan sir","Electronics & telecommunication Engineering",20000);
		TeacherDetails teacher4 = new TeacherDetails("Sushant sir", "Electronics & telecommunication Engineering",40000);
		TeacherDetails teacher5 = new TeacherDetails("Sushil sir", "Electronics & telecommunication Engineering",100000);

		teacherList[0] = teacher1;
		teacherList[1] = teacher2;
		teacherList[2] = teacher3;
		teacherList[3] = teacher4;
		teacherList[4] = teacher5;

	}

	public TeacherDetails() {

	}

}
