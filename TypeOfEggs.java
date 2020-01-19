package eggs;

import java.util.Scanner;

public class TypeOfEggs {
	
	static String[] egtype = {"Grunts(yolk and protein s liquid)","With liquid yolk","Hard"};
	
	static Scanner typeegg = new Scanner(System.in);	
	static String type  = typeegg.toString();

	public static String[] getEgtype() {
		return egtype;
	}
}
