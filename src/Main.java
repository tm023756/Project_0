import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\tm023756\\Documents\\GitHub\\Project_0\\src\\test.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String firstInt;
        String rep;
        String st ;
        String prime;
        int a;
        PrintWriter writer = new PrintWriter("output.txt");
        rep= br.readLine();
        int b = Integer.parseInt(rep);
        if(primeTest(b)==1){
            firstInt = String.valueOf(b);
            writer.write(firstInt);
            writer.write("\n");
        }
        for (int i = 2; i <= b ; i++){
            st = br.readLine();
            a= Integer.parseInt(st);
            if (primeTest(a)==1){
                prime = String.valueOf(a);
                writer.write(prime);
                writer.write("\n");
            }
        }
        writer.close();
    }
//        while ((st = br.readLine()) != null){
//            a= Integer.parseInt(st);
//            if (primeTest(a)==1){
//                prime = String.valueOf(a);
//                writer.write(prime);
//                writer.write("\n");
//            }
//        }
//        writer.close();
//    }
    public static int primeTest(int n){

        if(n<=1){
            return 0;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;

            }
            }
        return 1;

    }
}


/*
kfsiofsifj*/
