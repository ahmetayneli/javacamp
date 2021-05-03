
public class Main {

	public static void main(String[] args) {
	  
		
		UserManager userManager = new UserManager();
		User ahmet = new User();
		ahmet.setId(1); 
		ahmet.setEmail("ahmetayneli@gmail.com");
		
		Instructor egitmen = new Instructor();
		egitmen.setId(2);
		egitmen.setEmail("engin@demirog.com");
		egitmen.setFirstName("Engin");
		egitmen.setLastName("Demirog");
		
		Student ogrenci = new Student();
		ogrenci.setId(3);
		ogrenci.setFirstName("Ali");
		ogrenci.setLastName("Ayneli");
		ogrenci.setEmail("ali@ayneli.com");
		
		
	   User[] users = new User[] {ahmet,egitmen,ogrenci};
		
		userManager.addUser(users);
		
		
		

	}

}
