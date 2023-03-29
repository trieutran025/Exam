package controler;

import lib.MyRegex;
import model.AccountTK;

import java.io.IOException;
import java.util.Scanner;

import static controler.Menu.*;
import static controler.Menu.accountTTService;

public class ControllerAccountTK {
    public static void addAccountTk() throws IOException {
        int id = 1;
        String code;
        do {
            System.out.println("Nhap vao ma tai khoan");
            code = scanner.nextLine();
        } while (!(code.matches(MyRegex.REGEX_TK)));
        System.out.println("Nhap ten chu tai khoan:");
        String nameAcc = scanner.nextLine();
        System.out.println("Nhap vao ngay khoi tao tai khoan:");
        String dateAcc = scanner.nextLine();
        System.out.println("Nhap vao so tien gui:");
        long money = Long.parseLong(scanner.nextLine());
        System.out.println("Nhap vao ngay gửi:");
        String dateFrom = scanner.nextLine();
        System.out.println("Nhập vòa lãi xuất:");
        int laiXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào kì hạn:");
        int kiHan = Integer.parseInt(scanner.nextLine());
        accountTkService.add(new AccountTK(id, code, nameAcc, dateAcc, money, dateFrom, laiXuat, kiHan));
    }

    public static void removeAccountTK() throws IOException {
        String code;
        do {
            System.out.println("Nhap ma muon xoa");
            code = scanner.nextLine();
        } while (!(code.matches(MyRegex.REGEX_TK)));
        accountTkService.remove(code);
    }
    public static void finAllAccountTK() throws IOException {
        accountTkService.findAll();
    }
    public static void findAccountTT() throws IOException {
        String code;
        do {
            System.out.println("Nhap ma muon xoa");
            code = scanner.nextLine();
        } while (!(code.matches(MyRegex.REGEX_TK)));
        accountTkService.find(code);
    }
}
