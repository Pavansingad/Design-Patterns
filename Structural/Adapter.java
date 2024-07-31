package Structural;

interface Turkey{
	void gobble();
	void fly();
	
}
interface Duck{
	void quack();
	void fly();
	
}

class MallardDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("Quack!");// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("Flying!");// TODO Auto-generated method stub
		
	}
	
}
//Adapter that makes Duck compatible with turkey
class DuckAdapter implements Turkey{
	private Duck duck;
	public DuckAdapter(Duck duck) {
		this.duck=duck;
	}

	@Override
	public void gobble() {
		duck.quack();// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		duck.fly();// TODO Auto-generated method stub
		
	}
	
}
public class Adapter {

	public static void main(String[] args) {
	MallardDuck	s1=new MallardDuck();
	DuckAdapter s2=new DuckAdapter(s1);
	s1.quack();
	s1.fly();// TODO Auto-generated method stub

	}

}
