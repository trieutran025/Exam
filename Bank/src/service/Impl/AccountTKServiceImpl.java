package service.Impl;

import data.dataBank;
import model.AccountBank;
import model.AccountTK;
import model.AccountTT;
import service.AccountBankService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountTKServiceImpl implements AccountBankService {
    @Override
    public void add(Object o) throws IOException {
        List<AccountBank> list = dataBank.readCSV();
        for (AccountBank accountBank : list) {
            if (accountBank instanceof AccountTK) {
                ((AccountTK) o).setId(accountBank.getId() + 1);
            }
        }
        list.add((AccountTK) o);
        dataBank.writeCSV(list);
    }

    @Override
    public void remove(String code) throws IOException {
        List<AccountBank> list = dataBank.readCSV();
        for (AccountBank accountBank : list) {
            if (accountBank instanceof AccountTK && accountBank.getCodeAccount().equals(code)) {
                list.remove(accountBank);
                break;
            }
        }
        dataBank.writeCSV(list);
    }

    @Override
    public void findAll() throws IOException {
        List<AccountBank> list = dataBank.readCSV();
        for(AccountBank accountBank : list){
            if(accountBank instanceof AccountTK){
                System.out.println(accountBank);
            }
        }
    }


    @Override
    public void find(String code) throws IOException {
        List<AccountBank> list = dataBank.readCSV();
        for (AccountBank accountBank : list) {
            if (accountBank instanceof AccountTK && accountBank.getCodeAccount().equals(code)) {
                System.out.println(accountBank);
                break;
            }
        }
    }
}
