public class prog5 {
    public static void main(String args[]){
        float pencil=10.5f;
        float pen=20.0f;
        float eraser=5.5f;

        float total=pencil+pen+eraser;
        float gst=(total*18)/100;
        float fin=total+gst;

        System.out.println("Total: "+total);
        System.out.println("GST: "+gst);
        System.out.println("Final Bill: "+fin);

    }
}
