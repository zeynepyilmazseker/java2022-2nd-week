public class ProductManager {
    public void add(Product product){
        //JDBC kodları sonra öğreneceğiz.
        System.out.println("ürün eklendi "+ product.getName());
    }
    public void update(Product product){
        System.out.println("ürün bilgisi güncellendi "+ product.getDescription());
    }
    public void delete(Product product){
        System.out.println("ürün fiyatı silindi "+ product.getPrice());
    }
    public void Add2(int id,String name, String description, int stockAmount,double price){
       //hatalı bir yazım. herhangi bir değişiklik yapmak istediğimizde diğer ekranları tek tek değiştirmek gerekir.
    }
}
