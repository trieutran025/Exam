package model;

public abstract class AccountBank {
    private int id ;
    private String codeAccount;
    private String nameAccount;
    private String dateAccount;

    public AccountBank(int id, String codeAccount, String nameAccount, String dateAccount) {
        this.id = id;
        this.codeAccount = codeAccount;
        this.nameAccount = nameAccount;
        this.dateAccount = dateAccount;
    }

    public AccountBank() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeAccount() {
        return codeAccount;
    }

    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getDateAccount() {
        return dateAccount;
    }

    public void setDateAccount(String dateAccount) {
        this.dateAccount = dateAccount;
    }
    public abstract String show();

    @Override
    public String toString() {
        return "" +
                "id=" + id +
                ", codeAccount='" + codeAccount + '\'' +
                ", nameAccount='" + nameAccount + '\'' +
                ", dateAccount='" + dateAccount + '\'' ;
    }
}
