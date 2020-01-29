package assign3;
import java.util.ArrayList;
import java.util.Scanner;

interface myMain{
	
	public final int SIZE = 3;
}
public class car_dealer implements myMain{

	public static void main(String[] args) {
		
		ArrayList<Purchaser> v1 = new ArrayList<Purchaser>();
		ArrayList<Service> v2 = new ArrayList<Service>();
		
		String g="";
		double total1=0,total2=0;
		while(true) {
			g = Helper.getString("would you like to add customer(y/n)?");
			if(g.equalsIgnoreCase("y")) {
				
				g = Helper.getString("Which customer you want to add(Purchaser P or Service S)");
				switch(g.toLowerCase()) {
				case "p":
					v1.add(new Purchaser(Helper.getString("Customer Name:"),
												Purchaser.getData("your monthly payments?" )));
					break;
				case "s":
					v2.add(new Service(Helper.getString("Customer Name:"),
											Helper.getString("Service Date ?"),
											Service.getData("Invoice Amount?")));
					break;
				}
			}
			else{
    			System.out.println("you have prefered to exit...");
    			break;
			}
			
			for(int i=0; i<v1.size();i++) {
				System.out.println(v1.get(i));
			}
			for(int i=0; i<v2.size();i++) {
				System.out.println(v2.get(i));
			}
			
		}

	}
}
interface myMethod{
	
	public abstract double showData();
}
 class Customer {
	protected String name;
	
	public Customer(String name) {
		this.name=name;
	}
	public String toString(){
		return "Customer Name: "+ name +",";
	}
}
 
class Purchaser extends Customer{
	private double monthlyPayment;

	public Purchaser(String name, double monthlyPayment) {
		super(name);
		this.monthlyPayment = monthlyPayment;
	}
	
	public static double getData(String prompt) {
		Scanner scan = new Scanner(System.in);
		System.out.println(prompt);
		return scan.nextDouble();
	}
	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	public static double showData() {
		return 0.0;
	}
	public String toString() {
		return super.toString()+" Your Monthly Total Payment: "+ monthlyPayment;
	}
}
class Service extends Customer{
	private String serviceDate;
	private static double invoiceAmount;
	
	public Service(String name, String serviceDate, double invoiceAmount) {
		super(name);
		this.serviceDate = serviceDate;
	this.invoiceAmount = invoiceAmount;
	}

	public static double getData(String amount) {
			Scanner scan = new Scanner(System.in);
			System.out.println(amount);
			return scan.nextDouble();
	}
	
	public static double showData() {
		return invoiceAmount;
	}

	public String toString() {
		return super.toString()+" Invoice Total Amount: " + showData() +" and Service Date: "+ serviceDate;
	}
	
}
class Helper{
	
	public static String getString(String input) {
		Scanner scan = new Scanner(System.in);
		System.out.print(input);
		return scan.nextLine();
	}
} 