package model;

public class AccountTK extends AccountBank {
    private long moneyFrom;
    private String dateFrom;
    private int laiSuat;
    private int kiHan;

    public AccountTK(int id, String codeAccount, String nameAccount, String dateAccount, long moneyFrom, String dateFrom, int laiSuat, int kiHan) {
        super(id, codeAccount, nameAccount, dateAccount);
        this.moneyFrom = moneyFrom;
        this.dateFrom = dateFrom;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public AccountTK(long moneyFrom, String dateFrom, int laiSuat, int kiHan) {
        this.moneyFrom = moneyFrom;
        this.dateFrom = dateFrom;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public long getMoneyFrom() {
        return moneyFrom;
    }

    public void setMoneyFrom(long moneyFrom) {
        this.moneyFrom = moneyFrom;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public int getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(int laiSuat) {
        this.laiSuat = laiSuat;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String show() {
        toString();
        return null;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" + super.toString()+
                "moneyFrom=" + moneyFrom +
                ", dateFrom='" + dateFrom + '\'' +
                ", laiSuat=" + laiSuat +
                ", kiHan=" + kiHan +
                '}';
    }
}
