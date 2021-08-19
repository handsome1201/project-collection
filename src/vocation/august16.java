package vocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class august16 {

	public static int []stack;
	public static int size=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		stack = new int[n];

		while(n-->0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String order = st.nextToken();
			
			if(order.equals("push")){
				push(Integer.parseInt(st.nextToken()));
			}
			else if(order.equals("top")) {
				sb.append(top()).append("\n");
			}
			else if(order.equals("size")) {
				sb.append(size()).append("\n");
			}
			else if(order.equals("empty")) {
				sb.append(empty()).append("\n");
			}
			else {
				sb.append(pop()).append("\n");
			}
		}
		System.out.println(sb);
	}
	public static void push(int num) {
		stack[size]=num;
		size++;
	}
	public static int top() {
		if(size==0) {
			return -1;
		}
		else {
			return stack[size-1];
		}
	}
	public static int size() {
		return size;
	}
	public static int empty() {
		if(size==0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static int pop() {
		if(size==0) {
			return -1;
		}
		else {
			int idx=stack[size-1];
			size--;
			return idx;
		}
	}
}
