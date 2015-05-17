package stringbuilderbuffer;

import java.util.Date;

public class builderbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long TimetakenbyStringBuilder = 0;
		long TimetakenbyStringBuffer = 0;
	
		for (int i =0; i<100; i++){
			TimetakenbyStringBuilder +=performTaskwithStringBuilder();
			TimetakenbyStringBuffer +=performTaskwithStringBuffer();
			
		}
		

		System.out.println("Time taken by String Builder = " +TimetakenbyStringBuilder);
		System.out.println("Time taken by String Buffer = " +TimetakenbyStringBuffer);
	
	}

	public static long performTaskwithStringBuilder () {
		long startTime = new Date().getTime();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<100000; i++) {
		sb.append("Java");
		}
		long endTime = new Date().getTime();
	return endTime-startTime;
		}



	public static long performTaskwithStringBuffer () {
		long startTime = new Date().getTime();
		StringBuffer ob = new StringBuffer();
		for (int i=0; i<100000; i++) {
		ob.append("Java");
		}
		long endTime = new Date().getTime();
	return endTime-startTime;
		}
	



}
