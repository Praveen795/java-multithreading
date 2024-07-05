package com.Runable;

public class Myrun {
	public static void main(String[] args) {
		
		Myrunable myrunable=new Myrunable();
		
		Thread thread=new Thread(myrunable);
		thread.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("parent thread");
		}
	}

}
