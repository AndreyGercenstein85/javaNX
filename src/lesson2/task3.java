package lesson2;
// 3. Расставьте правильно операторы приведения типа, чтобы получился ответ d > 0
public class task3 {
    public static void main(String[] args) {

        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}
