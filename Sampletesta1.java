import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sampletesta1 {

	private static final char[] S = null;

	public static void main(String[] args) {
		int a;
		int i = 0;
		int j = 0;
		Scanner As = new Scanner(System.in);
		System.out.println("Enter the value :");
		a =As.nextInt();
		if(a%2==0)
		{
			a--;
		}
		List<String>list = new ArrayList<String>();
		while(j< a) {
			if(i%2!=0)
			{
				i++;
				list.add(String.valueOf(i));
			}
			i++;
		}
		String B = String.join(",", list);
		System.out.println(B);

	}

}
