package javamaven;

public class Customer {
    {
        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String name1;
    private String name2;
    private String name3;
    private String address;
    private int creditCardId;
    private int bankNumberCard;

    Customer(String name1, String name2, String name3, String address, int creditCardId, int bankNumberCard){

        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.address = address;
        this.creditCardId = creditCardId;
        this.bankNumberCard = bankNumberCard;
    }

    public String getName1(){
        return name1;
    }
    public String getName2(){
        return name2;
    }
    public String getName3(){
        return name3;
    }
    public String getAddress(){
        return address;
    }
    public int getCreditCardId(){
        return creditCardId;
    }
    public int getBankNumberCard(){
        return bankNumberCard;
    }

    public String toString(){
        return String.format("ID: %d\t name1: %s\t name2: %s\t name3: %s\t address: %s\t creditCardId: %d\t bankNumberCard: %d",
                id,name1,name2,name3,address,creditCardId,bankNumberCard);
    }
}
