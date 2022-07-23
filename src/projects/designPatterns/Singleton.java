package projects.designPatterns;

public class Singleton {
	public static Singleton _instance = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(_instance == null)_instance = new Singleton();
		
		return _instance;
	}
}
