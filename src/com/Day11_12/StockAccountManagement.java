package com.Day11_12;
import java.util.*;

class Stock {
    String name;
    int shares;
    double price;

    public Stock(String name, int shares, double price) {
        this.name = name;
        this.shares = shares;
        this.price = price;
    }

    public double getValue() {
        return shares * price;
    }

    public String toString() {
        return name + " - Shares: " + shares + ", Price: " + price + ", Value: " + getValue();
    }
}

class StockPortfolio {
    List<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.getValue();
        }
        return totalValue;
    }

    public void printReport() {
        for (Stock stock : stocks) {
            System.out.println(stock);
        }
        System.out.println("Total Portfolio Value: " + getTotalValue());
    }
}

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();

        StockPortfolio portfolio = new StockPortfolio();

        for (int i = 1; i <= numStocks; i++) {
            System.out.println("Stock #" + i + ":");
            System.out.print("Enter the stock name: ");
            String name = scanner.next();
            System.out.print("Enter the number of shares: ");
            int shares = scanner.nextInt();
            System.out.print("Enter the share price: ");
            double price = scanner.nextDouble();
            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
            System.out.println();
        }

        System.out.println("Stock Report:");
        portfolio.printReport();
    }
}
