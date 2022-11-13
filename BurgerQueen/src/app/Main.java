package app;

public class Main {
    public static void main(String[] args) {
//1.메뉴표시
//2.옵션선택
//3.세트구성
//4.장바구니에 상품추가
//5.장바구니 상품출력
//6.상품주문

        class Product {
            int id;
            String name;
            int price;
            int kcal;
        }

        class Hamburger extends Product {

            boolean isBurgerSet; // 버거옵션 : 세트선택
            int burgerSetPrice; //햄버거가격

        }


        class Side extends Product {

            int ketchup; //사이드 옵션 : 케쳡개수

        }


        class Drink extends Product {

            boolean straw; // 음료옵션 : 빨대유무

        }


        class BurgerSet extends Product {

            Hamburger hamburger;
            Side side;
            Drink drink;

        }

        OrderApp orderApp = new OrderApp();
        orderApp.start();


    }
}