public class Bank {
    private Client[] clients;
    private int countClients;
    private Account[] accounts;
    private int countAccounts;
    public Bank(String name){
        if(name == null ){
            throw new IllegalArgumentException("Status shouldn't be null");
        }
        accounts = new Account[100];
        clients = new Client[100];
    }
    public boolean createAccount(Account account){
        if(accounts.length == countAccounts || account == null){
            return false;
        }
        accounts[countAccounts] = account;
        countAccounts++;
        return true;

    }
    public boolean createClient(Client client){
        if(clients.length == countClients || client == null){
            return false;
        }
        clients[countClients] = client;
        countClients++;
        return true;
    }
    public String makeReport(){
        return "{Clients:" + countClient() + ", Accounts:" + countAccount() + "}";
    }
    private int countClient(){
        return countClients;
    }
    private int countAccount(){
        return countAccounts;
    }
}
