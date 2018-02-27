
import java.util.Comparator;

public class SecIdComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		if (s1.secNo == s2.secNo)
			return 0;
		else if (s1.secNo > s2.secNo)
			return 1;
		else
			return -1;
	}

}
