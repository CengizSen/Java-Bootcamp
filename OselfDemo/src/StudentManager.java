
public class StudentManager extends UserManager{
	public void Yoklamakatildi(Student user) {
	System.out.println("Yoklama Girişi Başarılı"+user.studentNumber+" "+user.firstName);
	}
	
	
	public void Yoklamakatilmadı(Student user) {
		System.out.println("Yoklamaya Katılmadı"+user.studentNumber+" "+user.firstName);
		}

}
