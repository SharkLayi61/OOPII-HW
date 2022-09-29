import java.util.*;
class HSRClass implements Runnable{
    static int ticket = 10000;
    int sTicket;
    Thread t;
    static int cnt = 0;

    HSRClass(String name){
        sTicket = 0;
        t = new Thread(this,name);
        t.start();
    }

    public void run(){
        while(buyTicket()==true){
            sTicket+=cnt;
            System.out.println(t.getName()+"賣出"+sTicket+"張票");
        }    
        System.out.println(t.getName()+"總共賣出"+sTicket+"張票");
    }
    
    private synchronized static boolean buyTicket(){
        Random r = new Random();
        int rt = r.nextInt(4)+1;
        cnt = rt;
        if(ticket > 0){
            ticket = ticket - rt;
            return true;
        }else{
            return false;
        }
    }
}

public class HSRHW {
    public static void main(String[] args) {
        HSRClass vA = new HSRClass("售票機A");
        HSRClass vB = new HSRClass("售票機B");
        HSRClass vC = new HSRClass("售票機C");
        HSRClass vD = new HSRClass("售票機D");
    }
}
