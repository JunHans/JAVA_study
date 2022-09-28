package pracLife01;

import java.util.Arrays;

/*
1. �־��� ����Ʈ���� �ּڰ��� ã�´�.
2. �ּڰ��� �� �� �ڸ��� ���� ��ȯ�Ѵ�.
3. �� �� �ڸ��� ������ ������ ���� �� �ּڰ��� ã�� ���� ���� ������� �ݺ��Ѵ�. 
*/
public class novice_bubble_sort_01 {

	public static void selection_sort(int[] data) {
		selection_sort(data,data.length);
	}
	private static void swap(int[] data , int i , int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	private static void selection_sort(int[] data , int datalength) {
		for(int i = 0 ; i < datalength -1 ; i++) {
			int min_index = i;
			
			//�ּҰ� index  find
			for(int j = i+1; j < datalength; j++) {
				//System.out.println("j:" + j + ",i:" + i);
				if(data[j] < data[min_index]) {
					min_index = j;
				}
			}
			
			//�ڸ� �ٲٱ�
			System.out.println("min_index : " + min_index + "," + i);
			swap(data, min_index , i);
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int[] data = {7,3,2,8,9,4,6,1,5};
		selection_sort(data);
		System.out.println(Arrays.toString(data));
		

	}

}
