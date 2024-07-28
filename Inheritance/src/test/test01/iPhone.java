package test.test01;

public class iPhone extends IpodTouch {
	private String  phoneNumber;
	
	public iPhone(String phoneNumber)
	{
		this. phoneNumber =  phoneNumber;
		super.setModel("iPhone");;
	}
	
	@Override
	public String infoString()
	{
		return super.infoString() + "\n전화 번호 : " + phoneNumber;
	}
	
	public void call(String number)
	{
		System.out.println(number + " 로 통화중");
	}
	
	public void sendMessage(String number, String message)
	{
		System.out.println(number + "로 " + message + "전송");
	}
}
