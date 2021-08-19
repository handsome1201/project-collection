package vocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class august17 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();
		while(n-->0) {
			int k = Integer.parseInt(br.readLine());
			
			if(k != 0) {
				stack.push(k);
			}
			else {
				stack.pop();
			}
		}
		
		int result=0;
		
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		sb.append(result);
		System.out.println(sb);
	}

}
