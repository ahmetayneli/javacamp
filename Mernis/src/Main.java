import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		 BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		 
	     customerManager.save(new Customer(1,"Ahmet","Ayneli",LocalDate.of(1980,07,01) ,"11111113455"));

	}

}
