package app.product;

public class Product {
    private int id;
    private String name;
    private int price;
    private int kcal;

    public Product(int id, String name, int price, int kcal) {
        this.id = id; // this 의 경우 private 으로 설정해준 변수들을 지정한다.
        this.name = name;
        this.price = price;
        this.kcal = kcal;
    } //여기까지 필요한 필드 생성.

    public  Product(String name, int price, int kcal){
        this.name = name;
        this.price = price;
        this.kcal = kcal;
    }

    public int getId() {
        return id; //getter은 인스턴스 변수를 반환
    }

    public void setId(int id) {
        this.id = id; //setter은 인스턴스 변수를 대입하거나 수정.
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

}
