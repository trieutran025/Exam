package model;

public class AccountTT extends AccountBank {
    private String numberIdCard;
    private long moneyCard;

    public AccountTT(int id, String codeAccount, String nameAccount, String dateAccount, String  numberIdCard, long moneyCard) {
        super(id, codeAccount, nameAccount, dateAccount);
        this.numberIdCard = numberIdCard;
        this.moneyCard = moneyCard;
    }

    public AccountTT(String numberIdCard, long moneyCard) {
        this.numberIdCard = numberIdCard;
        this.moneyCard = moneyCard;
    }

    public AccountTT() {
    }

    @Override
    public String show() {
        return toString();
    }

    public String getNumberIdCard() {
        return numberIdCard;
    }

    public void setNumberIdCard(String numberIdCard) {
        this.numberIdCard = numberIdCard;
    }

    public long getMoneyCard() {
        return moneyCard;
    }

    public void setMoneyCard(long moneyCard) {
        this.moneyCard = moneyCard;
    }

    public AccountTT(String numberIdCard, int moneyCard) {
        this.numberIdCard = numberIdCard;
        this.moneyCard = moneyCard;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" + super.toString()+
                "numberIdCard=" + numberIdCard +
                ", moneyCard=" + moneyCard +
                '}';
    }
}
