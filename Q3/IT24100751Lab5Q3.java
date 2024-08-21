import java.util.Scanner;
	public class IT24100751Lab5Q3{
		public static void main(String[] args){
			final double roomCharge=48000;
			final double discount1=0.1;
			final double discount2=0.2;
		
			Scanner scanner=new Scanner(System.in);
			
			System.out.print("Enter the start date:");
			int startDate=scanner.nextInt();
			
			System.out.print("Enter the end date:");
			int endDate=scanner.nextInt();
			
			if (startDate<1 || startDate>31||endDate<1||endDate>31){
				System.out.println("Error:Dates must be between 1 and 31");
				return;
			}
			if (startDate>=endDate){
				System.out.println("Error:Start date must be less than the end date");
				return;
			}
			int daysReserved=endDate-startDate;
			double totalAmount=roomCharge*daysReserved;
			double discountAmount;

			if(daysReserved>=3 && daysReserved<=4){
				discountAmount=totalAmount*discount1;
				totalAmount=totalAmount-discountAmount;
			}
			else if (daysReserved>=5){
				discountAmount=totalAmount*discount2;
				totalAmount=totalAmount-discountAmount;
			}
			System.out.println();
			System.out.println("Room charge per day:"+roomCharge);
			System.out.println("Number of days reserved:"+daysReserved);
			System.out.println("Total amount to be paid:"+totalAmount);
		}
	}
			
