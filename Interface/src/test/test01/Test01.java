package test.test01;

public class Test01 {
	public static void main(String[] args) {
		EntertainerApplicant applicant = new EntertainerApplicant();
		
		JypEntertainment jyp = new JypEntertainment();
		
		jyp.actorAudition(applicant);
		jyp.idolAudition(applicant);
	}
}
