package slk.com;



public class HTMLInfoWriter implements InformationWriter {

	@Override
	public void Print(Student std) {
		System.out.println("Information in HTML format");
		System.out.println("Name: " + std.getName());
		System.out.println("EMail: "+ std.getEmail());
		System.out.println("Reg No: "+ std.getRegNo());

	}

}
