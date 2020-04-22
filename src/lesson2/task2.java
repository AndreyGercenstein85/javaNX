package lesson2;

//2. Расставьте правильно операторы приведения типа, чтобы получился ответ d = 0.555
public class task2 {

    public static void main(String[] args) {
        int a = 46362;
        int b =  1074717522;
        float c = (float) b / ((long)a * a);
        double d = 5e-3 + 5e-2 + c;
        System.out.println(d);

    }


}
