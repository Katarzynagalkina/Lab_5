import java.util.*;
import java.util.Iterator;
import static java.lang.Math.*;
public class Ball implements Comparable <Ball>, Body, Iterator <Object>{


    static class Compare_weight_as implements Comparator <Ball>
    {
        public int compare(Ball a1, Ball a2) {
            if(a1.weight==a2.weight) return 0;
            if(a1.weight < a2.weight) return -1;
            else return 1;
        }
    }
    static class Compare_weight_des implements Comparator <Ball>
    {
        public int compare(Ball a1, Ball a2) {
            if(a1.weight==a2.weight) return 0;
            if(a1.weight > a2.weight) return -1;
            else return 1;
        }
    }


    private double radius;
    private int iterator;
    private double weight;


    Ball(double r,double w) {
        assert(r>0);
        this.radius=r;
        this.iterator=0;
        this.weight=w;
    }

    public double get_radius(){return this.radius;}
    public double get_weight(){return this.weight;}
    Ball(String str){
        StringTokenizer st=new StringTokenizer(str, ",");
        this.radius=Double.parseDouble(st.nextToken());
        this.weight=Double.parseDouble(st.nextToken());
    }

    public void reset()  {
        iterator=0;
    }

    public Object next()
    {
        switch(iterator) {
            case 0: {iterator ++; return this.radius;}
            case 1 : {iterator++; return this.weight;}
            default: {reset(); return null;}
        }
    }
    public boolean hasNext() {return(iterator<2);}



    public String ToString()
    {
        return "Ball with a radius of" + radius +" and a weight of "+weight+"\n";
    }


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











