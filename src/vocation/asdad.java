package vocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class asdad {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			Queue<int[]> q = new LinkedList<>();	
			
			st = new StringTokenizer(br.readLine());
			
			Integer []basket = new Integer[n];

			for (int i = 0; i < n; i++) {
				basket[i]=Integer.parseInt(st.nextToken());

			}
			for (int i = 0; i < n; i++) {
				q.offer(new int[] { i, basket[i]});
			}
			
			Arrays.sort(basket);
	
			System.out.println(basket[0]);
			System.out.println(basket[1]);
			System.out.println(basket[2]);
			System.out.println(basket[3]);
			
	}
	

}
