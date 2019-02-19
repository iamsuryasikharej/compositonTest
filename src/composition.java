import java.util.*;
class a{
    int x;
    ArrayList<Number> number;
    a(int x,ArrayList<Number> number){
        this.x=x;
        this.number=number;

    }

    public int getX()
    {
        return x;
    }
    public ArrayList<Number> getNumbers(){
        return number;
    }
}




class Number
{
    int x;
    Number(int x){
        this.x=x;

    }
}
class composition{
    public static void main(String[] args) {
        Number n1=new Number(1);
        Number n2=new Number(2);
        Number n3=new Number(3);
        Number n4=new Number(4);
        ArrayList<Number> number =new ArrayList<Number>();
        number.add(n1);
        number.add(n2);
        number.add(n3);
        number.add(n4);
        a obj=new a(100,number);
        System.out.println( obj.getX());
        ArrayList<Number> numberToPrint= obj.getNumbers();
        for(Number number1:numberToPrint){
            System.out.println(number1.x);
        }



    }
}

