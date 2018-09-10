package Week1day3;

public class Moto {

	public static void main(String[] args) {
		Mobile m1=new Mobile();
		Mobile m2=new Mobile();
		Mobile m3=new Mobile();
		Mobile m4=new Mobile();
		Mobile m5=new Mobile();
		Mobile m6=new Mobile();
        
        System.out.println("The msg send by 9000812341:");
        m1.sendSMS("9000812341");
        
        System.out.println("The msg send by 9000812342:" );
        m2.sendSMS("9000812342");
      
        System.out.println("The msg send by 9000812343:" );
        m3.sendSMS("9000812342");
        
        System.out.println("The msg send by 9000812344:" );
        m4.sendSMS("9000812344");
        
        System.out.println("The msg send by 9000812345:" );
        m5.sendSMS("9000812345");
        
        System.out.println("The msg send by 9000812346:" );
        m6.sendSMS("9000812346");
        
        
	}
	

}
