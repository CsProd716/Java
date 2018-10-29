import java.util.Scanner;

class LowAttendanceException extends Exception{
	LowAttendanceException(String s){
		super(s);
	}
	//System.out.println("Low attendance");
}
class LowMarksException extends Exception{
	LowMarksException(String s){
		super(s);
	}
	//System.out.println("Low Marks");
}
class NotEligibleException extends Exception{
	NotEligibleException(String s){
		super(s);
	}
}

public class W55 {

	public static void main(String[] args) {
		Scanner t  = new Scanner(System.in);
		double marks;
		double attend;
		try {
			System.out.println("Give in the marks");
			marks = t.nextDouble();
			System.out.println("Give in the Attendence");
			attend = t.nextDouble();
			if(marks<20 || attend<80) {
				NotEligibleException ex = new NotEligibleException("Not Eligible");
				if(marks<20) {
					ex.initCause(new LowMarksException("Low Marks"));
					throw ex;
				}
				if(attend<80) {
					ex.initCause(new LowAttendanceException("Low Attendence"));
					throw ex;
				}
			}	
		}catch(NotEligibleException ex){
			System.out.println(ex);
			System.out.println(ex.getCause());	
		}
	}

}
