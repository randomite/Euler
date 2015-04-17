public class Main {
	public static void main(String[] args) {
		int ORIGINAL_NUMBER = 9119;

		String palString = Integer.toString(ORIGINAL_NUMBER);

		String[] palArray = new String[palString.length()];
		String[] reversePalArray = new String[palString.length()];

		int reversePalArrayLen = reversePalArray.length - 1; 

		for (int i=0;i<palArray.length;i++) {
			palArray[i] = palString.substring(i,i+1);
			reversePalArray[reversePalArrayLen] = palArray[i];
			reversePalArrayLen--;
		}

		printArray(palArray, "palArray");
		printArray(reversePalArray, "reversePalArray");

		System.out.println("checkPal: " + checkPal(palArray, reversePalArray, reversePalArrayLen));
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