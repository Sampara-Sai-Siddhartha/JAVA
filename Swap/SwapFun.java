class Swapping{
    void swap1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
    void swap2(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a+" "+b);
    }
    void swap3(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+" "+b);
    }
}
class SwapFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping");
        System.out.println(a+" "+b);
        Swapping change = new Swapping();
        System.out.println("After Swapping method 1");
        change.swap1(a,b);
        System.out.println("After Swapping method 2");
        change.swap2(a,b);
        System.out.println("After Swapping method 3");
        change.swap3(a,b);
    }
}
