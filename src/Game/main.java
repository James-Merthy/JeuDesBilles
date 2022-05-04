package Game;

public class main {

    public static void putBall(int ball, int pos, int[] tab) {

        tab[pos] = ball;


    }

    public static void afficherTab(int[] tab) {

        for (int i = 0; i < tab.length; i++) {

            System.out.print("| ");

            if (tab[i] == 0) {

                System.out.print("* ");
            } else {

                System.out.print(tab[i] + " ");


            }
        }

        System.out.print("|");

        System.out.println();
    }

    public static void putBallRandom ( int ball , int []tab){

        int posAleatoir = 1 + (int)(Math.random() * (tab.length + 1) + 1 ) ;

        tab[posAleatoir] = ball ;

    }

    public static void main(String[] args) {

        int[] tab = new int[20];

        afficherTab(tab);

        putBall(1, 3, tab);



        afficherTab(tab);

        putBall(1, 2, tab);

        afficherTab(tab);

        putBall(1, 1, tab);

        afficherTab(tab);

        putBallRandom(3 , tab);


        afficherTab(tab);

    }
}
