import java.util.Scanner;

public class CashRegister {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        String name;
        int quantity;
        double price;


        System.out.print("Enter number of items: ");
        size = sc.nextInt();

        Invoice list = new Invoice(size);

        sc.nextLine();

        for (int i = 0; i < size; i++) {
            item a = new item();

            System.out.printf("Input name of item %d:\n", i + 1);
            name = sc.nextLine();
            a.setName(name);

            System.out.printf("Input quantity of item %d:\n", i + 1);
            quantity = sc.nextInt();
            a.setQuantity(quantity);

            System.out.printf("Input price of item %d:\n", i + 1);
            price = sc.nextDouble();
            a.setPrice(price);


            list.setItem(i, a);

            sc.nextLine();

        }

        list.display();
        list.setSubtotal();
        list.setTax();
        list.setTotal();

        System.out.printf("\n%-20s%30.2f\n", "Subtotal", list.getSubtotal());
        System.out.printf("%-20s%30.2f\n", "6.25% sales tax", list.getTax());
        System.out.printf("%-20s%30.2f\n", "Total", list.getTotal());

    }


    // write your code here
    }

