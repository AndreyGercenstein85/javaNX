package lesson2;
//6. Написать программу, которая выводит день недели будущего Нового года.
import java.time.DayOfWeek;
import java.time.LocalDate;

public class task6 {
    public static void main(String[] args) {
        DayOfWeek dayName = LocalDate.now().plusYears(1).getDayOfWeek();
        System.out.println(dayName);

    }
}
