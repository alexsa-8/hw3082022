import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int clientOS;
        Scanner input=new Scanner(System.in);
        System.out.println("Введите каким телефоном вы пользуетесь:");
        System.out.println("если iOS - 0");
        System.out.println("если Android - 1");
        clientOS=input.nextInt();
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if(clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Ошибка");
        }

        // Задание 2
        System.out.println("\nЗадание 2");
        int clientDeviceYear,a=2015;
        System.out.println("Введите каким телефоном вы пользуетесь:");
        System.out.println("если iOS - 0");
        System.out.println("если Android - 1");
        clientOS=input.nextInt();
        System.out.println("Введите год выпуска вашего телефона: ");
        clientDeviceYear=input.nextInt();
        if (clientOS == 0 && clientDeviceYear < a){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        else if (clientOS == 0 && clientDeviceYear >= a){
                System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear < a){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        else if (clientOS == 1 && clientDeviceYear >= a){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Ошибка");
        }


        // Задание 3
        System.out.println("\nЗадание 3");
        int year,b=4,c=100,d=400;
        System.out.println("Узнате каким является год");
        System.out.print("Введите интерисующий вас год:");
        year=input.nextInt();
        if (year%d==0)
            System.out.println(year + " год является високосным");
        else if (year%c==0){
            System.out.println(year+" год не является високосным");
        }
        else if (year%b==0){
            System.out.println(year+" год является високосным");
        }
        else {
            System.out.println("год не является високосным");
        }

        // Задание 4
        System.out.println("\nЗадание 4");
        int deliveryDistance,e;
        System.out.print("Дистанция до клиента:");
        deliveryDistance=input.nextInt();
        e=1+(deliveryDistance/40);
        if (deliveryDistance<=20){
            System.out.print("Потребуется дней: 1 срок доставки");
        }
        else if (deliveryDistance>(20)){
            System.out.println("Потребуется дней: "+e+" срок доставки");
        }

        // Задание 5
        System.out.println("\nЗадание 5");
        int monthNumber,f=12;
        System.out.print("Введите номер месяца и узнаете какой это сезон: ");
        monthNumber=input.nextInt();
        switch (monthNumber){
            case 1,2,12:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка. Введите 1 из 12 месяцев");
        }
    }
}