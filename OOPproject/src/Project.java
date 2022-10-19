import java.util.Scanner;
class Display extends Thread{
	/* In class display we will simply deal with the investments including interest 
	 * and this class will help you to know about your interest rate or gain after 
	 * specific years
	 */
	public void run() {
		Scanner sc=new Scanner(System.in);
		/*run method contains calculations for interest dealings and will
		 * tell user that how many years they will have to wait for their desired
		 *  amount.
		 */
		while(true) {
		System.out.println("press 1 for simple interest"+" OR press 2 for compound interest : ");
		int i=sc.nextInt();
	    if(i==1) {
	    	System.out.println("Enter the principal amount: ");
	    	double p=sc.nextDouble();
	    	System.out.println("Enter the rate : ");
	    	double r=sc.nextDouble();
	    	System.out.println("Enter the time: ");
	    	double t=sc.nextDouble();
	    	double sinterest=(p*r*t)/100;
	    	System.out.println("The simple interest will be "+sinterest+" of "+(int)t+" years");
	    	}
	    else if(i==2) {
	    	System.out.println("Enter the principal amount: ");
	    	double p=sc.nextDouble();
	    	System.out.println("Enter the rate : ");
	    	double r=sc.nextDouble();
	    	System.out.println("Enter the time: ");
	    	double t=sc.nextDouble();
	    	System.out.println("Enter number of time interest will be compounded : ");
	    	int no=sc.nextInt();
	    	double cinterest=p*(Math.pow((1+ r/no),(t*no)));
	    	
	    	System.out.println("The compound interest will be "+cinterest+" of "+(int)t+" years");
	    	
	    }
	    else {
	    	System.out.println("WRONG CHOICE!");
	    }
		
	    System.out.println("Enter "+ "y"+" to continue and "+ "n" +" to go back to the menue");
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
		System.out.println("***WELCOME TO STOCK EXCHANGES***");
		System.out.println("Enter your buying price per share : ");
		long buyingprice=sc.nextLong();
		int day=1;
		
		while(true) {
			System.out.println("Enter your closing price for day : "+day+""
					+ " (any negative value to leave)");
			long closingprice=sc.nextLong();
			if(closingprice<0.0) {
				break;
			}
			long earning=closingprice-buyingprice;
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
			System.out.println("Enter "+ "y"+" to continue and "+ "n" +" to go back to the menue");
			char p=sc.next().charAt(0);
			if(p=='y') {
				continue;
			}
			else {
				break;
			}
			
		}//end of while loop
	
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
		System.out.println("Enter "+ "y"+" to continue and "+ "n" +" to go back to the menue");
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
class bitcoinInvestment extends Thread{
	public void run() {
		Scanner sc=new Scanner (System.in);
		while(true) {
		System.out.println("Enter current rate of 1 BTC : ");
	    double bt=sc.nextDouble();
	    System.out.println("Enter your investment : ");
	    double nt=sc.nextDouble();
	    double t=nt/bt;
	    System.out.println("You will get "+t+" bitcoin from "+nt+" $");
	    System.out.println(" Now Enter future rate of 1 BTC : ");
	    double tt=sc.nextDouble();
	    double an=(t*tt)-nt;
	    if(tt>bt) {
	    System.out.println("If bitcoin price goes "+tt+" than You will earn "+(an)+
	    		"$ ");
	    }
	    else if(tt<bt) {
	    	System.out.println("If bitcoin price goes "+(tt)+" than You will loose "+(-an)+
		    		"$ ");
	    }
	    System.out.println("Enter "+ "y"+" to continue and "+ "n" +" to go back to the menue");
		char p=sc.next().charAt(0);
		if(p=='y') {
			continue;
		}
		else {
			break;
		}
	}
	}
}
public class Project extends Thread{
	public static void main(String[] args) {
		//Threading
		System.out.println("HELLO!\n");
		try {
		Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("THERE \n");
		try {
			Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		System.out.println("21SW048 \n");
		try {
			Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}//sleep method of Thread for blinking
		Scanner sc=new Scanner(System.in);
		System.out.println("********WELCOME TO INVESTMENT DEALINGS CALCULATOR********");
		while(true) {
		System.out.println("Press 1 for share investments \n"
				+ "press 2 for property investments\n"+
				"press 3 for knowing your interest rate\n"+
				"press 4 for Bitcoin investments\n"+
				"press 5 to exit\n");
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
		else if(a==4) {
			bitcoinInvestment bi=new bitcoinInvestment();
			bi.run();
		}
		else if(a==5) {
			System.out.println("********THANK YOU FOR INTERACTING!***********");
			break;
		}
		else {
			System.out.println("WRONG CHOICE!");
		}
	
		
}//end of while loop
}//end of main method
}// end of public class Project