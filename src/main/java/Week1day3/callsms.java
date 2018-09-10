package Week1day3;

public class callsms {
	int currentBalance=9;
	public void sendSms(long mobNumber,String sms) {
		System.out.println(mobNumber+"-"+sms);
		currentBalance=currentBalance-1;
		}
	public void callContact(long mobileNumber) {
		System.out.println("callcontact:"+mobileNumber);
		currentBalance=currentBalance-2;
	}

}
