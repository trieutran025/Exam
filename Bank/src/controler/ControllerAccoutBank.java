package controler;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

class ControllerAccountBank {
    public static void main(String[] args) throws IOException {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("========Tai khoan Ngan hang====");
            System.out.println("1.Them tai khoan");
            System.out.println("2.Xoa tai koan");
            System.out.println("3.Hien thi tai khoan");
            System.out.println("4.Tìm kiếm tài khoản:");
            System.out.println("5.Thoat chuong trinh");
            System.out.print("Chon chuc nang:");
            int number = Integer.parseInt(scanner.nextLine());
            switch (number){
                case 1:Menu.choiceAdd();break;
                case 2:Menu.choiceRemove();break;
                case 3:Menu.choiceDisplay();break;
                case 4:Menu.choiceFind();break;
                case 5:System.exit(0);
            }
        }while (true);
    }
}
