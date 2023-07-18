package entities;

public class Rent {
	private String Name;
	private String Email;
	
	
	public Rent() {
		
	}

	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	public String toString() {
		return Name + ", " + Email;
	}

	public Rent(String name, String email) {
		
		Name = name;
		Email = email;
		
	}








	
}
