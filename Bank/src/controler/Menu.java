package controler;

import service.AccountBankService;
import service.Impl.AccountTKServiceImpl;
import service.Impl.AccountTTServiceImpl;

import java.io.IOException;

import java.util.Scanner;


public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static AccountBankService accountTkService = new AccountTKServiceImpl();
    static AccountBankService accountTTService = new AccountTTServiceImpl();

    public static void choiceAdd() throws IOException {
        System.out.println("1.Thêm tài khoản tiết kiệm");
        System.out.println("2.Thêm tài khoản thanh toán");
        System.out.println("Chọn 1 -> 2:");
        int numberChoice = Integer.parseInt(scanner.nextLine());
        switch (numberChoice) {
            case 1:
                ControllerAccountTK.addAccountTk();
                break;
            case 2:
                ControllerAccountTT.addAccountTT();
                break;
        }
    }public static void choiceRemove() throws IOException {
        System.out.println("1.Xoa tài khoản tiết kiệm");
        System.out.println("2.Xoa tài khoản thanh toán");
        System.out.println("Chọn 1 -> 2:");
        int numberChoice = Integer.parseInt(scanner.nextLine());
        switch (numberChoice) {
            case 1:
                ControllerAccountTK.removeAccountTK();
                break;
            case 2:
                ControllerAccountTT.removeAccountTT();
                break;
        }
    }public static void choiceFind() throws IOException {
        System.out.println("1.Tim kiem tài khoản tiết kiệm");
        System.out.println("2.Tim kiem tài khoản thanh toán");
        System.out.println("Chọn 1 -> 2:");
        int numberChoice = Integer.parseInt(scanner.nextLine());
        switch (numberChoice) {
            case 1:
                ControllerAccountTK.findAccountTT();
                break;
            case 2:
                ControllerAccountTT.findAccountTT();
                break;
        }
    }public static void choiceDisplay() throws IOException {
        System.out.println("1.Xem tài khoản tiết kiệml");
        System.out.println("2.Xem tài khoản thanh toán");
        System.out.println("Chọn 1 -> 2:");
        int numberChoice = Integer.parseInt(scanner.nextLine());
        switch (numberChoice) {
            case 1:
                ControllerAccountTK.finAllAccountTK();
                break;
            case 2:
                ControllerAccountTT.finAllAccountTT();
                break;
        }
    }


}
