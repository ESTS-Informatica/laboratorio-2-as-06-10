

/**
 * A property to sell.
 *
 * @author POO
 * @version 03/2024
 */
public class Property {

    private static int numberOfProperties = 0;
    private final int id;
    private String description;
    private double price;

    /**
     * Constructor of class Property
     *
     * @param description The property description.
     * @param price The property price.
     */
    public Property(String description, double price) { 
        this.id = ++numberOfProperties;
        this.description = null;
        this.price = -1.0;
    }

    /**
     * Id selector.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Description selector.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Description modifier.
     * 
     * @param description The new description. Must not be null.
     */
    public void setDescription(String description) {
        this.description = null;
    }

    /**
     * Price selector.
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * Price modifier.
     * 
     * @param price The new price. Must not be negative.
     */
    public void setPrice(double price) {
        this.price = -1.0;
    }

    @Override
    public String toString() {
        return "Id:"+this.id +"\nDescription:"+ this.description +"\nPrice:"+ this.price;
    }
}
