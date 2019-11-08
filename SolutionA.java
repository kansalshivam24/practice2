import java.util.*;
class SolutionA {
int find(int[] array, int n) {
		int beg= 1;
		int end= n;
		int pos= -1;
		while (beg <= end) {

			int mid= (beg + end) / 2;

			if (array[mid] == mid) {
				pos= mid;
				end= mid - 1;
			}
			if (array[mid] < mid) {
				beg= mid + 1;
			} else if (array[mid] > mid) {
				end= mid - 1;
			}
		}

		return pos;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		SolutionA ab = new SolutionA();

		int k= ab.find(arr, n);
		if (k != -1) {
			System.out.print(k);
		} else
			System.out.print("NOT_FOUND");

	}
}