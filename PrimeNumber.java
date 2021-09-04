package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 7;
		int flag = 0;
		for (int i = 2; i<input; i++) {
			if(input%i ==0) {
				flag = 1;
				System.out.println(input+ " is not a Prime Number");
				break;
			}
		}
		if (flag == 0) {
			System.out.println(input+ " is a Prime Number");
		}
	}

}