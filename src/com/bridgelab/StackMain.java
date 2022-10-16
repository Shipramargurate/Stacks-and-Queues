package com.bridgelab;

public class StackMain {
	public static void main(String[] args) {
		System.out.println("welcome to stack program");
		StackOperation stackOperations = new StackOperation();
		stackOperations.push(70);
		stackOperations.push(30);
		stackOperations.push(56);

		stackOperations.show();

	}
}
