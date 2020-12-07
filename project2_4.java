import java.util.Scanner; //Import Scanner to use to input number of years
public class project2_4 { //Initialize class project2_4
	public static void main(String [] args) {     //Initialize the environment
		Scanner input = new Scanner(System.in); //Instantiate Scanner object
		int years, minutes;  //Declare variable years and minutes of type int
		
		System.out.print("Enter the number of years: ");  //Ask user of number of years
		years = input.nextInt(); //Take in input
		
		minutes = (years * 525600);       //Convert the amount of years to minutes
		
		System.out.print("The amount of minutes that is: ");  //Print out the number of minutes line
		System.out.println(minutes);  //Print out the answer
		
	}

}
