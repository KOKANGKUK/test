package chapter3;

import java.util.Scanner;

public class prac01ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5]; //배열 생성
		int max = 0; //현재 가장 큰 수를 담을 변수
		
		System.out.println("양수 다섯개 입력해라.");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max) {
				max = intArray[i];
			}
			
		}
		System.out.println("가장큰 수는 " + max + " 이다.");
		scanner.close();
	}

}
