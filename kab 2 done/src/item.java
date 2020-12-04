public class item {
    private String name;      //name can not be empty string
    private int quantity;
    private double price;

    private double total;
    //Methods

    //Default Constructor;

    public item(){
        name= "empty";
        quantity= 0;
        price=0;
        total= 0;
    }

    private boolean isValidname(String name){
        if (name.length()> 30){
            return false;
        }
        else {
            return true;
        }
    }

    //Setter methods
    public String setName(String name) {
        if (isValidname(name)) {
            this.name = name;
            return name;
        }
        else {
            return "the name is bigger than 30 characters";
        }
    }
    public int setQuantity(int num) {
        this.quantity=num;

        return num;
    }
    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    //Get methods
    public double getTotal() {
        this.total= price*quantity;
        return total;
    }
    public String getName() {
        return name;
    }
    public int  getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }




}
