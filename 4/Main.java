public class Main {
	public static void main(String[] args) {

		int number = 9119;
		int answer =0; 

		for(int i=999;i>=100;i--) {
			for (int j=999;j>=100;j--) {
				number = i*j;
				if(setup(number)){
					answer = i*j;
					break;
				}

			}
		}

		System.out.println("Answer: " + answer);


	}

	public static boolean setup(int number){
		String palString = Integer.toString(number);

		String[] palArray = new String[palString.length()];
		String[] reversePalArray = new String[palString.length()];

		int reversePalArrayLen = reversePalArray.length - 1; 

		for (int i=0;i<palArray.length;i++) {
			palArray[i] = palString.substring(i,i+1);
			reversePalArray[reversePalArrayLen] = palArray[i];
			reversePalArrayLen--;
		}

		//printArray(palArray, "palArray");
		//printArray(reversePalArray, "reversePalArray");

		//System.out.println("checkPal: " + checkPal(palArray, reversePalArray, reversePalArrayLen));

		return checkPal(palArray, reversePalArray, reversePalArrayLen);
	}
	
	public static boolean checkPal(String[] pal, String[] revPal, int revPalLen){
		boolean status = false;

		for (int i=0;i<pal.length;i++) {
			if (revPal[i].equals(pal[i])) {
				status = true;
			}else{
				status = false;
			}
			
		}

		return status;
	}

	public static void printArray(String [] a, String name){
		System.out.println(name + ": ");
		for (String x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println();
	}

}