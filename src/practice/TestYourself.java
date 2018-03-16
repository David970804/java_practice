package practice;

public class TestYourself {
	static void f(int[] A) {
		A[0]=10;
		A=null;
	}
	public static void main(String[] args) {
		int A[] = new int[3];
		A[0]=1;
		f(A);
		System.out.print(A[0]);
	}
}
