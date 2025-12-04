public class ArrayFunctions{



	public static int arrayLargest(int[] arr){

		int largest = arr[0];

		for(int count = 1; count < arr.length; count++){

			if(arr[count] > largest){

				largest = arr[count];
			}

		}

		return largest;


	}



	public static int[] oddPositions(int[] arr){

		int newLength = 0;

		if(arr.length % 2 != 0){
			
			newLength = (arr.length + 1) / 2;

		}else{

			newLength = arr.length / 2;

		}
		int[] oddDisplay = new int[newLength]; 


		int index = 0;
		for(int count = 0; count < arr.length; count += 2){

			oddDisplay[index] = arr[count];
			index++;
		}

		return oddDisplay;

	}




	public static int[] evenPositions(int[] arr){

		int newLength = arr.length / 2;
		int[] evenDisplay = new int[newLength]; 

		int index = 0;
		for(int count = 1; count < arr.length; count += 2){

			evenDisplay[index] = arr[count];
			index++;

		}

		return evenDisplay;

	}



	public static int sumOf(int[] arr){

		int total = 0;

		for(int count = 0; count < arr.length; count++){

			total += arr[count];

		}

		return total;

	}



	public static boolean arrChecker(int[] arr, int number){

		for(int count = 0; count < arr.length; count++){

			if(number == arr[count]){

				return true;

			}

		}

		return false;

	}



	public static boolean isPalindrome(String word){

		word = word.toLowerCase();

		int wordStart = 0;
		int wordEnd = word.length() - 1;

		while(wordStart < wordEnd){

			if(word.charAt(wordStart) != word.charAt(wordEnd)){

				return false;

			}

			wordStart++;
			wordEnd--;

		}

		return true;

	}




	public static int[] reverse(int[] arr){

		int[] reversed = new int[arr.length];

		int index = 0;
		for(int count = arr.length -1; count >= 0; count--){

			reversed[index] = arr[count];
			index++;
		}

		return reversed;

	}



	public static int[] joinArray(int[] arrOne, int[] arrTwo){

		int newLength = arrOne.length + arrTwo.length;
		int[] combined = new int[newLength];

		int index = 0;
		int counter = 0;
		for(int count = 0; count <= combined.length; count++){

//			combined[index] = arrOne[count];

			if(count <= arrOne.length){

				combined[index] = arrOne[count];
				index++;

			}else{

				combined[index] = arrTwo[counter];
				counter++;
			
			}
		



		}

		return combined;


	}




	public static int[] arrayCombined(int[] arrOne, int[] arrTwo){

		int newLength = arrOne.length + arrTwo.length;
		int [] output = new int [newLength]; 
	
		int counter = 0;
		for(int count = 0; count<= newLength; count++){

			if(count % 2 != 0){

				output[] = arrOne[counter];
				counter++;

			}else{

				output[] = arrTwo[counter];
				counter++

			}

		}

		return output;


	}








}