package array;
/**
 * @author Administrator
 *				计算二维数组的对角线元素之和
 */
public class sumOfDiagonal {

	public static void main(String[] args) {
		int[][] x = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(sum(x));
	}
	
	public static int sum(int[] [] arr) {
		//位序
		int i;
		//二维数组第一个元素的长度
		int n = arr[0].length;
		int sum1 = 0;
		int sum2 = 0;
		int sum;
		
	for (i = 0; i < arr.length; i++) {
		//主对角线之和
		sum1 += arr[i][i];
		//副对角线之和
		sum2 += arr[i][n - i - 1];
	}
	sum = sum1 + sum2;
	if (n % 2 == 1) {//假如矩阵行数为奇数，减去相交元素（重复）
		sum -= arr[n/2][n/2];
	}
		return sum;
	}

}
