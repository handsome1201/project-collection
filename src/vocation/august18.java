package vocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class august18 {

	public static int MAX = Integer.MIN_VALUE;	// 최댓값 
	public static int MIN = Integer.MAX_VALUE;	// 최솟값 
	public static int[] operator = new int[4];	// 연산자 개수 
	public static int[] number;					// 숫자 
	public static int n;						// 숫자 개수 

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		number = new int[n];

		// 숫자 입력 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}

		// 연산자 입력 
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}

		dfs(number[0], 1);

		System.out.println(MAX);
		System.out.println(MIN);

	}

	public static void dfs(int num, int idx) {
		for(int i=0; i<4; i++) {
			if(operator[i]>0) {
				operator[i]--;
				
				if(i==0) {
					dfs(num+number[idx],idx+1);
				}
				else if(i==1) {
					dfs(num-number[idx],idx+1);
				}
				else if(i==2) {
					dfs(num*number[idx],idx+1);
				}
				else{
					dfs(num/number[idx],idx+1);
				}
				
				operator[i]++;
			}
		}
	}
}