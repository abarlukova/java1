package geekbrains.lesson_3;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //guessNum();
        //repeatGame();

        //guessWord();
       calculator();
    }

    public static void guessNum() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int a=random.nextInt(10);

        //System.out.println(a);

        boolean isEqual;
        int k=0;

        System.out.println("Угадайте число от 0 до 9. У вас "+ (3-k)+" попытки");

        do {
            isEqual=yourTry(a);
            if (isEqual){
                break;
            }
            k++;
        } while ( !isEqual && k<3);

        if (k==3){
            System.out.println("Вы проиграли. Загаданное число " + a );

        }
        else{
            System.out.println("Вы Выиграли!");
        }



    }



    public static boolean yourTry (int a){


        Scanner scanner = new Scanner(System.in);

        int b=scanner.nextInt();

        if (a>b) {
            System.out.println("Ваше число меньше" );
        }
        else if (a<b) {
            System.out.println("Ваше число больше");
        }

        return (a == b);

    }

    public static void guessWord(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int pos = random.nextInt(words.length);
        String answer = words[pos];
        //System.out.println(answer);
        boolean [] flags = new boolean[answer.length()];

        String myTry ;

        StringBuilder cells = new StringBuilder("###############");

        System.out.println(cells);


        do {
            System.out.println("Введите слово");

            myTry = new String(scanner.next());


            for (int i = 0; i < myTry.length(); i++) {
                for (int j = 0; j < answer.length(); j++) {
                    if (myTry.charAt(i) == answer.charAt(j)){
                          flags[j]=true;
                    }
                }
            }

            for (int i = 0; i < answer.length(); i++) {

                if (flags[i]){
                    cells.setCharAt(i, answer.charAt(i));
                }

            }

            System.out.println(cells);

        }while(!answer.equals(myTry));

        System.out.println("Вы угадали!");

    }

    public static void repeatGame () {
        Scanner scanner = new Scanner(System.in);

        int repeat;

        do {

            do {
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                repeat = scanner.nextInt();
            }while (repeat!=0 && repeat!=1);

            if (repeat == 1) {
                guessNum();
            } else  {
                System.out.println("Спасибо за игру!");
                break;
            }

        }   while (repeat!=0);

    }
    public static void calculator (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите выражение вида : 2 + 2");

        double a=scanner.nextInt();

        String sign=scanner.next();

        double b=scanner.nextInt();
        double result;

        if (sign.charAt(0) == '+'){ result= (a+b);}
        else if (sign.charAt(0) == '*'){ result= (a*b);}
        else if (sign.charAt(0) == '-'){ result= (a-b);}
        else {result= (a/b);}

        System.out.println(result);


    }

}