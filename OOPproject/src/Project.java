import java.util.Scanner;
class Display extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		int years = 0;
		System.out.println("Enter your amount: ");
	    double i=sc.nextDouble();
	    System.out.println("Enter your amount: ");
	    double j=sc.nextDouble();
	    while (i < j) {
	    	double interest = i * .075;
	        i += interest;
	        years ++;
	    }

	    System.out.println("It will take " + years + " years for "+i+" investment to be worth at least "
	    		+j);

	    
	}
	
}
class shareInvestment extends Thread{
	public void run() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your buying price per share : ");
		double buyingprice=sc.nextDouble();
		int day=1;
		
		while(true) {
			System.out.println("Enter your closing price for day : "+day+""
					+ " (any negative value to leave)");
			double closingprice=sc.nextDouble();
			if(closingprice<0.0) {
				break;
			}
			double earning=closingprice-buyingprice;
			if(earning>0.0) {
				System.out.println("After day "+day+" your earning  "+earning+
						"RS per share ");
			}
				else if(earning<0.0) {
					System.out.println("After day "+day+" your have lost "+(-earning)+
							"RS per share ");
				}
				else {
					System.out.println("After day "+day+" you have not eanrings per share ");
				}
			day+=1;
			try {
			Thread.sleep(5000);;}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		sc.close();
	}
	}

class propertyInvestment extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(true) {
		System.out.println("Enter the actual cost of your property no: "+i+
				"(any negative value to leave");
		double price=sc.nextDouble();
		if(price>0.0) {
			System.out.println("Enter the selling price of your property : ");
			double sp=sc.nextDouble();
			
			if(sp>price) {
				double profit=sp-price;
				 
					System.out.println("You have earned "+profit+"RS as a profit on your property");
				}
				else if(sp<price) {
					double lost=price-sp;
					System.out.println("You have lost "+lost+"RS  on your property");
				}
			
			
		}
		else {
			System.out.println("WRONG INPUT!");
		}
		i+=1;
	}
		
	}
 
}
public class Project{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("********WELCOME TO INVESTMENT DEALINGS********");
		while(true) {
		System.out.println("Press 1 for share investments "
				+ "press 2 for property investments"+
				"press 3 for knowing your interest rate");
		System.out.println("Enter your choice : ");
		int a=sc.nextInt();
		if(a==1) {
		shareInvestment s1=new shareInvestment();
		s1.run();
	}
		else if(a==2) {
			propertyInvestment p1=new propertyInvestment();
			p1.start();
		}
		else if(a==3) {
			Display d=new Display();
			d.start();
		}
		else {
			System.out.println("WRONG CHOICE!");
		}
		sc.close();
}
}
}