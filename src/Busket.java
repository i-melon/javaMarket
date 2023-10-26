class Basket {
    private Buyer buyer;
    private List<Product> products;  // Предположим, что у вас есть класс Product для представления товаров

    public Basket(Buyer buyer) {
        this.buyer = buyer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void completePurchase(Salesman salesman) {
        double totalCost = calculateTotalCost();
        if (totalCost <= buyer.getCreditCardBalance()) {
            // Вычитаем стоимость покупок из баланса покупателя
            buyer.setCreditCardBalance(buyer.getCreditCardBalance() - totalCost);

            // Добавляем стоимость покупок на банковский счет продавца
            long sellerBankAccount = salesman.getBankAccount();
            sellerBankAccount += (long) totalCost;
            salesman.setBankAccount(sellerBankAccount);

            // Покупка завершена, очищаем корзину
            products.clear();

            System.out.println("Покупка завершена. Сумма: " + totalCost + " тенге.");
        } else {
            System.out.println("Недостаточно средств на кредитной карте для совершения покупки.");
        }
    }

    private double calculateTotalCost() {
        double totalCost = 0.0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
}
