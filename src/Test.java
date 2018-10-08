import java.util.*;
public class Test {

   public static void main(String[] args)
   {
       Ball[] mas=new Ball [4];
       mas[0]=new Ball("3");
       mas[1]=new Ball("1");
       mas[2]=new Ball("6");
       mas[3]=new Ball("0.7");
       Arrays.sort(mas);
       System.out.println("Sort ascending");
       Ball.print(mas);


       Operatable operation;
       operation = (Ball a1, Ball a2)->{ if(a1.get_radius()==a2.get_radius()) return 0;
                                         if(a1.get_radius() > a2.get_radius()) return -1;
                                         else return 1;};

       System.out.println("Sort descending");
       Arrays.sort(mas,operation );
       Ball.print(mas);

       for(Ball i:mas) {
           System.out.println("The volume of ball is equal to " + i.Volume());
           System.out.println("The surface area of ball is equal to " + i.Surface_Area());
       }

   }
}
