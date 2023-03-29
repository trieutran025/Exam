package controler;

import lib.MyRegex;
import model.AccountTT;

import java.io.IOException;

import static controler.Menu.accountTTService;
import static controler.Menu.scanner;

public class ControllerAccountTT {
    public static void addAccountTT() throws IOException {
        int id = 1;
        String code;
        do {
            System.out.println("Nhap vao ma tai khoan");
            code = scanner.nextLine();
        } while (!(code.matches(MyRegex.REGEX_TT)));
        System.out.println("Nhap ten chu tai khoan:");
        String nameAcc = scanner.nextLine();
        System.out.println("Nhap vao ngay khoi tao tai khoan:");
        String dateAcc = scanner.nextLine();
        System.out.println("Nhap vao so the:");
        String idCard = scanner.nextLine();
        System.out.println("Nhap so tien trong the:");
        long moneyCard = Long.parseLong(scanner.nextLine());
        accountTTService.add(new AccountTT(id, code, nameAcc, dateAcc, idCard, moneyCard));
    }

    public static void removeAccountTT() throws IOException {
        String code;
        do {
            System.out.println("Nhap ma muon xoa");
            code = scanner.nextLine();
        } while (!(code.matches(MyRegex.REGEX_TT)));
        accountTTService.remove(code);
    }
    public static void finAllAccountTT() throws IOException {
        accountTTService.findAll();
    }
    public static void findAccountTT() throws IOException {
        String code;
        do {
            System.out.println("Nhap ma muon xoa");
            code = scanner.nextLine();
        } while (!(code.matches(MyRegex.REGEX_TT)));
        accountTTService.find(code);
    }
}
