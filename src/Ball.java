import java.util.*;
import java.util.Iterator;
import static java.lang.Math.*;
public class Ball implements Comparable <Ball>, Body, Iterator <Object>{

    private double radius;
    private int iterator;


    Ball(double r) {
        assert(r>0);
        this.radius=r;
        this.iterator=0;
    }

    public double get_radius(){return this.radius;}
    Ball(String str){
        this.radius=Double.parseDouble(str);
    }

    public void reset()  {
        iterator=0;
    }

    public Object next()
    {
        iterator++;
        reset();
        return radius;
    }

    public String ToString()
    {
        return "Ball with a radius " + radius +"\n ";
    }

    public boolean hasNext() {return(iterator==0);};

    public static void print(Ball[] a)
    {
        for(int i=0;i<a.length;i++)
            System.out.printf(a[i].ToString());
    }

    public int compareTo(Ball obj) {

       if(this.radius==obj.radius) return 0;
       if(this.radius<obj.radius) return -1;
       else return 1;
    };


    public double Volume() {
        return (4/3 * Math.pow((double)radius, 3.0)*Math.PI);
    };

    public double Surface_Area()  {
        return (4 * Math.pow((double)radius, 2.0)*Math.PI);
    };
}











