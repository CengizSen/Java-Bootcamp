
public class Main {

	public static void main(String[] args) {

		
		Student user1=new Student();
		user1.firstName="Cengiz";
		user1.lastName="Şen";
		user1.studentNumber=4556;
		
		
		Instructor instructor=new Instructor();
		instructor.firstName="Ender";
		instructor.lastName="Şen";
		instructor.instnumber=25;
	    
		UserManager manager=new UserManager();
		manager.Login(user1);
		
		
     	InstructorManager manager2=new InstructorManager();
		manager2.CourseAdd(user1);
		
		StudentManager manager3=new StudentManager();
		manager3.Yoklamakatildi(user1);
		
		manager.Logout(user1);
		
		
	    
		
		
	}

}
