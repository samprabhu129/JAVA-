package practice;

public class MatrixMultiple {

	public static void main(String[] args) {
		// create two matrix
		int a1[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int a2[][]= {{1,1,1},{2,2,2},{3,3,3}};
		
		// create result to store multiple result
		int result[][] = new int [3][3];
		
		//multiplication & printing of a1  a2
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				result[i][j]=0;
				for(int k=0;k<3;k++) {
					result[i][j] += a1[i][k] * a2[k][j];
					
				}
				System.out.print(result[i][j]+"  ");
				
			}
			System.out.println();
		}

	}

}
