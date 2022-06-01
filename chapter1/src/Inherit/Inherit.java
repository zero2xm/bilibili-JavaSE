package Inherit;

public class Inherit {
    public static void main(String[] args) {
        Inherit et = new Inherit();
        String s = et.toString();
        System.out.println(s);

        CreditAccount act = new CreditAccount();
        act.setActno("act-001");
        act.setBalance(-1000.0);
        act.setCredit(0.99);

        System.out.println(act.getActno());
    }
}
