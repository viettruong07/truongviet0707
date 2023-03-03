package Session04;
import java.util.ArrayList;
import java.util.List;
interface NumStack{
    public boolean empty();
    public void push(Object elt);
    public Object retrieve();
}
class NumArrayStack implements NumStack {
    private List listObj;

    public NumArrayStack() {
        listObj = new ArrayList<>();
    }

    @Override
    public boolean empty() {
        return listObj.size() == 0;
    }

    @Override
    public void push(Object obj) {
        listObj.add(obj);
    }

    @Override
    public Object retrieve() {
        Object value = listObj.remove(listObj.size() - 1);
        return value;
    }
    @Override
    public String toString(){
        return "stack" + "ListObj".toString();
    }
}
public class Client {
    public static void main(String[] args) {
        NumStack stackObj = new NumArrayStack();
        for (int ctr=0; ctr<4; ctr++){
            stackObj.push(new Integer(ctr));
        }
        assert stackObj.toString().equals("stack[0,1,2,3]");
        int top = ((Integer) stackObj.retrieve()).intValue();
        System.out.println("Value is: " + top);
    }
}


