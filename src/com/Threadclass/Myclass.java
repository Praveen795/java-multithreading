package com.Threadclass;

public class Myclass {
	
	public static void main(String[] args) {
		
		Mythread mythread=new Mythread();
		mythread.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("parent thread");
		}
	}

}
