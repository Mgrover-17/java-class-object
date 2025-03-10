public class TrackItems {
    int itemCode;
    String itemName;
    int price;

    TrackItems(int itemCode, String itemName, int price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }

    public void display(){
        System.out.println("item code is: "+itemCode);
        System.out.println("item name is: "+itemName);
        System.out.println("item price is: "+price);
    }

    public int cost(int quantity){
        return quantity*price;
    }

    public static void main(String[] args){
        int quantity=5;
        TrackItems obj=new TrackItems(10, "jeans", 100);
        obj.display();
        int totalCost=obj.cost(quantity);
        System.out.println("total cost of jeans is: "+totalCost);
    }

}
