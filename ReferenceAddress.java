package ch05;
import java.util.Arrays;

public class ReferenceAddress {

	public static void main(String[] args) {


		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		int[] array2 = new int[10];//���� new int [10]�� �ƴ϶� =array������ array������ for each ���� ������ �� 200�� ���� ���̴�. ���� ���� ����Ű�� �ִµ� �ű⼭ array[0]�� �ٲ����ϱ�.

		array2[0] = 200;

		System.out.println("array�� ����:");
		for (int n : array) {
			System.out.print(n + " ");
		}

		System.out.println("\n\narray2�� ����:");
		for (int n : array2) {
			System.out.print(n + " ");
		}
	}
}