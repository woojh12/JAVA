package test.test02;

public class Galaxy {
	private String name;
	private String modelId;
	private String idNumber;
	private String phone;
	
	public Galaxy(String name, String modelId, String idNumber, String phone)
	{
		this.name = name;
		this.modelId = modelId;
		this.idNumber = idNumber;
		this.phone = phone;
	}
	
	public void printInfo()
	{
		System.out.println(name + "에서 제조된 " + modelId + " 입니다.");
		System.out.println("전화 번호 : " + phone);
		System.out.println("일련 번호 : " + idNumber);
	}
	
	public void calling(String phone)
	{
		System.out.println(phone + " 로 전화를 겁니다 뚜르르르르...");
	}
	
	public void message(String phone, String text)
	{
		System.out.println(phone + " 로 \"" + text + "\" 메시지를 전송 합니다.");
	}
}
