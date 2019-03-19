package com.netcracker;

import java.util.Objects;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuffer authorsString = new StringBuffer("{");
        for (Author author: authors) {
            authorsString.append(author.toString()+",");
        }

        authorsString.deleteCharAt(authorsString.length()-1);
        authorsString.append("}");

        String resultString = "com.netcracker.Book[name="+name+
                                ",authors="+authorsString+
                                ",price="+price+
                                ",qty="+qty+"]";
        return resultString;
        }

    public String getAuthorNames(){
        StringBuffer resultString= new StringBuffer();
            for (Author author: authors) {
                resultString.append(author.getName()+",");
            }
            resultString.deleteCharAt(resultString.length()-1);
            return resultString.toString();
    }

    @Override
    public int hashCode(){
        int hashCode = 59;
        hashCode = 31 * hashCode+ name.hashCode();
        for (Author author: authors ) {
            hashCode = 31 * hashCode + author.hashCode();
        }
        hashCode = 31 * hashCode + (int)(Double.doubleToLongBits(price)^(Double.doubleToLongBits(price)>>>32));
        hashCode = 31 * hashCode + qty;
        return hashCode;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return  true;
        if (object == null || !(object instanceof Book)) return false;
        return Objects.equals(this.name,((Book) object).name) && this.price==((Book) object).price && Objects.equals(this.authors,((Book) object).authors);
    }
}
