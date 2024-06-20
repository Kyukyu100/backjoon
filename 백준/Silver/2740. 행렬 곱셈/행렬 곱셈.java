import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	
	private static final int threshold = 16;	// 임계값
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
 
		int[][] A = new int[128][128];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
 
		st = new StringTokenizer(br.readLine(), " ");
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 
		int[][] B = new int[128][128];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < K; j++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
	
		int big = Math.max(Math.max(N, K), M);
 
		int size = 1;
		while(true) {
			if(size >= big) {
				break;
			}
			size *= 2;
		}
 
		
		int[][] C = multiply(A, B, size);
 
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				sb.append(C[i][j] + " ");
			}
			sb.append('\n');
		}
 
		System.out.println(sb);
	}
	
	// 추가 된 행렬 loop 곱 메소드
	public static int[][] loopMultiply(int[][] A, int[][] B, int size) {
 
		int res[][] = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				for (int k = 0; k < size; k++) {
					res[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return res;
	}
 
	public static int[][] multiply(int[][] A, int[][] B, int size) {
 
 
		int[][] C = new int[size][size];
		
		if (size <= threshold) {	
			return C = loopMultiply(A, B, size);
		}
 
 
		int newSize = size / 2;	// 부분행렬에 대한 사이즈
 
		// A의 부분행렬
		int[][] a11 = subArray(A, 0, 0, newSize);
		int[][] a12 = subArray(A, 0, newSize, newSize);
		int[][] a21 = subArray(A, newSize, 0, newSize);
		int[][] a22 = subArray(A,newSize, newSize, newSize);
 
		// A의 부분행렬
		int[][] b11 = subArray(B, 0, 0, newSize);
		int[][] b12 = subArray(B, 0, newSize, newSize);
		int[][] b21 = subArray(B, newSize, 0, newSize);
		int[][] b22 = subArray(B, newSize, newSize, newSize);
 
 
	
		// M1 := (A11 + A22) * (B11 + B22)
		int[][] M1 = multiply(add(a11, a22, newSize), add(b11, b22, newSize), newSize);
 
		// M2 := (A21 + A22) * B11
		int[][] M2 = multiply(add(a21, a22, newSize), b11, newSize);
 
		// M3 := A11 * (B12 - B22)
		int[][] M3 = multiply(a11, sub(b12, b22, newSize), newSize);
 
		// M4 := A22  * (B21 − B11)
		int[][] M4 = multiply(a22, sub(b21, b11, newSize), newSize);
 
		// M5 := (A11 + A12) * B22
		int[][] M5 = multiply(add(a11, a12, newSize), b22, newSize);
 
		// M6 := (A21 - A11) * (B11 + B12)
		int[][] M6 = multiply(sub(a21, a11, newSize), add(b11, b12, newSize), newSize);
 
		// M7 := (A12 - A22) * (B21−B22)
		int[][] M7 = multiply(sub(a12, a22, newSize), add(b21, b22, newSize), newSize);
 
		
		
		// C11 := M1 + M4 − M5 + M7
		int[][] c11 = add(sub(add(M1, M4, newSize), M5, newSize), M7, newSize);
 
		// C12 := M3 + M5
		int[][] c12 = add(M3, M5, newSize);
 
		// C21 := M2 + M4
		int[][] c21 = add(M2, M4, newSize);
 
		// C22 := M1 − M2 + M3 + M6
		int[][] c22 = add(add(sub(M1, M2, newSize), M3, newSize), M6, newSize);
 
 
		merge(c11, C, 0, 0, newSize);
		merge(c12, C, 0, newSize, newSize);
		merge(c21, C, newSize, 0, newSize);
		merge(c22, C, newSize, newSize, newSize);
 
 
		return C;
	}
 
	// 행렬 뺄셈
	public static int[][] sub(int[][] A, int[][] B, int size) {
 
		int[][] C = new int[size][size];
 
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				C[i][j] = A[i][j] - B[i][j];
			}
		}
		return C;
	}
 
	// 행렬 덧셈
	public static int[][] add(int[][] A, int[][] B, int size) {
 
		int n = size;
 
		int[][] C = new int[n][n];
 
		for (int i = 0; i < n; i++) {
 
			for (int j = 0; j < n; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		return C;
	}
	
 
	public static int[][] subArray(int[][] src, int row, int col, int size) {
 
		int[][] dest = new int[size][size];
		for (int dset_i = 0, src_i = row; dset_i < size; dset_i++, src_i++) {
			for (int dest_j = 0, src_j = col; dest_j < size; dest_j++, src_j++) {
				dest[dset_i][dest_j] = src[src_i][src_j];
			}
		}
		return dest;
	}
 
	public static void merge(int[][] src, int[][] dest, int row, int col, int size) {
 
		for (int src_i = 0, dest_i = row; src_i < size; src_i++, dest_i++) {
			for (int src_j = 0, dest_j = col; src_j < size; src_j++, dest_j++) {
 
				dest[dest_i][dest_j] = src[src_i][src_j];
			}
		}
	}
 
}