import java.io.*;
import java.util.*;
public class ParenthesisBalance
{
    public static void main(String args[]) throws IOException
    {
        File file = new File(System.getProperty("user.dir") + "\\src\\input.txt");
        Scanner sc = new Scanner(file);

        int n = sc.nextInt();
            sc.nextLine();

        for(int i = 0; i < n; i++)
        {
            char[] chars = sc.nextLine().toCharArray();
            System.out.println(balanced(chars));
        }
    }

    public static String balanced(char[] chars)
    {
        ArrayStack parenthesis = new ArrayStack(20);

        for(int x = 0; x < chars.length; x++)
        {
            if(chars[x] == '(')
            {
                parenthesis.push('(');
            }
            else if(chars[x] == ')')
            {
                char popped = parenthesis.pop();

                if(popped != '(')
                {
                    return "No";
                }
            }
            else if(chars[x] == '[')
            {
                parenthesis.push('[');
            }
            else if(chars[x] == ']')
            {
                char popped = parenthesis.pop();

                if(popped != '[')
                {
                    return "No";
                }
            }
        }
        return "Yes";
    }
}
