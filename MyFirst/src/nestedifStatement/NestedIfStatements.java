package nestedifStatement;

public class NestedIfStatements {

	public static void main(String[] args) {
		int a = 16;
		int b = 15;
		int c = 10;
		
		if(a>b && a>c) {
			System.out.println(a);
		}else {
			if(b>c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}

	}

}
