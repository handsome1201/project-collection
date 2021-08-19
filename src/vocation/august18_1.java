package vocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class august18_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int k = Integer.parseInt(br.readLine());

		while(k-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			LinkedList<int[]> q = new LinkedList<>();
			st = new StringTokenizer(br.readLine());

			int count=0;

			for(int i=0;i<n;i++) {
				q.offer(new int[] {i, Integer.parseInt(st.nextToken())});
			}
			int[] max=q.poll();

			for(int i=0;i<n;i++) {
				if(max[1]<q.get(i)[1]) {
					q.offer(q.poll());

					for(int j=0; j<i;j++) {
						q.poll();
						q.offer(q.poll());
						
					}
				}
			}
			if(q.poll()[0]==m) {
				sb.append(count).append('\n');
			}
			else {
				q.poll();
				q.offer(q.poll());
				count++;
			}
		}
		System.out.println(sb);
	}

}
