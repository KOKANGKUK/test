package chapter4;
class Human{
	String name;
	int age;
	double height;
	double weight;
	public Human() {
		System.out.println("디폴트생성자");
	}
	public Human(String name) {
		this.name = name;
	}
	
}
public class HumanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human aHuman = new Human("홍길동");
		aHuman.age = 21;
		aHuman.height = 180.5D;
		aHuman.weight = 73.2D;
		
		Human[] people;
		people = new Human[5];
		for (int i = 0; i < people.length; i++) {
			people[i] = new Human();
		}
	}

}
