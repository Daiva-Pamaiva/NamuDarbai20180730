package NamuDarbaiMS.BalticTalents;

public class PerfectNumbersSum {

        public static void main(String[] args) {
            int length = 1000;

            for (int i = 1; i < length; i++) {
                int sum = 0;

                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum = sum + j;
                    }
                }

                if (i == sum) {
                    System.out.println(i);
                }
            }

        }
}
