
class Bike9{  
 final int speed =90;//final variable  
 void run(){  
  speed =400;  
 }  
 public static void main(String args[]){  
 Bike9 obj=new  Bike9();  
 obj.run();  
 }  
}



//method
class Bike{  
	  final void run(){System.out.println("running");}  
	}  
	     
	class Honda extends Bike{  
	   void run(){System.out.println("running safely with 100kmph");}  
	     
	   public static void main(String args[]){  
	   Honda honda= new Honda();  
	   honda.run();  
	   }  
	}  
	
	
	
	//class
	final class Bike{}  
	  
	class Honda1 extends Bike{  
	  void run(){System.out.println("running safely with 100kmph");}  
	    
	  public static void main(String args[]){  
	  Honda1 honda= new Honda();  
	  honda.run();  
	  }  
	}  