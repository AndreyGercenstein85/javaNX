package lesson2;
//1. Используя битовые операции вывести дополнительный код переменной типа byte, т.е. получить битовый образ переменной в памяти


public class task1 {

    public static void main(String[] args) {
        byte[] bitImage = new byte[]{12, -128};
        for (byte b : bitImage) {
            System.out.print(String.format("%8s", Integer.toBinaryString((b) & 0xFF)).replace(' ', '0') + " ");
        }
    }


}
