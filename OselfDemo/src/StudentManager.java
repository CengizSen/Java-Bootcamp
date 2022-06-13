
public class StudentManager extends UserManager{
	public void Yoklamakatildi(Student user) {
	System.out.println("Yoklama Giriþi Baþarýlý"+user.studentNumber+" "+user.firstName);
	}
	
	
	public void Yoklamakatilmadý(Student user) {
		System.out.println("Yoklamaya Katýlmadý"+user.studentNumber+" "+user.firstName);
		}

}
