package practice;

public class TestClass {
	public static void main(String[] args) {
		int[] A = {22,0,-5,0,126};
		System.out.print("passing£» ");
	    Print(A);
	    System.out.print("to ");
	    Print(NonZeros(A));
	    System.out.println();
	}
	public static void Print(int[] A) {
	System.out.print("[");
	for (int i =0;i<A.length;i++) {
		System.out.print(A[i] + " ");
	}
	System.out.print("]");
}
	public static int[] NonZeros(int[] A) {
	int nonz = 0,k=0;
	for(int i =0; i<A.length;i++) {
		if (A[i]!=0)
			nonz++;
	}
	int[] B = new int[nonz];
	for(int j = 0; j<A.length;j++) {
		if(A[j]!=0) {
			B[k]=A[j];
			k++;
		}
	}
	return B;
}
}
