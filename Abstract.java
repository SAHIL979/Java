package javaPractiice;

	abstract class Sahil {
		
		abstract void start ();
		abstract void stop ();
		
	}
	
public class Abstract extends Sahil {
		
		
	public void start() {
			System.out.println(" 2 wheelers ");
		}
		
		public void stop() {
			System.out.println("4 wheeler ");
			
		
		}
		public static void main (String[] args) {
			System.out.println(" Abstract Class ");
			Abstract obj =new Abstract();
			obj.start();
			obj.stop();
			
		}		
	}
	
	
	


