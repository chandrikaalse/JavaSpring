package slk.com;

public class TextInformation implements InformationWriter {

	@Override
	public void Print(Student std) {
		System.out.println("Information in test format");
		System.out.println("Name: " + std.getName());
		System.out.println("EMail: "+ std.getEmail());
		System.out.println("Reg No: "+ std.getRegNo());

	}

}
