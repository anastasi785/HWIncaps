public class Flower {
    String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String name, String country, double cost) {
        this.name = name;
        if (flowerColor != null && !flowerColor.isEmpty()) {
            this.flowerColor = flowerColor;
        } else {
            flowerColor = "белый";
        }
        if (country.isEmpty() || country != null) {
            this.country = country;

        } else {
            this.country = "Россия";
        }
        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public Flower(String name,  double cost, int lifeSpan) {
        this.name = name;
        this.flowerColor = "белый";

        this.cost = cost;
        this.lifeSpan = lifeSpan;
        if (country != null&&!country.isEmpty() ) {
            this.country = country;

        } else {
            this.country = "Россия";
        }
    }
        public Flower(String name, String country, double cost, int lifeSpan){
        this.name=name;
        this.country=country;
        this.cost=cost;
        this.lifeSpan=lifeSpan;
        flowerColor="белый";
        }





    void information(){
        System.out.println("название "+name+ " страной происхождения "+country);
        System.out.printf(" стоимость "+cost);
        System.out.println( " сроком стояния цветка "+lifeSpan+" дней. цвет "+ flowerColor);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }
}


