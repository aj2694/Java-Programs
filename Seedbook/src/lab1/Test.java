package lab1;

public class Test {

	public static void main(String[] args) {
		MyDate d1=new MyDate(2,3,2017);
		MyDate d2=new MyDate();
		d2.setDay(3);
		d2.setMonth(5);
		d2.setYear(1994);
		System.out.println(d2.toString());
		System.out.println(d1.toString());
	}
}
