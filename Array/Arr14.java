//14. Write a Java program to find common elements between two arrays (string values).


public class Arr14{
	public static void main(String[] args){
		String arr[] = {"Himesh", "Jeel" , "Meet" , "Dhruv" , "ZafarSir"};
		String arr2[] = {"Anil" , "Mohak" , "ShreySir" , "Himesh" , "Meet"};
		System.out.println("The common elements of this two arrays is :- ");
		for(int i = 0; i < arr.length ; i++){
			for(int j = 0; j < arr2.length ; j++){
				if(arr[i] == arr2[j]){
					System.out.println(arr2[j]);
				}
			}
		}
	}

}