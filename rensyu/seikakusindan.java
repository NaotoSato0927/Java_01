package rensyu;

import java.util.Scanner;

public class seikakusindan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("あなたの性格を診断します。次の3つの質問に答えてください。");
		System.out.println("あなたの道端に100円玉が落ちていたら？");
		System.out.println("A：交番に届ける。");
		System.out.println("B：ネコババをする。");
		System.out.println("C:見て見ぬふりをする。");
		char c1 = scanner.next().charAt(0);
		if (c1 == 'A') {
			System.out.println("1問目終了。");

		} else if (c1 == 'B') {
			System.out.println("1問目終了。");

		} else if (c1 == 'C') {
			System.out.println("1問目終了。");

		} else {
			System.out.println("正しく入力して下さい。");
			System.exit(0);
		}

		System.out.println("もしあなたの願いが一つ叶うならば？");
		System.out.println("A：長生きをする。");
		System.out.println("B：世界を平和にする。");
		System.out.println("C:大金持ちになる。");
		char c2 = scanner.next().charAt(0);

		if (c2 == 'A') {
			System.out.println("2問目終了。");

		} else if (c2 == 'B') {
			System.out.println("2問目終了。");

		} else if (c2 == 'C') {
			System.out.println("2問目終了。");
		} else {
			System.out.println("正しく入力して下さい。");
			System.exit(0);
		}

		System.out.println("もしあなたが生まれ変わるならば？");
		System.out.println("A:人間になる。");
		System.out.println("B：犬になる。");
		System.out.println("C:猫になる。");
		char c3 = scanner.next().charAt(0);

		if (c3 == 'A') {
			System.out.println("3問目終了。");

		} else if (c3 == 'B') {
			System.out.println("3問目終了。");

		} else if (c3 == 'C') {
			System.out.println("3問目終了。");
		} else {
			System.out.println("正しく入力して下さい。");
			System.exit(0);
		}

		if ((c1 == 'A') && (c2 == 'A') && (c3 == 'A')) {
			System.out.println("あなたは正直な性格です。");
		} else if ((c1 == 'B') && (c2 == 'B') && (c3 == 'B')) {
			System.out.println("あなたは自由気ままな性格です。");
		} else if ((c1 == 'C') && (c2 == 'C') && (c3 == 'C')) {
			System.out.println("あなたは人見知りな性格です。");
		} else if ((c1 == 'A') && (c2 == 'B') && (c3 == 'C')) {
			System.out.println("あなたは積極的な性格です。");
		} else {
			System.out.println("あなたの性格は未知数です。");

		}

	}

}
