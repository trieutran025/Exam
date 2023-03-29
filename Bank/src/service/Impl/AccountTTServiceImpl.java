package service.Impl;

import com.sun.deploy.uitoolkit.ToolkitStore;
import data.dataBank;
import model.AccountBank;
import model.AccountTK;
import model.AccountTT;
import service.AccountBankService;

import java.io.IOException;
import java.util.List;

public class AccountTTServiceImpl implements AccountBankService {
    @Override
    public void add(Object o) throws IOException {
        List<AccountBank> list = dataBank.readCSV();
        for (AccountBank accountBank : list) {
            if (accountBank instanceof AccountTT) {
                ((AccountTT) o).setId(accountBank.getId() + 1);
            }
        }
        list.add((AccountTT) o);
        dataBank.writeCSV(list);
    }

    @Override
    public void remove(String code) throws IOException {
        List<AccountBank> list = dataBank.readCSV();
        for (AccountBank accountBank : list) {
            if (accountBank instanceof AccountTT && accountBank.getCodeAccount().equals(code)) {
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
               if(accountBank instanceof AccountTT){
               System.out.println(accountBank);
           }
       }
    }

    @Override
    public void find(String code) throws IOException {
        List<AccountBank> list = dataBank.readCSV();
        for (AccountBank accountBank : list) {
            if (accountBank instanceof AccountTT && accountBank.getCodeAccount().equals(code)) {
                System.out.println(accountBank.show());
                break;
            }
        }
    }
}
