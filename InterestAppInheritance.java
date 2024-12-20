import java.util.Scanner;
class Interest{
	protected int pAmt,iRate,time;

	public void setPRD(int pAmt, int iRate, int time) {
		this.pAmt = pAmt;
		this.iRate = iRate;
		this.time = time;
	}
}
class CalculateInterest extends Interest{
	public void calInterest() {
		double SI = (pAmt* iRate * time)/100.0;
		System.out.println("");
		System.out.println("Simple interest: "+SI);
		System.out.println("");
	}
}
public class InterestAppInheritance {
	public static void main(String []args) {
		Scanner src = new Scanner(System.in);
		int P,R,Duration;
		
		System.out.println("Enter principle amount: ");
		P = src.nextInt();
		
		System.out.println("Enter Rate of interest: ");
		R = src.nextInt();
		
		System.out.println("Enter Duration/ time: ");
		Duration = src.nextInt();
		
		CalculateInterest calInt = new CalculateInterest();
		
		calInt.setPRD(P, R, Duration);
		calInt.calInterest();
	}
}