
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Roman {
    public static void main(String [] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String [] in = new String[3];
        int[] out = new int[3];
        in = string.split(" ");

        if (48<in[0].codePointAt(0)&& 58>in[0].codePointAt(0)&&48<in[1].codePointAt(0)&& 58>in[1].codePointAt(0)){
            System.out.println("Numbers");

        }else {
            //String c = in[0];
            Roman2Arab first = Roman2Arab.valueOf(in[0]);
            System.out.println(first.getR2a());
            out[0] = first.getR2a();
            System.out.println(out[0]);
            System.out.println(Converter.intToRoman(out[0]));

           // String d = in[2];
            Roman2Arab second = Roman2Arab.valueOf(in[2]);
            System.out.println(second.getR2a());
            out[2] = second.getR2a();
            System.out.println(out[2]);
            System.out.println(Converter.intToRoman(out[2]));


        }
//        for (int i=0;i<in.length;i++)
//        for (int ii=0;ii<in[1].length();ii++)
//        System.out.println(in[i].codePointAt(ii));



        //System.out.println(in[1]);

//        for (int x = 0; x<in.length; x++){
//            System.out.println(in[x]);
//        }

//        for (int i=0;i<in.length;i++) {
//            int c = Integer.parseInt(in[i]);

        out[1]= out[0] * out[2];
            System.out.println(Converter.intToRoman(out[1]));

//        if (c > 10 || c < 1){
//            throw new IOException("Not number") ;
//        }

        System.out.println(Arrays.toString(in));



    }
}
