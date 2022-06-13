package core;

import jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements JLoggerService{

	@Override
	public void logToSystem(String message) {
		// TODO Auto-generated method stub
		JLoggerManager manager=new JLoggerManager();
		manager.log(message);

	}

}
