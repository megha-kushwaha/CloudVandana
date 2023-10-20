import java.util.HashMap;
class RomanNumber 
{
	//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
	private static final HashMap<Character,Integer> ro = new HashMap<Character, Integer>()
	{{
    put('I', 1);
    put('V', 5);
    put('X', 10);
    put('L', 50);
    put('C', 100);
    put('D', 500);
    put('M', 1000);
}};

	private static int romanToInt(String s)
{
    int sum = 0;
    int n = s.length();
     
    for(int i = 0; i < n; i++) 
    {
         
        //  present value is less than next value,
        // subtract present from next value and add the
        // result to the sum variable.
        if (i != n - 1 && ro.get(s.charAt(i)) < ro.get(s.charAt(i + 1)))
        {
            sum += ro.get(s.charAt(i + 1)) -
                   ro.get(s.charAt(i));
            i++;
        } 
        else
        {
            sum += ro.get(s.charAt(i));
        }
    }
    return sum;
}
	public static void main(String[] args) 
	{
		String input = "IX";
     
        System.out.print("Integer form of Roman Numeral is " + romanToInt(input));
		
	}
}

