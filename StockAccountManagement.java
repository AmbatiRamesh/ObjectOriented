package com.bridgelabz.objectOriented;

import java.util.Scanner;
public class StockAccountManagement {
    private static int noOfStocks;
    private static String shareName;
    private static int noOfShare;
    private static long sharePrice;
    static long stockPrice;
    static long totalValue;
    public static int getNoOfStocks() {
        return noOfStocks;
    }
    public static void setNoOfStocks(int noOfStocks) {
        StockAccountManagement.noOfStocks = noOfStocks;
    }
    public static long getSharePrice() {
        return sharePrice;
    }
    public static void setSharePrice(long sharePrice) {
        StockAccountManagement.sharePrice = sharePrice;
    }
    public static String getShareName() {
        return shareName;
    }
    public static void setShareName(String shareName) {
        StockAccountManagement.shareName = shareName;
    }
    public static long getStockPrice() {
        return stockPrice;
    }
    public static void setStockPrice(long stockPrice) {
        stockPrice = stockPrice;
    }
    public static int getNoOfShare() {
        return noOfShare;
    }
    public static void setNoOfShare(int noOfShare) {
        StockAccountManagement.noOfShare = noOfShare;
    }
    public static long getTotalValue() {
        return totalValue;
    }
    public static void setTotalValue(long totalValue) {
        totalValue = totalValue;
    }
    public void addShare() {
        // user input of Share details
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the Name of Share: ");
        shareName = scanner.nextLine();
        System.out.println("Enter the number of Share: ");
        noOfShare = scanner.nextInt();
        System.out.println("Enter the price for Share: ");
        sharePrice = scanner.nextInt();
        stockPrice = noOfShare * sharePrice*noOfStocks;
        System.out.println("\nValue of Stock " + shareName + " is = " + stockPrice);
        scanner.close();
    }
    public static class PortFolio extends StockAccountManagement {
        public static void main(String[] args) {
            System.out.println("Enter the total number of Stocks: ");
            Scanner scanner = new Scanner(System.in);
            setNoOfStocks(scanner.nextInt());
            StockAccountManagement stock = new StockAccountManagement();
            stock.addShare();
            totalValue += stockPrice;
            System.out.println("\nTotal Value is " + totalValue);
        }
    }
}



