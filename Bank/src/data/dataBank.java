package data;

import lib.MyRegex;
import model.AccountBank;
import model.AccountTK;
import model.AccountTT;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class dataBank {
    public static final String FILE_PATH = "D:\\CodeGym\\module_2\\Exam_Moudule2\\Bank\\src\\data\\bank_account.csv";

    public static void writeCSV(List<AccountBank> list) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        for (AccountBank bank : list) {
            if (bank instanceof AccountTK) {

                buff.write(bank.getId() + "," + bank.getCodeAccount() + "," + bank.getNameAccount() +
                        "," + bank.getNameAccount() + "," + bank.getDateAccount() + "," + ((AccountTK) bank).getMoneyFrom() + "," +
                        ((AccountTK) bank).getDateFrom() + "," + ((AccountTK) bank).getLaiSuat() + "," +
                        ((AccountTK) bank).getKiHan() + "," + "\n");
            } else if (bank instanceof AccountTT) {
                buff.write(bank.getId() + "," + bank.getCodeAccount() + "," + bank.getNameAccount() + "," + bank.getDateAccount() + "," +
                        ((AccountTT) bank).getNumberIdCard() + ((AccountTT) bank).getMoneyCard() + "\n");
            }
        }
        buff.close();
    }

    public static List<AccountBank> readCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        List<AccountBank> accountBankList = new ArrayList<>();
        String line = "";
        String[] temp;
        AccountBank accountBank;
        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            if (temp[1].matches(MyRegex.REGEX_TK)) {
                int id = Integer.parseInt(temp[0]);
                String codeAcc = temp[1];
                String nameAcc = temp[2];
                String dateAcc = temp[3];
                long moneyFrom = Long.parseLong(temp[4]);
                String dateFrom = temp[5];
                int laiSuat = Integer.parseInt(temp[6]);
                int kiHan = Integer.parseInt(temp[7]);
                accountBank = new AccountTK(id, codeAcc, nameAcc, dateAcc, moneyFrom, dateFrom, laiSuat, kiHan);
                accountBankList.add(accountBank);
            } else if (temp[1].matches(MyRegex.REGEX_TT)) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String codeAcc = temp[1];
                String nameAcc = temp[2];
                String dateAcc = temp[3];
                String idCard = temp[4];
                long moneyCard = Long.parseLong(temp[5]);
                accountBank = new AccountTT(id, codeAcc, nameAcc, dateAcc, idCard, moneyCard);
                accountBankList.add(accountBank);
            }
        }
        buff.close();
        return accountBankList;
    }

}
