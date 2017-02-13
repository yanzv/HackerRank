/*
 * You are given a 2D matrix, a, of dimension MxN and a positive integer R. You have to rotate the matrix R times and print the resultant matrix. Rotation should be in anti-clockwise direction.
 * Rotation of a 4x5 matrix is represented by the following figure. Note that in one rotation, you have to shift elements
 * It is guaranteed that the minimum of M and N will be even.

Input Format
First line contains three space separated integers, M, N and R, where M is the number of rows, N is number of columns in matrix, and R is the number of times the matrix has to be rotated.
Then M lines follow, where each line contains N space separated positive integers. These M lines represent the matrix.

Constraints
2 <= M, N <= 300
1 <= R <= 109
min(M, N) % 2 == 0
1 <= aij <= 10^8, where i belongs to [1..M] & j belongs to [1..N]

Output Format
Print the rotated matrix.

Sample Input #00

4 4 1
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample Output #00

2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15

Sample Input #01

4 4 2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample Output #01

3 4 8 12
2 11 10 16
1 7 6 15
5 9 13 14

Sample Input #02

5 4 7
1 2 3 4
7 8 9 10
13 14 15 16
19 20 21 22
25 26 27 28

Sample Output #02

28 27 26 25
22 9 15 19
16 8 21 13
10 14 20 7
4 3 2 1

Sample Input #03

2 2 3
1 1
1 1

Sample Output #03

1 1
1 1

Explanation
Sample Case #00: Here is an illustration of what happens when the matrix is rotated once.

 1  2  3  4      2  3  4  8
 5  6  7  8      1  7 11 12
 9 10 11 12  ->  5  6 10 16
13 14 15 16      9 13 14 15

Sample Case #01: Here is what happens when to the matrix after two rotations.

 1  2  3  4      2  3  4  8      3  4  8 12
 5  6  7  8      1  7 11 12      2 11 10 16
 9 10 11 12  ->  5  6 10 16  ->  1  7  6 15
13 14 15 16      9 13 14 15      5  9 13 14

Sample Case #02: Following are the intermediate states.

1  2  3  4      2  3  4 10    3  4 10 16    4 10 16 22
7  8  9 10      1  9 15 16    2 15 21 22    3 21 20 28
13 14 15 16 ->  7  8 21 22 -> 1  9 20 28 -> 2 15 14 27 ->
19 20 21 22    13 14 20 28    7  8 14 27    1  9  8 26
25 26 27 28    19 25 26 27    13 19 25 26   7 13 19 25



10 16 22 28    16 22 28 27    22 28 27 26    28 27 26 25
 4 20 14 27    10 14  8 26    16  8  9 25    22  9 15 19
 3 21  8 26 ->  4 20  9 25 -> 10 14 15 19 -> 16  8 21 13
 2 15  9 25     3 21 15 19     4 20 21 13    10 14 20  7
 1  7 13 19     2  1  7 13     3  2  1  7     4  3  2  1

Sample Case #03: As all elements are same, any rotation will reflect the same matrix.
 */

/*
 * Solution explanation:
 * Steps to solve the problem:
 *   -Input the values.
 *   -Convert layers into queue.
 *   -Rotate according to input times.
 *   -Convert queue to layers.
 *   -Print the matrix.
 */

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MatrixLayerRotation {

	static int[][] matrix;
	static int R;
	static int layer;

	public static void Rotate(int row, int col) {
		Queue<Integer> queue = new LinkedList<Integer>();
		//Convert into queue
		for (int i = 0 + layer; i < col - 1 - layer; i++) {
			queue.add(matrix[0 + layer][i]);
		}
		for (int i = 0 + layer; i < row - 1 - layer; i++) {
			queue.add(matrix[i][col - 1 - layer]);
		}
		for (int i = col - 1 - layer; i > 0 + layer; i--) {
			queue.add(matrix[row - 1 - layer][i]);
		}
		for (int i = row - 1 - layer; i > 0 + layer; i--) {
			queue.add(matrix[i][0 + layer]);
		}
		int redo = R;

		if ((2 * (row - layer * 2) + 2 * (col - layer * 2) - 4) > 0) {
			redo = R % (2 * (row - layer * 2) + 2 * (col - layer * 2) - 4);
		}
		int t;
		for (int i = 0; i < redo; i++) {
			t = queue.poll();
			queue.add(t);
		}

		// putting black into matrix
		for (int i = 0 + layer; i < col - 1 - layer; i++) {
			matrix[0 + layer][i] = queue.poll();
		}
		for (int i = 0 + layer; i < row - 1 - layer; i++) {
			matrix[i][col - 1 - layer] = queue.poll();
		}
		for (int i = col - 1 - layer; i > 0 + layer; i--) {
			matrix[row - 1 - layer][i] = queue.poll();
		}
		for (int i = row - 1 - layer; i > 0 + layer; i--) {
			matrix[i][0 + layer] = queue.poll();
		}
		if (layer < col / 2 - 1 && layer < row / 2 - 1) {
			layer++;
			Rotate(row, col);
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		layer = 0;
		int M = in.nextInt();
		int N = in.nextInt();
		R = in.nextInt();
		matrix = new int[M][N];

		for (int y = 0; y < M; y++) {
			for (int x = 0; x < N; x++) {
				matrix[y][x] = in.nextInt();
			}
		}

		Rotate(M, N);
		printMatrix(M, N);
	}

	// To print the matrix
	public static void printMatrix(int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
