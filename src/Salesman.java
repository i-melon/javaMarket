
enum LegalEntityType {
    IP, TOO
}
class Salesman extends User {

    private LegalEntityType legalEntityType;
    private long bankAccount;
    private Laptop[] laptops;
    private Mobile[] mobiles;
    private int laptopSoldCount;
    private int mobileSoldCount;

    public Salesman(String fullName, long iin, String contactNumber, LegalEntityType legalEntityType, long bankAccount, int laptopCapacity, int mobileCapacity) {
        super(fullName, iin, contactNumber);
        this.legalEntityType = legalEntityType;
        this.bankAccount = bankAccount;
        this.laptops = new Laptop[laptopCapacity];
        this.mobiles = new Mobile[mobileCapacity];
        this.laptopSoldCount = 0;
        this.mobileSoldCount = 0;
    }

    public LegalEntityType getLegalEntityType() {
        return legalEntityType;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public int getLaptopCapacity() {
        return laptops.length;
    }

    public int getMobileCapacity() {
        return mobiles.length;
    }

    public int getLaptopSoldCount() {
        return laptopSoldCount;
    }

    public int getMobileSoldCount() {
        return mobileSoldCount;
    }

    public void sellLaptop(Laptop laptop, Buyer buyer) {
        if (laptopSoldCount < laptops.length) {
            laptops[laptopSoldCount] = laptop;
            laptopSoldCount++;
            buyer.buyLaptop(laptop, this);
        } else {
            System.out.println("Продавец не может продать больше ноутбуков.");
        }
    }

    public void sellMobile(Mobile mobile, Buyer buyer) {
        if (mobileSoldCount < mobiles.length) {
            mobiles[mobileSoldCount] = mobile;
            mobileSoldCount++;
            buyer.buyMobile(mobile, this);
        } else {
            System.out.println("Продавец не может продать больше мобильных устройств.");
        }
    }

    public void generateSalesReport() {
        System.out.println("Отчет продаж:");
        System.out.println("Тип юридического лица: " + legalEntityType);
        System.out.println("Банковский счет: " + bankAccount);
        System.out.println("Продано ноутбуков: " + laptopSoldCount);
        System.out.println("Продано мобильных устройств: " + mobileSoldCount);
    }

    @Override
    void changeNumber(String number) {

    }

    @Override
    void changeFullName(String data) {

    }
}
