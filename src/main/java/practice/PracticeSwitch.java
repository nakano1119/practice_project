package practice;

public class PracticeSwitch {

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 4, 3, 1, 5, 1, 5, 5 };

		for (int job : array) {
			switch (job) {
			case 1:
				System.out.println("勇者");
				break;

			case 2:
				System.out.println("バトルマスター");
				break;

			case 3:
				System.out.println("パラディン");
				break;

			case 4:
				System.out.println("海賊");
				break;

			case 5:
				System.out.println("魔法剣士");
				break;
			}
		}
	}

}
