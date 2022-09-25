public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus laptop", 5000, 3, "siyah");
        //parametreli constructor


        System.out.println(product.getKod());

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.update(product);
        productManager.delete(product);

        Machine machine = new Machine();
        machine.description = "arzum kahve makinesi";
        machine.price = 1234;
        machine.name = "okka arzum kahve makinesi";

        MachineManager machineManager = new MachineManager();
        machineManager.update(machine);

        productManager.Add2(1, "", "", 2, 200);

    }

}
