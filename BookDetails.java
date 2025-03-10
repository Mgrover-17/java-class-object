public class BookDetails {
    //instance variables
    String title;
    String author;
    int price;

    BookDetails(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void display(){
        System.out.println("title of book is: "+title);
        System.out.println("author of book is: "+author);
        System.out.println("price of book is: "+price);
    }

    public static void main(String[] args){
        BookDetails obj=new BookDetails("Ikigai", "Miralles", 150);
        obj.display();
    }
}
