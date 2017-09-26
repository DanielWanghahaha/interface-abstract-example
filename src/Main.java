import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
interface IX{
    String isx="isx";
    boolean excute(String sql);
}
abstract class AbsIX implements IX{
    static String isx="absix";
    public AbsIX(){
        System.out.println(isx);
    }
    public boolean excute(String sql) {
        return this.isx=="absix";
    }
}
class CX1 extends AbsIX{
    static {isx="CX1";}
    public boolean excute(String sql){
        System.out.println(isx);
        return this.isx=="CX1";
    }
}
class CX2 extends AbsIX{
   CX2() {isx="CX2";}
    public boolean excute(String sql){
        System.out.println(isx);
        return this.isx.equals("CX2");
    }
}
public class Main{
    public static void main(String[] args) {
        IX cx1=new CX1();
        IX cx2=new CX2();
//        CX2 cx3=new CX2();
//        System.out.println(cx3.isx);
        if(cx1.excute(null)){
            System.out.println(cx2.isx);
        }
        else if(cx2.excute(null)){
            System.out.println(cx1.isx);
        }
    }
}