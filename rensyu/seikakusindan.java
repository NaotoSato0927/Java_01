package rensyu;

import java.util.Scanner;

public class seikakusindan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���Ȃ��̐��i��f�f���܂��B����3�̎���ɓ����Ă��������B");
		System.out.println("���Ȃ��̓��[��100�~�ʂ������Ă�����H");
		System.out.println("A�F��Ԃɓ͂���B");
		System.out.println("B�F�l�R�o�o������B");
		System.out.println("C:���Č��ʂӂ������B");
		char c1 = scanner.next().charAt(0);
		if (c1 == 'A') {
			System.out.println("1��ڏI���B");

		} else if (c1 == 'B') {
			System.out.println("1��ڏI���B");

		} else if (c1 == 'C') {
			System.out.println("1��ڏI���B");

		} else {
			System.out.println("���������͂��ĉ������B");
			System.exit(0);
		}

		System.out.println("�������Ȃ��̊肢��������Ȃ�΁H");
		System.out.println("A�F������������B");
		System.out.println("B�F���E�𕽘a�ɂ���B");
		System.out.println("C:��������ɂȂ�B");
		char c2 = scanner.next().charAt(0);

		if (c2 == 'A') {
			System.out.println("2��ڏI���B");

		} else if (c2 == 'B') {
			System.out.println("2��ڏI���B");

		} else if (c2 == 'C') {
			System.out.println("2��ڏI���B");
		} else {
			System.out.println("���������͂��ĉ������B");
			System.exit(0);
		}

		System.out.println("�������Ȃ������܂�ς��Ȃ�΁H");
		System.out.println("A:�l�ԂɂȂ�B");
		System.out.println("B�F���ɂȂ�B");
		System.out.println("C:�L�ɂȂ�B");
		char c3 = scanner.next().charAt(0);

		if (c3 == 'A') {
			System.out.println("3��ڏI���B");

		} else if (c3 == 'B') {
			System.out.println("3��ڏI���B");

		} else if (c3 == 'C') {
			System.out.println("3��ڏI���B");
		} else {
			System.out.println("���������͂��ĉ������B");
			System.exit(0);
		}

		if ((c1 == 'A') && (c2 == 'A') && (c3 == 'A')) {
			System.out.println("���Ȃ��͐����Ȑ��i�ł��B");
		} else if ((c1 == 'B') && (c2 == 'B') && (c3 == 'B')) {
			System.out.println("���Ȃ��͎��R�C�܂܂Ȑ��i�ł��B");
		} else if ((c1 == 'C') && (c2 == 'C') && (c3 == 'C')) {
			System.out.println("���Ȃ��͐l���m��Ȑ��i�ł��B");
		} else if ((c1 == 'A') && (c2 == 'B') && (c3 == 'C')) {
			System.out.println("���Ȃ��͐ϋɓI�Ȑ��i�ł��B");
		} else {
			System.out.println("���Ȃ��̐��i�͖��m���ł��B");

		}

	}

}
