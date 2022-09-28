package pracLife02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Collection_Exercise_01 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hap = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		//(1)알맞은 코드를 넣어 완성하시오
		//교집합 방법  =  3, 4가 교집합부분이니 그부분을 뜻하는 배열만들기
		for(int i=0; i<list1.size(); i++) {
			if(list2.contains(list1.get(i))) {
				kyo.add(list1.get(i));
			}
		}
		//또다른 교집합 방법
		ArrayList kyo2 = new ArrayList(list1);
		kyo2.retainAll(list2); //[3, 4]
		System.out.println("kyo2="+kyo2);
		
		//차집합 만들기
		for(int i =0; i<list1.size(); i++){
			if(!(list2.contains(list1.get(i)))) {
				cha.add(list1.get(i));
			}
		}
		//또다른 차집합 방법
		//cha2와 list2rk 중복값이 있다면 그 값을 cha2에서 삭제함
		ArrayList cha2 = new ArrayList(list1);
		cha2.removeAll(list2);
		System.out.println("cha2="+cha2);
		
		//합집합
		HashSet setHap = new HashSet(hap);
		setHap.addAll(list1);
		setHap.addAll(list2);
		hap = new ArrayList(setHap);
		
		//또다른 합집합 방법
		ArrayList hap2 = new ArrayList();
		for(int i=0; i<list1.size(); i++) {
			if(!(list2.contains(list1.get(i)))) {
				hap2.add(list1.get(i));
			}
		}
		hap2.addAll(list2);
		System.out.println("hap2="+hap2);
		
//		kyo.add(3);
//		kyo.add(4);
//		
//		cha.add(1);
//		cha.add(2);
//		
//		hap.add(1);
//		hap.add(2);
//		hap.add(3);
//		hap.add(4);
//		hap.add(5);
//		hap.add(6);
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);

		System.out.println("최솟값="+arr[0]+"최댓값="+arr[n-1]);
		for(int a : arr) {
			System.out.println(a);
		}  
		
		
		
	}

}
