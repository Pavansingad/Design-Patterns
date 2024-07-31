package Creational;

class SingletonPattern{
	private static Singleton instance; 
	private SingletonPattern() {
	}
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
		}
}
public class Singleton {
	public static void main(String[] args) {
		Singleton singleton1=SingletonPattern.getInstance();
		Singleton singleton2=SingletonPattern.getInstance();
		//both reference point to the same instance
		System.out.println(singleton1==singleton2);
		// TODO Auto-generated method stub

	}

}
