//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
public class Main {
    public static void printSeparator(){
        System.out.println("=============================");
    }


    public static String checkLeapYear (int year){
        if (year % 400 == 0){
            return year + " - високосный год";
        }else if (year % 100 == 0){
            return year + " - невисокосный год";
        }else if (year % 4 == 0){
            return year + " - високосный год";
        }else {
            return year + " - невисокосный год";
        }
    }

    public static String appVersion (int OS, int clientDeviceYear){
    int currentYear = LocalDate.now().getYear();
    if (clientDeviceYear < currentYear){
        if (OS == 0){
            return "Установите облегченную версию приложения для iOS по ссылке";
        }else{
            return "Установите облегченную версию приложения для Android по ссылке";
        }
    }else{
        if(OS ==0){
            return "Установите версию приложения для iOS по ссылке";
        }else{
           return "Установите версию приложения для Android по ссылке";
        }
    }
    }


    public static String delivery (int deliveryDistance){
        if (deliveryDistance <= 20){
            return "Доставка займет 1 сутки";
        }else if (deliveryDistance <= 60){
            return "Доставка займет 2 суток";
        }else if (deliveryDistance <= 100){
            return "Доставка займет 3 суток";
        }else{
            return "Доставки нет";
        }
    }


    public static void main(String[] args) {

        printSeparator();

        System.out.println(checkLeapYear(2012));

        printSeparator();

        System.out.println(appVersion(0, 2015));

        printSeparator();

        System.out.println(delivery(95));

        printSeparator();


    }
}