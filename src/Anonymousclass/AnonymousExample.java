package Anonymousclass;

import com.Runable.Myrunable;

public class AnonymousExample {
	
	public static void main(String[] args) {
		
		
		Runnable runthread=new Runnable() {
			public void run() {
				
				for(int i=0;i<5;i++) {
					System.out.println(Thread.currentThread().getName());
					try {
						Thread.sleep(500);
					}catch (Exception e) {
						// TODO: handle exception
					}
				}
				
			}
		};
		
		Thread t1=new Thread(runthread);
		t1.start();
		
		
		Runnable runthread2=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for(int i=0;i<5;i++) {
					System.out.println(Thread.currentThread().getName());
					try{
						Thread.sleep(500);
					}catch (Exception e) {
						// TODO: handle exception
					}
				}
				
			}
			
		};
		
		Thread t2=new Thread(runthread2);
		t2.start();
	}

}
