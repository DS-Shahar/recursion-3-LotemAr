package lotem1;

public class Hw11112024 {
	public static String exe22(String word, int i ,String wordNew){
		if( i == word.length()) {
			return wordNew;
		}
		if(i%3 == 0 && i!= 0) {
			wordNew = wordNew + "*";
			
		}
		wordNew = wordNew + word.charAt(i);
		i+=1;
		return exe22(word, i, wordNew);
		 
		
	}

		public static void printLetters(char start, char end) {
		    if (start > end) {
		        return;
		    }
		    System.out.print(start + " ");
		    printLetters((char) (start + 1), end);
		}
		public static void exe25(int num, int i) {
			if(i == num) {
				return;
			}
			if(num% i == 0) {
				System.out.println(i);
				System.out.println("");
			}
			exe25(num, i+1);
		}
		public static void exe26(int num) {
			if(num<10) {
				if(num%2 ==0)
					System.out.println(num);
					return ;
			}
			if((num%10)%2 == 0) {
				System.out.println(num%10);
			}
			exe26(num/10);
		}
		public static void exe27(int num1, int num2) {
			if(num1> 10) {
				return;
			}
	        if (num2 > 10) { // כאשר סיימנו להדפיס את כל המספרים בשורה, עבר לשורה הבאה
	            System.out.println(); // מעבר שורה
	            exe27(num1 + 1, 1); // קריאה לשורה הבאה
	        } else {
	            System.out.print(num1 * num2 + "\t"); // הדפסת התוצאה והוספת רווח טאב
	           exe27(num1, num2 + 1); // קריאה לעמודה הבאה באותה שורה
	        }
		}
		public static void exe28(int num1, int num2) {
			
		}
		public static void printArithmeticSequence(int a1, int d, int n) {
		    // Base case: If n is 0, we've printed all the terms
		    if (n == 0) {
		        return;
		    }

		    // Print the current term
		    System.out.print(a1 + " ");

		    // Recursively print the next n-1 terms
		    printArithmeticSequence(a1 + d, d, n - 1);
		}
	public static void exe29() {
		
	}
	public static void printSequence1(int n) {
	    // Base case: If n is 0, we've printed all the terms
	    if (n == 0) {
	        return;
	    }

	    // Print the current term
	    System.out.print(getTerm(n) + " ");

	    // Recursively print the next n-1 terms
	    printSequence1(n - 1);
	}

	// Helper function to calculate the nth term of the sequence
	private static int getTerm(int n) {
	    if (n == 1) {
	        return 1;
	    } else {
	        return n + getTerm(n - 1);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLetters('c','z');
		exe25(24,1);
		exe26(123);
		exe27(1,1);
		printArithmeticSequence(2,3, 5);
		 printSequence1(7);
		 System.out.println(exe22("lotem", 0, ""));
	}

}
