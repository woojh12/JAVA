package test.test01;

public class Text01 {
	public static void main(String[] args) {
		iPhone myPhone = new iPhone("010-1234-5678");
		
		System.out.println(myPhone.infoString());
		
		myPhone.internetBrowsing("https://www.google.com");
		
		myPhone.call("010-0000-0000");
		myPhone.sendMessage("010-1111-2222", "ㅋㅋㅋㅋㅋ");
	}
}
