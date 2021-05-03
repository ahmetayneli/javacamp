
public class InstructorManager extends UserManager {
	
	@Override
public void addUser(User[] users) {
		
		for (User user2 : users) {
			System.out.println(user2.email + " Email adresiyle Eðitmen oluþturuldu" );
		}
	}

}
