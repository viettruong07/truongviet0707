package Session04;

class Month<T> {
    T monthObj;
    Month(T obj){
        monthObj = obj;
    }
    T getob(){
        return monthObj;
    }
}
class MonthArray<T,V> extends Month<T>{
    V valObj;
    MonthArray(T obj, V obj2) {
        super(obj);
        valObj = obj2;
    }
    V getob2(){
        return valObj;
    }
}
public class HierTest {
    public static void main(String[] args) {
        MonthArray<String, Integer> month;
        month= new MonthArray<>("Value is: ", 99);
        System.out.print(month.getob());
        System.out.println(month.getob2());
    }
}
