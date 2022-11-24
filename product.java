class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String show() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}

class FurnitureProduct extends Product {
    private float length, breadth, height;

    FurnitureProduct(int id, String name, float price, float length, float breadth, float height) {
        super(id, name, price);
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String show() {
        //how to invoke base class show here??
        return super.show() + "\tFurnitureProduct [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
    }
    

    
}

class ClothingProduct extends Product {
    private int  size;
    private String  type;

    ClothingProduct(int id, String name, float price,int  size,String  type) {
        super(id, name, price);
        this.size = size;
        this.type = type;
      
    }

    public float getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   
    public String show() {
        return super.show() + "\tClothingProduct [size=" + size + ", type=" + type+ "]";
    }
    
public static void main(String[] args) {

        Product parr[] = new Product[4];
        parr[0] = new FurnitureProduct(1, "Prod1", 6.5f, 1.1f,2.2f,3.3f);
        parr[1] = new FurnitureProduct(2, "Prod2", 11.25f, 1.1f,2.2f,3.3f);
         parr[2] = new ClothingProduct(3, "Prod3", 6.5f, 40,"Traditional");
        parr[3] = new ClothingProduct(4, "Prod4", 11.25f,42,"Traditional");
        for (Product prod : parr) {
            System.out.println(prod.show());
        }
    }
    
}
