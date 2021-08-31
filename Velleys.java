import java.util.*;
import java.lang.*;
public class Velleys 
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        int n = scan.nextInt();
        char[] k = s.next().toCharArray();
        int count = 0;
        int a = 0;
        char x;
        for(x : k) 
		{
            if(x == 'U') 
			{
                if(a == -1) 
				{
                    count++;
                }
                a++;
            }
            else 
			{
                a--;
            }
        }
        s.close();
        System.out.println(count);
    }
}
