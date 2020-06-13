package functional_interface;

public class RunableInterFace {

	public static void main(String[] args) {
		
		Runnable r;
       r=()->{
    	   
    	   for(int i=0;i<15 ;i++){
    		   System.out.println("child thread");
    	   }
       };
       
       
       Thread t=new Thread(r);
       t.start();
       for(int i=0;i<14;i++){
    	   System.out.println("parant threads");
       }
	}

}
