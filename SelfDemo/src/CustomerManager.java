
public class CustomerManager {
	
	public void add(Logger logger) {
		System.out.println("Müþteri Eklendi.");
	      logger.log();
	}
	
	public void multiplyAdd(Logger[] logger) {


		for (Logger loggers : logger) {
		add(loggers);
		}
	}

}
