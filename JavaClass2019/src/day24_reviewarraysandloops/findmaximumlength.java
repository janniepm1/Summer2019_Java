package day24_reviewarraysandloops;

public class findmaximumlength {
public static void main(String[] args) {
	/*
	 * ask user to enter 5 names.then return the longest name
	 */
	String[] names= {"seyfo","Asiya","Myra","Keteryna","Daulette"};
	String LongestName="";
	int max=0;{
	for(int i=0; i<names.length;i++) {
		if (names[i].length()>max) {
			max=names[i].length();
			LongestName=names[i];
	}
	}
	System.out.println(max);
	System.out.println(LongestName
			);
	}
	}
}