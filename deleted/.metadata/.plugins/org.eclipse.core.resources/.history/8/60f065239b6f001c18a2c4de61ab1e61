package chap03;

public class ForExample4Revisited {

	public static void main(String[] args) {
		int arr[][] = new int[3][4];
		
		//아래의 for 반복문을 확장 for문으로 변경한 후 실행
		int i=0, j, value=10;
		
		for (int arr2[] :arr) {
			j=0;
			for (int num :arr2) {
				arr[i][j] = value;
				System.out.printf("%3d ", arr[i][j]);
				value += 10;
				j++;
			}
			System.out.println("\n");
			i++;
		}

	}

}
