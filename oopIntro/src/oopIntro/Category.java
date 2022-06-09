package oopIntro;

public class Category {
	
	private int id;
    private String Name;
    
    
    public Category() {
    	
    }
    
	public Category(int id, String name) {
		this.id = id;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name+" Yeni!";
	}
	public void setName(String name) {
		Name = name;
	}

    
}
