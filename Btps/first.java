package Opps.Btps;

class Rect{
    int l, b;

    public void SetValue(int x, int y){
        l = x;
        b = y;

    }

    public void area(){
        int area = l*b;
        System.out.println(area);
    }

    
}

public class first {

    public static void main(String[] args) {
        System.out.println("Hello Divyansh");
        Rect a1 = new Rect();
        a1.SetValue(2, 6);
        a1.area();
    }
    
}
