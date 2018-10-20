public class Main {

    public static void main(String[] args) {
        int xo;
        xo = 6;
        String golden = "marion";
        int dog = 78;
        double num = 7.888778766;
        long num5 = 3456789;
        char letter = 'j';
        float dec = 7.8f;
        byte b= 127;
        boolean y = true;

        System.out.println(xo);


        int result = multiply(2);
        System.out.println(result);

        int anotherNum = result * xo;

        System.out.println(multiply(2));

    }

    public static int multiply(int number){
        int product = number * 2;
        return product;
    }

    public static int doStuff(){

        return 8;
    }

    public static int doMoreStuff(int x){

        return 8;
    }

    public static String marmion(){
        return "good";
    }

    public static int age(int y){
        return 23;
    }



    //access modifier (public, private...), return type(waht data does this method return?, void means no return type), name (usually a verb),



}


