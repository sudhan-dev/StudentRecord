
public class Student {

	private String studentName;
	private String studentId;
	private int percentage;
	private String studentContact;
	public Integer seqNo;
	public Integer secNo;
	public Integer secSeq;

	public Student(String studentId, String studentName, int percentage, String studentContact) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.percentage = percentage;
		this.studentContact = studentContact;
		this.seqNo = Integer.valueOf(studentId.substring(8));
		this.secNo = Integer.valueOf(studentId.substring(7, 8));
		this.secSeq = Integer.valueOf(studentId.substring(7));

	}

	public Student() {

	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudnetId() {
		return studentId;
	}

	public void setStudnetId(String studentId) {
		this.studentId = studentId;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public String getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}

}
