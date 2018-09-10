package Week1day3;


public class CallContact{
	public static void main(String[]args) {
		callsms e3=new callsms();
		while(e3.currentBalance!=0) {
			e3.sendSms(6767676778l,"HAPPY MORNG!");
			e3.callContact(67676767781l);
			if(e3.currentBalance==0) {
		System.out.println("Balance become zero:"+e3.currentBalance);
	}
		}}}