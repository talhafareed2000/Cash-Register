public class Invoice {
    private item items[];
    private int size = 1;
    private double subtotal, tax, total;

    public Invoice(int size) {
        if (size > 0) {
            this.size = size;
            items = new item[size];
        }
    }


    //Methods
    public void setItem(int pos, item item) {
        items[pos] = item;
    }

    //subtotal
    public double setSubtotal() {
        for (int i = 0; i < size; i++) {
            this.subtotal += items[i].getTotal();
        }
        return subtotal;
    }

    //tax
    public double setTax() {
        double ans;
        ans = Math.round(subtotal * 0.0625 * 100);
        this.tax = ans / 100;
        return tax;
    }

    //total
    public double setTotal() {
        this.total = subtotal + tax;
        return total;
    }


    public double getSubtotal() {
        return subtotal;
    }

    public double getTax() {
        return tax;
    }

    public double getTotal() {
        return total;
    }

    public void display() {
        setSubtotal();
        setTax();
        setTotal();

        System.out.print("Your bill:\n");
        System.out.printf("%-30s%10s%10s%10s\n","Item","Quantity","Price","Total");
        for(int i=0;i<size;i++) {
            System.out.printf("%-30s%10d%10.2f%10.2f\n",items[i].getName(),items[i].getQuantity(),items[i].getPrice(),items[i].getTotal());
        }
        System.out.printf("\n%-20s%30.2f\n","Subtotal",getSubtotal());
        System.out.printf("%-20s%30.2f\n","6.25% sales tax",getTax());
        System.out.printf("%-20s%30.2f\n","Total",getTotal());
    }

}
