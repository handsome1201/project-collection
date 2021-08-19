package vocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class august17_1 {

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

			for (int i = 0; i < n; i++) {
				q.offer(new int[] { i, Integer.parseInt(st.nextToken())});
			}

			
			int count=0;

			while(!q.isEmpty()) {
				int[] max = q.poll();
				boolean isMax = true;
				
				for(int i=0; i<q.size(); i++) {
					if(max[1]<q.get(i)[1]) {
						q.offer(max);
						for(int j=0;j<i;j++) {
							q.offer(q.poll());
						}
						
						isMax=false;
						break;
					}
				}

				if(isMax == false) {
					continue;
				}
				else {
					count++;
					if(max[0] == m) {	// 찾고자 하는 문서라면 해당 테스트케이스 종료
						break;
					}
				}
			

			}
			sb.append(count).append('\n');
		}
		System.out.println(sb);
	}
}

