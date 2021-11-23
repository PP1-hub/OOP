import java.math.BigDecimal;

public class Application {
    static Account regAcc;
    static Account premAcc;
    static Account goldenAcc;
    public static void main(String[] args){
        Client client = new Client("John","+7272727722", "9382434194");
        regAcc = new RegularAccount("4400******1110", "1", client, new BigDecimal("10000.00"));
        premAcc = new PremiumAccount("4400******1110", "1", client, new BigDecimal("10000.00"));
        goldenAcc = new GoldenAccount("4400******1110", "1", client, new BigDecimal("10000.00"));

        Bank bank = new Bank("AnyBank");

        bank.createAccount(regAcc);
        bank.createAccount(premAcc);
        bank.createAccount(goldenAcc);
        bank.createClient(client);

        System.out.println(bank.makeReport());
        balancePrinter();

        regAcc.credit(new BigDecimal("1000.00"));
        premAcc.credit(new BigDecimal("1000.00"));
        goldenAcc.credit(new BigDecimal("1000.00"));
        
        balancePrinter();

        regAcc.debit(new BigDecimal("1000.00"));
        premAcc.debit(new BigDecimal("1000.00"));
        goldenAcc.debit(new BigDecimal("1000.00"));
        
        balancePrinter();

        regAcc.paymentForService();
        premAcc.paymentForService();
        goldenAcc.paymentForService();

        balancePrinter();

        regAcc.getStatement();
        premAcc.getStatement();
        goldenAcc.getStatement();
    }
    private static void balancePrinter(){
        System.out.println(regAcc.getBalance());
        System.out.println(premAcc.getBalance());
        System.out.println(goldenAcc.getBalance());
        System.out.println();
    }
}
