import java.util.Scanner;
class Display extends Thread{
	/* In class display we will simply deal with the investments including interest 
	 * and this class will help you to know about your interest rate or gain after 
	 * specific years
	 */
	public void run() {
		/*run method contains calculations for interest dealings and will
		 * tell user that how many years they will have to wait for their desired
		 *  amount.
		 */
		while(true) {
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
	    }//end of while loop

	    System.out.println("It will take " + years + " years for "+i+" investment to be worth at least "
	    		+j);
	    System.out.println("Enter "+ "y"+" to continue and "+ "n" +" to quite");
		char p=sc.next().charAt(0);
		if(p=='y') {
			continue;
		}
		else {
			break;
		}
		}

	    
	}// end of run method
	
}//end of Display  class
class shareInvestment extends Thread{
	public void run() {
		/* In  share investment class we will deal with share investments 
		 * and its leading profit or loss.And also we can calculate our profit or 
		 * loss for each day according to spended buying price and current 
		 * market price.
		 */
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
			System.out.println("Enter "+ "y"+" to continue and "+ "n" +" to quite");
			char p=sc.next().charAt(0);
			if(p=='y') {
				continue;
			}
			else {
				break;
			}
			
		}//end of while loop
		sc.close();
	}// end of run method
	}//end of class

class propertyInvestment extends Thread{
	/*if you have invested for property or you are on your way to
	 * then this will help you found out about your profit or loss for each investment.
	 */
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
		System.out.println("Enter "+ "y"+" to continue and "+ "n" +" to quite");
		char p=sc.next().charAt(0);
		if(p=='y') {
			continue;
		}
		else {
			break;
		}
	}//end of while loop
		
	}// end of run method
 
}// end of class
public class Project{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("********WELCOME TO INVESTMENT DEALINGS********");
		while(true) {
		System.out.println("Press 1 for share investments "
				+ "press 2 for property investments"+
				"press 3 for knowing your interest rate");
		/*when the user will enter his choice , the leading class object will be
		 * created and it will follow it's respective code.
		 */
		System.out.println("Enter your choice : ");
		int a=sc.nextInt();
		if(a==1) {
		shareInvestment s1=new shareInvestment();
		s1.run();
	}
		else if(a==2) {
			propertyInvestment p1=new propertyInvestment();
			p1.run();
		}
		else if(a==3) {
			Display d=new Display();
			d.run();
		}
		else {
			System.out.println("WRONG CHOICE!");
		}
	
		
}//end of while loop
}//end of main method
}// end of public class Project