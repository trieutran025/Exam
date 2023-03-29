package service;

import java.io.IOException;
import java.util.Objects;

public interface AccountBankService {

    void add(Object o) throws IOException;
    void remove(String code) throws IOException;
    void findAll() throws IOException;
    void find(String code) throws IOException;
}
