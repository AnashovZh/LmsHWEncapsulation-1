public class Car {
    private  String model;
    private  String brand;
    private int yearOfIssue;
    private int price;

    public void setModel(String model){
        this.model=model;
    }public String getModel(){
        return model;
    }
    public void setBrand(String brand){
        this.brand=brand;

    }public String getBrand(){
        return brand;
    }
    public void setYearOfIssue(int yearOfIssue){
        this.yearOfIssue=yearOfIssue;
    }
    public int getYearOfIssue(){
        return yearOfIssue;
    }
    public void setPrice(int price){
        if (price>0){
        this.price=price;}
        else {
            System.out.println(" on baa ber!");
        }
    }public int getPrice(){
        return price;
    }
}
