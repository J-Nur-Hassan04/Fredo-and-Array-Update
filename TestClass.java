import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        
        // Write your code here
        int range = Integer.parseInt(name);

        String data = br.readLine();

        String[] str = data.trim(). split("\\s+");
        int avg=0;
        for(int i = 0; i<range; i++)
        {
            avg += Integer.parseInt(str[i]);
        }

        int min = (avg / range) +1;
        System.out.println(min);
        


    }
}