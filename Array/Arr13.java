//13. Write a Java program to find duplicate values in an array of string values.

public class Arr13{
	public static void main(String[] args){
		String arr[] = {"Himesh", "Jeel" , "Meet" , "Dhruv" , "ZafarSir","Himesh" , "Dhruv"};
		System.out.println("The common elements of this two arrays is :- ");
		for(int i = 0; i < arr.length ; i++){
			for(int j = 0; j < arr.length ; j++){
				if(i != j){
					if(arr[i] == arr[j]){
						System.out.println(arr[i]);
					}
				}
			}
		}
	}

}