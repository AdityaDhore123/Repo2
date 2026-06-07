package Constructor;

class Student{
	int roll_no;
	String name;
	
	Student(){
		System.out.println("I am a student");
	}
	
	Student(int x, String y){
		roll_no = x;
		name = y;
	
	}
}

public class Multiple_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Student();
		
		Student s2 = new Student(101, "ABC");
		System.out.println(s2.roll_no);
		System.out.println(s2.name);

	}

}
