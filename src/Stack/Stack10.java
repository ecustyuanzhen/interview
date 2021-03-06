import java.util.*;

class Stack10 {

	public static void main(String[] args) {
		int[] arr = new int[]{3, 4, 5, 1, 2};
		int num = 3;
		int res = getNum(arr, num);
		System.out.println("Result is "+res);
	}

	public static int getNum(int[] arr, int num) {
		if(arr == null || arr.length == 0) {
			return 0;
		}
		LinkedList<Integer> qmin = new LinkedList<Integer>();
		LinkedList<Integer> qmax = new LinkedList<Integer>();
		int i = 0;
		int j = 0;
		int res = 0;
		while(i < arr.length) {
			while(j < arr.length) {
				while(!qmin.isEmpty() && arr[qmin.peekLast()] >= arr[j]) {
					qmin.pollLast();
				}
				qmin.addLast(j);
				while(!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[j]) {
					qmax.pollLast();
				}
				qmax.addLast(j);
				if(arr[qmax.getFirst()] - arr[qmin.getFirst()] > num) {
					break;
				}
				j++;
			}
			if(qmin.peekFirst() == i) {
				qmin.pollFirst();
			}
			if(qmax.peekFirst() == i) {
				qmax.pollFirst();
			}

			res += j -i;
			i++;
		}
		return res;
	}
}


