
public class StudentManager extends UserManager{
	public void Yoklamakatildi(Student user) {
	System.out.println("Yoklama Giri�i Ba�ar�l�"+user.studentNumber+" "+user.firstName);
	}
	
	
	public void Yoklamakatilmad�(Student user) {
		System.out.println("Yoklamaya Kat�lmad�"+user.studentNumber+" "+user.firstName);
		}

}
