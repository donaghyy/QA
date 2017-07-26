package Intermediate;

public class BlackJack {

	public static void main(String[] args) {

		System.out.println(BlackJack(21, 8));
		System.out.println("________________________");
		System.out.println(BlackJack(1, 22));

	}

	public static int BlackJack(int a, int b) {

		if ((a & b) > 21) {
			System.out.println("Both Bust!");
			return 0;
		}

		if (a > 21 && b <= 21) {

			return b;
		}

		if (b > 21 && a <= 21) {

			return a;
		}

		if (a == 21 || b == 21) {
			System.out.println("BlackJack!");
		}

		if ((a == b) | (b == a)) {
			System.out.println("Tie!");
			return a;
		}

		else if (a > b) {
			return a;
		} else {
			return b;
		}

	}

}
