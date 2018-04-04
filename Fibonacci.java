package test;

import java.util.Scanner;

public class Fibonacci {
public int fibonacci(int n){
	int[] data = new int[n+1];
	if(n == 1){
		return 1;
	}
	if(n==2){
		return 1;
	}
	if(n>=2){
		data[1] = 1;
		data[2] = 1;
		for(int i =3;i<=n;i++){
			data[i] = data[i-1] + data[i-2];
		}	
	}
	return data[n];
	
}
public static void main(String[] args) {
	Fibonacci fc = new Fibonacci();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int result = fc.fibonacci(n);
	System.out.println(result);
	sc.close();
}
}
