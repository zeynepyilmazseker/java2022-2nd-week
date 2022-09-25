public class Product {
    public Product (int id,String name,String description,double price,int stockAmount,String renk){ //newlediğinde ancak bu parametreleri verirsen çalışırım diyor  v
        System.out.println("yapıcı blok çalıştı.");
        this.id=id;
        this.renk=renk;
        this.name=name;
        this.price=price;
        this.description=description;
        this.stockAmount=stockAmount;
    }
    public Product(){
        
    }
    //attribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;
    //public her yerden ulaşılabilir demek.
    //private demek sadece tanımlandığı blokta geçerli demek.
    //örneğin yazdığımız bu değişkenler sadece Product{} bloğunda geçerlidir.
    // get bir değeri okumak
    // set ise bir değer atamak

    //getter bloğu
    public int getId() {
        return this.id;
    } //id yazılamaz sadece okunur

    //setter bloğu
    public void setId(int id) {
        this.id = id;
        //THIS içinde bulunduğumuz class anlamına gelir. örneğin şu an içinde bulunduğumuz Product classı gibi

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1)+ id;
    }


}
