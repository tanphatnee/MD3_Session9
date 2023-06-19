package bt3;

public class Main {
    public static void main(String[] args) {
        Square[] squares = new Square[2];
        squares[0] = new Square(5);
        squares[1] = new Square("green",true,4);
        for(Square square:squares){
            System.out.println("======");
            System.out.println("Diện tích hình vuông: " +square.getArea());
            if(square.getColor()!=null){
                square.howToColor();
            }
        }
    }
}
