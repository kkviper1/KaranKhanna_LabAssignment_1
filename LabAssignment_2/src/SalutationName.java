/**
 * 
 * @author karan
 *
 *	Desc : Takes a jagged array of Salutations and names and joins them systematically
 *
 */


public class SalutationName {

	public static void main(String[] args) {
		//Decleration, Insantiation and Initialization
		String salName[][] = new String[2][];
		salName[0] = new String[]{"Mr", "Ms", "Mrs"};
		salName[1] = new String[]{"Pratik", "Aishwarya", "Surya", "Dushyant", "Somesh", "Praveen"};
		
		
		//The loop traverses through the list of the names and displays the appropriate output
		for(int i=0;i<6;i++)
		{
			if(salName[1][i] == "Pratik" || salName[1][i] == "Dushyant" || salName[1][i] == "Somesh" || 
					salName[1][i] == "Praveen") //If the names are male
			{
				System.out.println(salName[0][0]+" "+salName[1][i]);
			}
			else if(salName[1][i] == "Surya") //If the name is female and unmarried
				System.out.println(salName[0][1]+" "+salName[1][i]);
			else 	//If the name is female and married
				System.out.println(salName[0][2]+" "+salName[1][i]);
		}
		

	}

}
