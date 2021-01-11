package ch05;
import java.util.Arrays;

public class ReferenceAddress {

	public static void main(String[] args) {


		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		int[] array2 = new int[10];//만약 new int [10]이 아니라 =array였으면 array변수도 for each 문을 돌렸을 때 200이 나올 것이다. 같은 곳을 가리키고 있는데 거기서 array[0]을 바꿨으니까.

		array2[0] = 200;

		System.out.println("array의 내용:");
		for (int n : array) {
			System.out.print(n + " ");
		}

		System.out.println("\n\narray2의 내용:");
		for (int n : array2) {
			System.out.print(n + " ");
		}
	}
}