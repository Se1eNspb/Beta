import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {

        while (true) {
            System.out.println("Введите уравнение");
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            string = string.trim();
            String[] in = new String[3];
            int[] out = new int[3];
            in = string.split(" ");
            if (in.length > 3) {
                throw new IOException("Hе удовлетворяет заданию");
            }

            if (48<in[0].codePointAt(0)&& 58>in[0].codePointAt(0)&&48<in[2].codePointAt(0)&& 58>in[2].codePointAt(0)){
                System.out.println(" ");

                System.out.println("Ответ "+ string +" = "  + calc(in));

            }else {

                Roman2Arab first = Roman2Arab.valueOf(in[0]);
                out[0] = first.getR2a();
                in[0] =String.valueOf(out[0]) ;


                Roman2Arab second = Roman2Arab.valueOf(in[2]);
                out[2] = second.getR2a();
                in[2] =String.valueOf(out[2]) ;

                System.out.println(" ");
                if (Integer.parseInt(calc(in))>0) {
                    System.out.println("Ответ " + string + " = " + Converter.intToRoman(Integer.parseInt(calc(in))));
                }else throw new IOException("Римскими числами могут быть только положительные числа.");


            }



        }
    }

    public static String calc(String input[]) throws IOException {



        String in[] = input;

        int a = Integer.parseInt(in[0]);
        if (a < 1 || a > 10) {
            throw new IOException("Числа от 1 до 10 включительно");
        }


        String b = in[1];


        int c = Integer.parseInt(in[2]);
        if (c < 1 || c > 10) {
            throw new IOException("Числа от 1 до 10 включительно");

        }


        int d = 0;
        switch (b) {
            case "+":
                d = a + c;
                break;
            case "-":
                d = a - c;
                break;
            case "*":
                d = a * c;
                break;
            case "/":
                d = a / c;
                break;
            default:
                throw new IOException("Только операции сложения, вычитания, умножения и деления.");

        }


        return String.valueOf(d);
    }

}




