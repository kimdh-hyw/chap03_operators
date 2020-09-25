package sec01_operator_1.EX04_RelationOperator;

public class RelationOperator {
	public static void main(String[] args) {
		
		//#1. 크기비교 (<, >, <=, >=) : true, false
		System.out.println(5<2); //false
		System.out.println(5>2); //true
		System.out.println(5<5); //false
		System.out.println(5<=5); //true
		System.out.println(5>=5); //true
		System.out.println();
		
		//#2. 등가비교(==, !=) : true, false
//		int a = 5;
//		System.out.println(a=2); //false
		System.out.println(5==2); //false
		System.out.println(5!=2); //true
		System.out.println(5==5); //true 
		System.out.println(5!=5); //false
		System.out.println();
		
		//@ 참조자료형 등가비교
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2); //false
	}
}
