package dong;

public class SelectionSort {
	public static int[] SSort(int[] arr) {
		int index = 0;
		int min = 0;
		int tmp = 0;
		for(int i = 0; i < arr.length; i++) {
			min = arr[i];
			tmp = arr[i];
			for(int j = i+1; j < arr.length; j++) {
				if(min > arr[j]) {
					index = j;
					min = arr[j];
				}
			}
			
			arr[i] = min;
			arr[index] = tmp;
			
		}
		
		return arr;
	}
	/*시간 복잡도
	 *10 * (10 + 1)/2 = 55
	 * N * (N + 1) /2 
	 * +1 과 /2는 컴퓨터 연산에 큰 영향을 주지 않아 삭제 가능
	 * N^2
	 * O(N^2)
	 * 선택 정령의 시간 복잡도는 O(N^2)이다.
	 */
	
	public static void main(String[] args) {
		int[] arr = {1, 10, 5, 7, 6, 4, 3, 2, 9, 0};
//		for(int e : SSort(arr)) {
//			System.out.println(e);
//		}
		SSort(arr);
	}

}
