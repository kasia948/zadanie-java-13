import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int userChoise = input.nextInt();

        while (userChoise < 100 || userChoise > 200 || userChoise %3!=0) {
            if (userChoise < 100) {
                System.out.println("Podana liczba jest za mała\nPodaj liczbę");
                userChoise = input.nextInt();
            } else if (userChoise > 200) {
                System.out.println("Podana liczba jest za duża\nPodaj liczbę");
                userChoise = input.nextInt();
            } else if (userChoise % 3 != 0) {
                System.out.println("Podana liczna liczba nie jest podzielna przez 3\nPodaj liczbę");
                userChoise = input.nextInt();
            }
        }
        System.out.println("Twoja liczba jest ok");
    }
}