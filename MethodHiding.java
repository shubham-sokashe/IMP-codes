package InterviewScenarioOnPolymorphism;

public class MethodHiding {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();

	}
	
	
	

}

class Shape{
	public static void draw() {
		System.out.println("Shape");
	}
}


class Circle extends Shape{
	public static void draw() {
		System.out.println("Circle");
	}
}