import java.util.*;

public class Switch {
	
	static int k; // 結果の記憶

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] syu = { "グー", "パー", "チョキ" };
		String[] result = { "勝ち", "負け", "引き分け" };
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int win1, win2;
		System.out.println("1 = グー　, 2 = パー , 3 = チョキ , 0 = 終了");
		win1 = 0;
		win2 = 0;
		while (true) {
			int pcHand = rnd.nextInt(3);
			if (win1 == 3 | win2 == 3) {
				break;
			}
			int hand = scan.nextInt();
			switch (hand) {
			case 1:
				hand = hand - 1;
				switch (pcHand) {
				case 0:
					k = 2;
					break;
				case 1:
					k = 1;
					break;
				case 2:
					k = 0;
					break;
				}
				break;
			case 2:
				hand = hand - 1;
				switch (pcHand) {
				case 0:
					k = 0;
					break;
				case 1:
					k = 2;
					break;
				case 2:
					k = 1;
					break;
				}
				break;
			case 3:
				hand = hand - 1;
				switch (pcHand) {
				case 0:
					k = 1;
					break;
				case 1:
					k = 0;
					break;
				case 2:
					k = 2;
					break;
				}
				break;
			}

			System.out.println("あなた：" + syu[hand] + " PC:" + syu[pcHand]);
			System.out.println(result[k]);
			if (k == 0) {
				win1++;
			} else if (k == 1) {
				win2++;
			}
		}
		System.out.println(win1 + "勝" + win2 + "敗");

	}
}
