package lamdaex;


public class LamdaExample {
	
	public static void main(String[] args) {
		
		
		Runnable runThread=()->{
			
			for(int i=0;i<5;i++) {
				//Thread.yield();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Hello Indias");
				
			}
		};
		
		Thread thread=new Thread(runThread);
		thread.start();
		
	
		
		Thread t2=new Thread(()->{
			
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		});
		t2.start();
		

		
		Thread t1=new Thread(()->{
			
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		});
		t1.start();
		
	}

}
