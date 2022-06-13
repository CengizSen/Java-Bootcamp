package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new EmailLogger(),new FileLogger(),new DatabaseLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		 
		Customer c1=new Customer(1," Ahmet","Þen");
		customerManager.add(c1);
		
	}

}
