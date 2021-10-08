public class Meals {
    private String type;
    private String name;
    private String ingredients;
    private double price;
    private char[] size={'S','M','L'} ;
    
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public char [] getSize() {
        return this.size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char[] size) {
        this.size = size;
    }

}
