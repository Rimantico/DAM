package tema3;

public class Ej12 {

	public static void main(String[] args) {
		int[][] marco = new int[5][15];
		
		for(int i = 0 ; i<marco.length; i++) {
			for(int j = 0 ; j<marco[i].length ; j++) {
				if(i == 0 || j == 0 || i == 4 || j== 14) {
					System.out.print("1");
				}else
					System.out.print("0");
			}
			System.out.println(" ");
		}

	}

}
