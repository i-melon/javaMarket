import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scan= new Scanner(System.in);
    static Buyer client = new Buyer("Bayakhan Aidyn", 000101502464, "77477767009", CardType.MasterCard, "0000000000000000", 1000000);
    static Salesman worker = new Salesman("Janabayev Alikhan", 000101502465, "7788882200", LegalEntityType.IP, 10000000, 3, 3);
    static Mobile iphone = new Mobile("iphone 15 pro", 670000);
    Mobile pixel = new Mobile("pixel 7", 450000);
    List<String> mobileList = new ArrayList<String>();
    public static void main(String[] args) {
        showMenu();
    }




    static void showMenu(){
        System.out.println("Добро пожаловать в интернет магазин");
        System.out.println("Вход");
        System.out.println("Войти как покупатель(1)");
        System.out.println("Войти как продавец(2)");
        int loginInt = scan.nextInt();
        loginToMarket(loginInt);
    }





    static void loginToMarket(int a){
        if (a == 1){
            System.out.println("список товаров(1)");
            System.out.println("редактировать профиль(2)");
            System.out.println("проверить баланс(3)");
            System.out.println("назад(4)");
            int next = scan.nextInt();
            if(next == 1){showDevices();}
            else if(next == 2){showChangeProfile();}
            else if(next == 3){showBalance();}
            else if(next == 4){showMenu();}
        }
        else if (a == 2){
            System.out.println("список моих товаров(1)");
            System.out.println("редактировать профиль(2)");
            System.out.println("проверить баланс счета(3)");
            System.out.println("назад(4)");
            int next = scan.nextInt();
            if(next == 1){showDevices();}
            else if(next == 2){showChangeProfile();}
            else if(next == 3){showSallesmanBalance();}

        }
        else{
            System.out.println("Нужно выбрать 1 или 2");
            showMenu();
        }
    }


    static void showDevices(){
        System.out.println("Смартфоны(1)");
        System.out.println("Ноутбуки(2)");
        System.out.println("назад(3)");
        int next = scan.nextInt();
        if (next==3){loginToMarket(1);}
    }
    static void showChangeProfile(){
        System.out.println("Изменить имя(1)");
        System.out.println("Изменить номер(2)");
        System.out.println("назад на главную(3)");
        int next = scan.nextInt();
        if (next==3){showMenu();}
    }
    static void showBalance(){
        System.out.println("ваш баланс: " + client.getCreditCardBalance());
        loginToMarket(1);
    }
    static void showSallesmanBalance(){
        System.out.println("ваш баланс: " + worker.getBankAccount());
        loginToMarket(1);
    }
}