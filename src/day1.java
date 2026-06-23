import java.util.*;

public class CafeteriaSystem {

    static class MenuItem {
        String id;
        String name;
        double price;

        MenuItem(String id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }


    enum FoodCategory {
    BEVERAGE, SNACK, MEAL, DESSERT
}

enum OrderStatus {
    CREATED,
    PREPARING,
    COMPLETED,
    CANCELLED,
    REJECTED
}

// ================= INTERFACE =================

interface MenuComponent {
    String id();
    String name();
    double price();
}

// ================= MENU ITEM =================

static class MenuItem implements MenuComponent {

    private String id;
    private String name;
    private FoodCategory category;
    private double price;

    public MenuItem(String id, String name,
                    FoodCategory category,
                    double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | ₹" + price;
    }
}

// ================= COMBO =================

static class MealCombo implements MenuComponent {

    private String id;
    private String name;
    private List<MenuComponent> items;

    public MealCombo(String id, String name) {
        this.id = id;
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuComponent item) {
        items.add(item);
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double price() {
        double total = 0;

        for (MenuComponent item : items) {
            total += item.price();
        }

        return total;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | Combo Price ₹" + price();
    }
}

// ================= ORDER LINE =================

static class OrderLine {

    private String menuId;
    private int quantity;

    public OrderLine(String menuId, int quantity) {
        this.menuId = menuId;
        this.quantity = quantity;
    }

    public String getMenuId() {
        return menuId;
    }

    public int getQuantity() {
        return quantity;
    }
}

// ================= CUSTOMER ORDER =================

static class CustomerOrder {

    private String orderId;
    private String customerName;
    private List<OrderLine> orderLines;
    private OrderStatus status;

    public CustomerOrder(String orderId,
                         String customerName) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.orderLines = new ArrayList<>();
        this.status = OrderStatus.CREATED;
    }

    public void addOrderLine(OrderLine line) {
        orderLines.add(line);
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}

// ================= MANAGER =================

static class CafeteriaManager {

    private Map<String, MenuComponent> menuById =
            new HashMap<>();

    private Map<String, CustomerOrder> ordersById =
            new HashMap<>();

    public void addMenuComponent(MenuComponent component) {

        if (menuById.containsKey(component.id())) {
            System.out.println("Duplicate Menu ID!");
            return;
        }

        menuById.put(component.id(), component);
    }

    public void addOrder(CustomerOrder order) {

        if (ordersById.containsKey(order.getOrderId())) {
            System.out.println("Duplicate Order ID!");
            return;
        }

        for (OrderLine line : order.getOrderLines()) {

            if (!menuById.containsKey(line.getMenuId())) {
                System.out.println(
                        "Invalid Menu ID: "
                                + line.getMenuId());
                return;
            }

            if (line.getQuantity() <= 0) {
                System.out.println(
                        "Invalid Quantity");
                return;
            }
        }

        ordersById.put(order.getOrderId(), order);
    }

    public double calculateBill(String orderId) {

        CustomerOrder order =
                ordersById.get(orderId);

        if (order == null) {
            System.out.println("Order Not Found");
            return 0;
        }

        double total = 0;

        for (OrderLine line :
                order.getOrderLines()) {

            MenuComponent item =
                    menuById.get(line.getMenuId());

            total += item.price()
                    * line.getQuantity();
        }

        return total;
    }

    public void updateOrderStatus(
            String orderId,
            OrderStatus status) {

        CustomerOrder order =
                ordersById.get(orderId);

        if (order != null) {
            order.setStatus(status);
        }
    }

    public void showPendingOrders() {

        System.out.println("\nPending Orders:");

        for (CustomerOrder order :
                ordersById.values()) {

            if (order.getStatus()
                    == OrderStatus.CREATED
                    || order.getStatus()
                    == OrderStatus.PREPARING) {

                System.out.println(
                        order.getOrderId()
                                + " - "
                                + order.getCustomerName()
                                + " - "
                                + order.getStatus());
            }
        }
    }

    public void showUsageSummary() {

        Map<String, Integer> usage =
                new HashMap<>();

        for (CustomerOrder order :
                ordersById.values()) {

            for (OrderLine line :
                    order.getOrderLines()) {

                usage.put(
                        line.getMenuId(),
                        usage.getOrDefault(
                                line.getMenuId(), 0)
                                + line.getQuantity());
            }
        }

        System.out.println("\nItem Usage Summary");

        for (String id : usage.keySet()) {
            System.out.println(
                    id + " -> "
                            + usage.get(id));
        }
    }

    public double totalSales() {

        double total = 0;

        for (CustomerOrder order :
                ordersById.values()) {

            if (order.getStatus()
                    == OrderStatus.COMPLETED) {

                total += calculateBill(
                        order.getOrderId());
            }
        }

        return total;
    }

    public MenuComponent getMenu(String id) {
        return menuById.get(id);
    }

    public Collection<MenuComponent> getMenus() {
        return menuById.values();
    }

    public Collection<CustomerOrder> getOrders() {
        return ordersById.values();
    }

    // ===== SAVE MENU =====

    public void saveData(String fileName)
            throws Exception {

        PrintWriter pw =
                new PrintWriter(fileName);

        for (MenuComponent item :
                menuById.values()) {

            pw.println(item.id() + ","
                    + item.name() + ","
                    + item.price());
        }

        pw.close();

        System.out.println(
                "Data Saved Successfully.");
    }
}

// ================= MAIN =================

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    CafeteriaManager manager =
            new CafeteriaManager();

    // Sample Data

    MenuItem poster =
            new MenuItem(
                    "C101",
                    "Poster Pack",
                    FoodCategory.SNACK,
                    100);

    MenuItem volunteer =
            new MenuItem(
                    "C102",
                    "Volunteer Kit",
                    FoodCategory.MEAL,
                    150);

    MenuItem rally =
            new MenuItem(
                    "C103",
                    "Rally Support",
                    FoodCategory.MEAL,
                    250);

    manager.addMenuComponent(poster);
    manager.addMenuComponent(volunteer);
    manager.addMenuComponent(rally);

    MealCombo combo =
            new MealCombo(
                    "B201",
                    "Election Bundle");

    combo.addItem(poster);
    combo.addItem(volunteer);

    manager.addMenuComponent(combo);

    int choice;

    do {

        System.out.println(
                "\n===== Campaign Bundle Ordering System =====");

        System.out.println("1. Show Menu");
        System.out.println("2. Create Order");
        System.out.println("3. Calculate Bill");
        System.out.println("4. Update Order Status");
        System.out.println("5. Show Pending Orders");
        System.out.println("6. Usage Summary");
        System.out.println("7. Total Sales");
        System.out.println("8. Save Data");
        System.out.println("0. Exit");

        System.out.print("Enter Choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:

                for (MenuComponent item :
                        manager.getMenus()) {

                    System.out.println(item);
                }

                break;

            case 2:

                sc.nextLine();

                System.out.print("Order ID: ");
                String oid = sc.nextLine();

                System.out.print("Coordinator Name: ");
                String cname = sc.nextLine();

                CustomerOrder order =
                        new CustomerOrder(
                                oid,
                                cname);

                while (true) {

                    System.out.print(
                            "Menu ID (0 to stop): ");

                    String mid =
                            sc.nextLine();

                    if (mid.equals("0"))
                        break;

                    System.out.print(
                            "Quantity: ");

                    int qty =
                            Integer.parseInt(
                                    sc.nextLine());

                    order.addOrderLine(
                            new OrderLine(
                                    mid,
                                    qty));
                }

                manager.addOrder(order);

                System.out.println(
                        "Order Created.");

                break;

            case 3:

                sc.nextLine();

                System.out.print(
                        "Order ID: ");

                String billId =
                        sc.nextLine();

                System.out.println(
                        "Total Bill = ₹"
                                + manager.calculateBill(
                                billId));

                break;

            case 4:

                sc.nextLine();

                System.out.print(
                        "Order ID: ");

                String upId =
                        sc.nextLine();

                System.out.println(
                        "1.CREATED");

                System.out.println(
                        "2.PREPARING");

                System.out.println(
                        "3.COMPLETED");

                System.out.println(
                        "4.CANCELLED");

                System.out.println(
                        "5.REJECTED");

                int s = sc.nextInt();

                manager.updateOrderStatus(
                        upId,
                        OrderStatus.values()[s - 1]);

                System.out.println(
                        "Status Updated.");

                break;

            case 5:

                manager.showPendingOrders();

                break;

            case 6:

                manager.showUsageSummary();

                break;

            case 7:

                System.out.println(
                        "Total Sales = ₹"
                                + manager.totalSales());

                break;

            case 8:

                try {

                    manager.saveData(
                            "menuData.txt");

                } catch (Exception e) {

                    System.out.println(
                            e.getMessage());
                }

                break;

            case 0:

                System.out.println(
                        "Thank You");

                break;

            default:

                System.out.println(
                        "Invalid Choice");
        }

    } while (choice != 0);

    sc.close();
}
}



