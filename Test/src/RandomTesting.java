import java.util.Random;
public class RandomTesting
{ String s;
public RandomTesting(String s){
	this.s=s;
}
	public static void main(String[] args){
		Random r=new Random();
		System.out.println(r.nextInt(5));
	}
}
