package chapter4;

public class CircleArray {

	public static void main(String[] args) {
		Circle [] c;
		c = new Circle[5]; //5개의 레퍼런스 배열 생성
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i, (i+1)+"번째 원");
			
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println((int)c[i].getArea()+"");
		}
		

	}

}
