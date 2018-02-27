
import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		if (s1.seqNo == s2.seqNo)
			return 0;
		else if (s1.seqNo > s2.seqNo)
			return 1;
		else
			return -1;

	}

}
