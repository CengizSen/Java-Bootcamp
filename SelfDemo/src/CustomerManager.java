
public class CustomerManager {
	
	public void add(Logger logger) {
		System.out.println("M��teri Eklendi.");
	      logger.log();
	}
	
	public void multiplyAdd(Logger[] logger) {


		for (Logger loggers : logger) {
		add(loggers);
		}
	}

}
