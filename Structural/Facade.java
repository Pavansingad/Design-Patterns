package Structural;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface MobileShop{
	public void modelNo();
	public void price();
	
}
class Iphone implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("iphone 16");// TODO Auto-generated method stub
		
	}

	@Override
	public void price() {
		System.out.println("50000");// TODO Auto-generated method stub
		
	}
	
}
class Samsuang implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("S21 Ultra pro max");// TODO Auto-generated method stub
		
	}

	@Override
	public void price() {
		System.out.println("70000");// TODO Auto-generated method stub
		
	}
	
}
class BlackBerry implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("BlackBerry z1");// TODO Auto-generated method stub
		
	}

	@Override
	public void price() {
		System.out.println("40000");// TODO Auto-generated method stub
		
	}
	
	
}
class ShopKeeper{
	private MobileShop Iphone;
	private MobileShop Samsuang;
	private MobileShop BlackBerry;
	  
	public ShopKeeper() {
		Iphone=new Iphone();
		Samsuang=new Samsuang();
		BlackBerry=new BlackBerry();
	}
	public void IphoneSale() {
		Iphone.modelNo();
		Iphone.price();
	}
	public void SamsuangSale() {
		Iphone.modelNo();
		Iphone.price();
	}

	public void BlackBerrySale() {
		Iphone.modelNo();
		Iphone.price();
	}

}
public class Facade {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int choice;
		do{// TODO Auto-generated method stub
			System.out.println("======Mobile Shop======");
			System.out.println("   1.IPHONE   \n");
			System.out.println("   2.SAMSUANG   \n");
			System.out.println("   3.BLACKBERRY   \n");
			System.out.println("   4.EXIT   \n");
			System.out.println("enter your choice");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			choice=Integer.parseInt(br.readLine());
			ShopKeeper sk=new ShopKeeper();
			
			switch(choice) {
			case 1:
			{
				sk.IphoneSale();
				System.out.println("thank you! visit once again");
			}
			break;
			case 2:
			{
				sk.SamsuangSale();
			}
			break;
			case 3:
			{
				sk.BlackBerrySale();
			}
			break;
			default:
			{
				System.out.println("nothing you purchased");
			}
			return;
			
			}

		}while(choice!=4);

	}

}
