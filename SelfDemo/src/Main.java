
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		  
		    CustomerManager customerManager=new CustomerManager();
		    Logger logger=new FileLogger();
		   
		    
		    
		    Logger[] loggers= {FileLogger,SmsLogger};
		   customerManager.multiplyAdd(new DatabaseLogger,new SmsLogger());
		    
		     
		   
		   

	}

}
