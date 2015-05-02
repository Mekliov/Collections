package Task1;
import java.util.ArrayList;
import java.util.List;

public class ExpressionOfBrackets {

    public static void brackets() {
        int counter = 0, m = 0;
        String str = "())()())))((())(";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == '(' && arr[i + 1] == ')') {
              
                 if(arr[i+1]!=arr[i+2])
              {
                  counter++;
                  i++;
              }
              if(counter!=0)
              {
                  System.out.println("Bracket found"+ i);
              }
              if(counter==0)
              {
                 System.out.println("Error, no more Bracket/s");
                  System.exit(1);
              }
              counter=0;
            }
            else{
                System.exit(1);
            }

        }
    }
}
