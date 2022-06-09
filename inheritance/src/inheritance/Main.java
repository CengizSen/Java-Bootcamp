package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IndividualCustomer individualCustomer =new IndividualCustomer();
		individualCustomer.customerNumber="2656";
		
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.customerNumber="5896";
		
		
		SendikaCustomer customer=new SendikaCustomer();
		customer.customerNumber="1589";
		CustomerManager customerManager=new CustomerManager();
		customerManager.Add(corporateCustomer);
        customerManager.Add(individualCustomer);
        customerManager.Add(customer);
		
        Customer[] customers= {individualCustomer,corporateCustomer,customer};
        System.out.println("----");
		customerManager.addMultiple(customers);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
