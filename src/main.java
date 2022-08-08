
public class main {

    public static void main(String[] args) {
        int n = 10000;

        int sum = 0, count = 0;

        for (int i = 1; i <= n; i++)
            if ((i % 2) == 0) {
                sum = sum + i;
                count++;

            }
        double avg = sum / count;
        System.out.println("The average of all even numbers from 1 to " + n + " is " + avg
        );


    }
}