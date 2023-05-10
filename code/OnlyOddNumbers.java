public class OnlyOddNumbers{
public static void main(String args[]) {
	int num = 1000;
	System.out.println("List of odd numbers from 1 to " + num + ":");
	
	for(int i=1; i<num; i++) {
		if(i % 2 !=0)
		{
			System.out.println(i+ " ");
		}
	}
}
}