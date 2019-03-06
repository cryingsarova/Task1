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

        String resultString = "Book[name="+name+
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
}
