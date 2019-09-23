package HW1;

public class SequentialSearch {

	public static void main(String[] args) {
		int x = 1;
		int S[] = {5, 4, 1, 2};
		int location = 1;
		while (location <= S.length && S[location-1] != x) {
			location ++;
		} if (location > S.length) {
			location = 0;
		}
		System.out.print("欲求數字在第" + location + "位");
	}

}
