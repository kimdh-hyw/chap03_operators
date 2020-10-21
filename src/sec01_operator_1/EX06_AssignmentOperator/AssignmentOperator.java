package sec01_operator_1.EX06_AssignmentOperator;

/*대입연산자 및 축약표현*/

public class AssignmentOperator {
	
	public static void main(String[] args) {
		
		//#1. 대입연산자 와 축약 표현
		//@대입연산자
		int value1 = 3;
		value1 = value1+3;
		System.out.println(value1); //6
		System.out.println();
		
		//@축약표현
		int value2;
		value2 = 5; System.out.println(value2+=2); //value2=value2+2; //7
		value2 = 5; System.out.println(value2-=2); //3
		value2 = 5; System.out.println(value2*=2); //10
		value2 = 5; System.out.println(value2/=2); //2
		value2 = 5; System.out.println(value2%=2); //1
		value2 = 5; System.out.println(value2|=2); //7
		value2 = 5; System.out.println(value2<<=2); //20
		value2 = 5; System.out.println(value2>>=2); //1
		value2 = 5; System.out.println(value2>>>=2); //1
		
	}
	
}
