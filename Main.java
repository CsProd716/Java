import java.util.Scanner;
class DailyTransactionLimitException extends Exception{
	DailyTransactionLimitException(String s){
		super(s);
	}
}
class InsufficientAmountException extends Exception{
	InsufficientAmountException(String s){
		super(s);
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		double balance = 5000000;
		try {
			System.out.println("How much amount do you want to withdraw?");
			double amt = t.nextDouble();
			if(amt>25000&&amt<balance) throw new DailyTransactionLimitException("Cannot withdraw more than 25000.");
			else if(amt>balance) throw new InsufficientAmountException("Insufficient funds in your account.");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
