import java.util.*;


class MyTriangle {

    private int length; 

    public MyTriangle(){

        this.setLength(length);
        
    }

    public MyTriangle(int length){

        this.setLength(length);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public void draw(){

            for (int b = 0; b <= this.length; b++){

            for (int c = 1; c <= b; c++) {
                System.out.print('*');
            }
            System.out.println();
           
        }
    }

}

class Main {
    public static void main(String[] args){

        System.out.println("Input the Length: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.println("Output: ");
        MyTriangle t = new MyTriangle();
        t.setLength( length );
        t.draw();


    }
}
