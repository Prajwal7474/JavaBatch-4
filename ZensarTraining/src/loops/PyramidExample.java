package loops;

public class PyramidExample {
	public static void main(String[] args) {
		int i,j,rows=5;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;++j) {
				System.out.print("*   ");
			}
			//end line after each 
			System.out.println(" ");
		}
	}
}
