public class Bank {
    private Client[] clients;
    private int numClients;
    private BankAccount[] accounts;
    private int numAccounts;
    private String name;

    public Bank(String name){
        if(name == null ){
            throw new IllegalArgumentException("Status shouldn't be null");
        }
        this.name = name;
        accounts = new BankAccount[100];
        clients = new Client[100];
    }
    public boolean createAccount(BankAccount account){
        if(accounts.length == numAccounts || account == null){
            return false;
        }
        accounts[numAccounts] = account;
        numAccounts++;
        return true;

    }
    public boolean createClient(Client client){
        if(clients.length == numClients || client == null){
            return false;
        }
        clients[numClients] = client;
        numClients++;
        return true;
    }
    public String makeReport(){
        return "{Clients:" + countClient() + ", Accounts:" + countAccount() + "}";
    }
    private int countClient(){
        return numClients;
    }
    private int countAccount(){
        return numAccounts;
    }
}
