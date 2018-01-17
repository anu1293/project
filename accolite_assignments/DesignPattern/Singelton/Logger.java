package Singelton;

public class Logger implements ILogger {
	
	private volatile static Logger obj;
	private Logger(){}
	
	public static Logger getInstance(){
		if(obj == null){
			synchronized (Logger.class) {
				if(obj == null){
					obj = new Logger();
				}
			}
		}
		return obj;
	}

	@Override
	public void Log(String s) {
		System.out.print("Logged ");
		System.out.print(s+"\n");	
	}
	

}
