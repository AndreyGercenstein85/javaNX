package lesson2;
//4. Расставьте правильно операторы приведения типа, чтобы получился ответ: c = 256
public class task4 {
    public static void main(String[] args) {
        int a = (byte)44;
        int b = (short)300;
        short c = (short)(b - a);
        System.out.println(c);

    }
}
