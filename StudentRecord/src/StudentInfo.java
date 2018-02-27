//
//Program to sort student record based on below logic
//Each student record contains following attributes
//Roll No(2017BV101) where 1-4 digits indicate year of admission, next 3 char course enrolled, next digit section number, next two digits sequence number.
//Output should contain students record sorted ascending order based on sequence number and decending order based on section number.
//Output should fill in gaps present in sequence number with dummy values.

import java.util.ArrayList;
import java.util.Collections;

public class StudentInfo {

	public static void main(String[] args) {

		int first, last, count;
		int i;
		boolean flag;

		System.out.println("Entering the program");

		ArrayList<Student> studList = new ArrayList<>();

		studList.add(new Student("2017BCO205", "First", 90, "96866"));
		studList.add(new Student("2017BCO102", "Second", 90, "96866"));
		studList.add(new Student("2017BCO107", "Third", 90, "96866"));
		studList.add(new Student("2017BCO293", "Fourth", 90, "96866"));
		studList.add(new Student("2017BCO105", "Fifth", 90, "96866"));
		studList.add(new Student("2017BCO202", "Sixth", 90, "96866"));
		studList.add(new Student("2017BCO137", "Seventh", 90, "96866"));
		studList.add(new Student("2017BCO253", "Eighth", 90, "96866"));

		sortListAsc(studList);

		Student header = studList.get(0);
		first = header.secSeq;
		count = studList.size();
		header = studList.get(count - 1);
		last = header.secSeq;
		for (i = first; i < last; i++) {
			flag = false;
			for (Student st : studList) {
				if (st.secSeq == i) {
					flag = true;
				}
			}
			if (flag == false)
				addDummyRecord(studList, Integer.toString(i));
		}

		for (Student st : studList) {
			System.out.println(st.getStudentName());
		}

		sortList(studList);

		for (Student st : studList) {
			System.out.println(st.getStudentName() + st.getStudnetId());
		}

	}

	public static void sortList(ArrayList<Student> studList) {

		System.out.println("Ascending sort based on seq no\n");

		Collections.sort(studList, new IdComparator());
		Collections.reverse(studList);
		// for (Student st : studList) {
		// System.out.println(st.seqNo + " " + st.getStudentName() + " " +
		// st.getStudnetId());
		// }

		System.out.println("\nDescending sort based on sec no\n");

		Collections.sort(studList, new SecIdComparator());
		Collections.reverse(studList);
		// for (Student st : studList) {
		// System.out.println(st.secNo + " " + st.getStudentName() + " " +
		// st.getStudnetId());
		// }

	}

	public static void sortListAsc(ArrayList<Student> studList) {

		System.out.println("Ascending sort based on seq no\n");

		Collections.sort(studList, new IdComparator());
		// for (Student st : studList) {
		// System.out.println(st.seqNo + " " + st.getStudentName() + " " +
		// st.getStudnetId());
		// }

		System.out.println("\nAscending sort based on sec no\n");

		Collections.sort(studList, new SecIdComparator());
		// for (Student st : studList) {
		// System.out.println(st.secSeq + " " + st.getStudentName() + " " +
		// st.getStudnetId());
		// }
	}

	public static void addDummyRecord(ArrayList<Student> studList, String secSeq) {

		// System.out.println("Entering addDummyRecord" + secSeq);
		String str = "2017BCO";
		str = str.concat(secSeq);
		// System.out.println(str);
		studList.add(new Student(str, "****", 00, "***"));

	}

}
