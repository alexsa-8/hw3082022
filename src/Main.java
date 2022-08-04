import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Задание 1
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
    }
}