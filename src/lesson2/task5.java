package lesson2;
//5. Используя битовые операции проверить является ли переменная степенью двойки.
public class task5 {
    static boolean deg;
    static int[] n = new int[]{64, -63};
    public static void main(String[] args) {
        for (int i: n) {
            int num = i;
            while ((num & 1) == 0) {
                num >>=1;
            }
            deg = num == 1? true :false;
            System.out.println(i + " is " + deg);
        }

    }
}
