public class DataTypes{
    public static void main(String args[]){
        //1byte=8bits
        byte b=8;// size = 1 byte[-128 to 127]
        System.out.println("Byte value: "+b);

        short n=240;// size = 2 bytes[-32768 to 32767]
        System.out.println("Short value: "+n);

        char ch='A';// size = 2 bytes[0 to 65535]
        System.out.println("Char value: "+ch);

        boolean var=true;// size = 1 bit[true,false]
        System.out.println("Boolean value: "+var);

        int num=1000;// size = 4 bytes[-2^31 to 2^31-1]
        System.out.println("Integer value: "+num);

        float price=10.5f;// size = 4 bytes[decimals]
        System.out.println("Float value: "+price);

        long bigNumber=1000000L;// size = 8 bytes
        System.out.println("Long value: "+bigNumber);
        
        double bigDecimal=10.5;// size = 8 bytes[decimals + big numbers]
        System.out.println("Double value: "+bigDecimal);
        
    }
}