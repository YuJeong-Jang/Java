package 도형;

public class Tri extends Shape {
   int h;
   public Tri(int a, int b) {
      this.w=a; //same as super(w);
      h=b;
   }

   @Override
   public void area() {
      result = ((w*h)/2);
      System.out.println("삼각형 면적 : "+ result );
   }
   
   
   
}