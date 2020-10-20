package chapter3;

public class prac02checktime {

	public static void main(String[] args) {
		int tenArray[] = new int[10];
		
		System.out.println("tenArray's length is.... " + tenArray.length);
		
		for (int i = 0; i < tenArray.length; i++) {
			tenArray[i] = i+1;
			
		}
		int sum = 0; //더한값을 저장하는 변수
		for (int i : tenArray) {
			sum +=i;
		}
		
		System.out.println("더한값은 55? " + sum);

	}

}
