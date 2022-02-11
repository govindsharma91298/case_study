package Day6;
import java.util.Scanner;

public class CountLettersInArray {

	public static char[] CreateArray(int a) {
		
		Scanner s = new Scanner(System.in);
		char [] chr1 = new char[a];
		System.out.println("enter"+a+"characters");
		for(int i =0;i<a;i++) {
			
			chr1[i] = s.next().charAt(0);
			
		}
		s.close();
		return chr1;
				
		
	}
	
	public static void displayArray(char[] arr) {
		int j = 0;
		System.out.println("Printing Array");
		for(int i = 0;i<arr.length;i++) {
			if(j==19) {
				System.out.println();
				j=0;
			}
			System.out.print(arr[i]+" ");
			j++;
		}
		
	}
	
	public static void CountLetters(char chr2[]) {
		int count = 0;
		
		for(int i=0;i<chr2.length;i++) {
			count=1;
			for(int j = i+1;j<chr2.length;j++) {
				if(chr2[i] == chr2[j] && chr2[i] !=' ') {
					count++;
					chr2[j] = ' ';
				}
				
			}
			if(chr2[i] != ' ')
			System.out.println(chr2[i] +" "+ count);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = s1.nextInt();
		char chr[] = new char[n];
		chr = CreateArray(n);
		displayArray(chr);
		
		System.out.println("\nCount of letters");
		CountLetters(chr);
		
	}

}