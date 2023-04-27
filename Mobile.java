package week1.day1;

public class Mobile {
public void sendSMS() {
	System.out.println("SEND SMS");
	// TODO Auto-generated method stub

}
protected void allowVoicecall() {
	
	System.out.println("ALLOW VOICE CALL");
	
	// TODO Auto-generated method stub

}
private void takevideo() {
	// TODO Auto-generated method stub
System.out.println("TAKE VIDEO") ;

}
public static void main(String[] args) {
	Mobile console= new Mobile();
	console.allowVoicecall();
	console.takevideo();
	console.sendSMS();
}
}
