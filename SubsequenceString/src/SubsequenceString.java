import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class SubsequenceString {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String V = bufferedReader.readLine();
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 0; i < N; i++){
            String Bi = bufferedReader.readLine();
            int size = Bi.length();
            int cal = size;
            int j = 0;
            int k = 0;
            while(j < V.length()){
                if(V.charAt(j) == Bi.charAt(k)){
                    j++;
                    cal--;
                    k++;
                }
                else
                    j++;
            }
            if(cal == 0)
                System.out.println("POSITIVE");
            else
                System.out.println("NEGATIVE");

        }
    }
}
