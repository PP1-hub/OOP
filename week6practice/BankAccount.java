public class BankAccount{
    private String number;
    private String status;
    private String owner;

    public BankAccount(String number, String status, Client owner){
        this.number = number;
        if (status == null || !"1".equals(status) && !"2".equals(status)){
            throw new IllegalArgumentException("Status should be in (1,2)");
        }
        this.status = status;
        this.owner = new Client(owner.getName(), owner.getPhone(), owner.getID());
    }
    public Client getOwner(){
        return new Client(owner.getName(), owner.getPhone(), owner.getID());
    }
    public String getNumber(){
        return number;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        if (status == null || !"1".equals(status) && !"2".equals(status)){
            throw new IllegalArgumentException("Status should be in (1,2)");
        }
        this.status = status;
    }
}
