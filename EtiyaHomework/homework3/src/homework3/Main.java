package homework3;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"Gizem","�zg�n",1998,"1000000"));
		
		
	}

}
