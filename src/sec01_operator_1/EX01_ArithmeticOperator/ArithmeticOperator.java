package sec01_operator_1.EX01_ArithmeticOperator;

/*산술연산자와 세가지 경우의 증감연산자*/

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		//#1. 산술연산자
		System.out.println(2+3);
		System.out.println(8-5);
		System.out.println(7*2);
		System.out.println(7/2); //3
		System.out.println(8%5); //3
		System.out.println();
		
		//#2. 증감연산자 @case1
		int value1 = 3;
		value1++;
		System.out.println(value1); //4
		
		int value2 = 3;
		++value2;
		System.out.println(value2); //4		
		System.out.println();
		
		//#3. 증감연산자 @case2
		int value3 = 3;
		int value4 = value3++;
		System.out.println(value3); //4
		System.out.println(value4); //3
		System.out.println();
		
		int value5 = 3;
		int value6 = ++value5;
		System.out.println(value5); //4
		System.out.println(value6); //4		
		System.out.println();
				
		//#4. 증감연산자 @case3
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;
		System.out.println(value7); //2
		System.out.println(value8); //5
		System.out.println(value9); //10
		
	}
	
}

