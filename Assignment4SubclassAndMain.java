/**
 * 
 */
package sdh.java.session6;

/**
 * @author sudhi
 *
 */
public class Assignment4SubclassAndMain {

	public static void main(String[] args) {
		Assignment4AbstractClassResultProcessingSystem s1 = new Assignment4AbstractClassResultProcessingSystem();
		s1.registrationNo = "REG001";
		s1.rollNo = 1001;
		s1.studentName = "Sudhish";
		
		Assignment4AbstractClassResultProcessingSystem s2 = new Assignment4AbstractClassResultProcessingSystem();
		s2.registrationNo = "REG002";
		s2.rollNo = 1002;
		s2.studentName = "Raj";
		
		Assignment4AbstractClassResultProcessingSystem s3 = new Assignment4AbstractClassResultProcessingSystem();
		s3.registrationNo = "REG003";
		s3.rollNo = 1003;
		s3.studentName = "Rohit";
		
		System.out.println("Roll No | Registration No | Student Name");
		System.out.println("----------------------------------------");
		System.out.println("  "+s1.rollNo+"         "+s1.registrationNo+"         "+s1.studentName);
		System.out.println("  "+s2.rollNo+"         "+s2.registrationNo+"         "+s2.studentName);
		System.out.println("  "+s3.rollNo+"         "+s3.registrationNo+"         "+s3.studentName);
	}
}
