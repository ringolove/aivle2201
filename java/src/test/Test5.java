package test;

public class Test5 {

	public static void main(String[] args) {
/*		int gugu[][] = new int[9][9];
		
		int i=2, j;
		for (int arr2[] : gugu) {
			j=1;
			for(int num : arr2) {
				gugu[i][j] = i*j;
				System.out.printf("%d * %d = %d \n", i, j, gugu[i][j]);
				j++;
			}
		}*/
		
		for(int i=0; i<10; i++) {
			for(int j=2; j<10; j++) {
				if (i==0) {
					System.out.printf(" [ %d 단 ] \t", j);
				}
				else {
					System.out.printf("%d * %d = %2d \t", j, i, j*i);
				}
				
			}
			System.out.printf("\n");
		}
	}

}
