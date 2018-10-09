import java.util.*;
import java.util.StringTokenizer;
public class Test {

   public static void main(String[] args)
   {
       Ball[] mas=new Ball [4];
       mas[0]=new Ball("3,10");
       mas[1]=new Ball("1,18.8");
       mas[2]=new Ball("6,9");
       mas[3]=new Ball("0.7,1.2");

       System.out.println("\nSORT BY RADIUS\n");

       System.out.println("Sort ascending");
       Arrays.sort(mas);
       Ball.print(mas);

       Operatable operation;
       operation = (Ball a1, Ball a2)->{ if(a1.get_radius()==a2.get_radius()) return 0;
                                         if(a1.get_radius() > a2.get_radius()) return -1;
                                         else return 1;};

       System.out.println("Sort descending");
       Arrays.sort(mas,operation );
       Ball.print(mas);


       System.out.println("\nSORT BY WEIGHT\n");

       System.out.println("Sort ascending");
       Arrays.sort(mas,new Ball.Compare_weight_as());
       Ball.print(mas);
       System.out.println("Sort descending");
       Arrays.sort(mas,new Ball.Compare_weight_des());
       Ball.print(mas);
       System.out.println();

       for(Ball i:mas) {
           System.out.println("The volume of ball is equal to " + i.Volume());
           System.out.println("The surface area of ball is equal to " + i.Surface_Area());
       }
       System.out.println();
       System.out.println("The fields of objects ");

       for(int i=0;i<4;i++)
       {
           while(mas[i].hasNext())
               System.out.print(mas[i].next()+ " ");
           System.out.println();
       }
   }
}

