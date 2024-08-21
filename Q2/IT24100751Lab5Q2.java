import java.util.Scanner;
public class IT24100751Lab5Q2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of new members introduced:");
		int noOfMembers=scanner.nextInt();
		if(noOfMembers<0){
			System.out.println("Input must be a number 0 or greater");
		}
		String Prize;
		switch(noOfMembers){

			case 0:Prize="No Prize";
				break;
			case 1:Prize="pen";
				break;
			case 2:Prize="Umbrella";
				break;
			case 3:Prize="Bag";
				break;
			case 4:Prize="Travelling Chair";
				break;
			default:Prize="Headset";
		}
		System.out.println();
		System.out.println("Prize is a:"+Prize);
	}
}