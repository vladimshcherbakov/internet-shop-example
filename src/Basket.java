public class Basket {
    private static String items = "";
    private static int totalprice = 0;

    public static void main(String[] args) {
        add("Колбаса", 76);
        add("Молоко", 55);
        add("Масло", 120);
        print("Содержимое корзины");
        int totalprice = getTotalPrice();
        System.out.println("Общая стоимость товаров: " + totalprice);
        clear();
        System.out.println();
        print("Содержимое корзины");
        totalprice = getTotalPrice();
        System.out.println("Общая стоимость товаров: " + totalprice);
    }
    public  static void add(String name, int price) {
        if (contains(name)) {
            return;
        }
        items = items + "\n" + name + " - " + price;
        totalprice = totalprice + price;
    }
    public static void clear() {
        items = "";
        totalprice = 0;
    }
    public static int getTotalPrice() {
        return  totalprice;
    }
    public static boolean contains(String name) {
        return items.contains(name);
    }
    public static void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
