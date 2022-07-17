public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 3;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");}
        else if(clientOS ==1) {
            System.out.println("Установите версию приложения для Android по ссылке");}
        else{
            System.out.println("Приложение под вашу ОС еще не создано");}

        // Задание 2

        int clientDeviceYear = 2013;
        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");}
        else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        else{
            System.out.println("Приложение под вашу ОС еще не создано");}

        // Задание 3

        int year = 2400;

        if((year%4 == 0) && (year%100 != 0) || (year%400 == 0)){
            System.out.println( year + " год является високосным");
        } else {
            System.out.println( year + " год не является високосным");
        }

        //Задание 4
        int deliveryDistance = 20;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день на доставку.");
        }else if(deliveryDistance >=20 && deliveryDistance < 60){
            System.out.println("Потребуется 2 дня на доставку.");
        }else if (deliveryDistance>=60 && deliveryDistance <100){
            System.out.println("Потребуется 3 дня на доставку.");
        }else {
            System.out.println("К сожалению, доставка на такое расстояние не производится.");
        }

        // Задание 5

        int month = 14;

        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("Текущий сезон - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Текущий сезон - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Текущий сезон - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Текущий сезон - осень");
                break;
            default:
                System.out.println("В году всего 12 месяцев :)");
        }


    }
}