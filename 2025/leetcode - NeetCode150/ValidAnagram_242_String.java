import java.util.Arrays;

public class ValidAnagram_242_String
{

    public static boolean validAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);

    }

    public static void  main(String[] args)
    {
        System.out.println(validAnagram("car","rac"));
    }
}
