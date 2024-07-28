package test.test01;

public class EntertainerApplicant implements Act, Sing{
	private String name;
	private int age;
	
	@Override
	public void methodActing()
	{
		System.out.println("너 구하고 죽는거면 난 괜찮아");
	}

	@Override
	public void singASong() {
		System.out.println("노래");
	}
}
