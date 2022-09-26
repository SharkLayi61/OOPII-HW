import java.util.*;

public class HW1 {  
    public static void main(String[] args) {
        System.out.println("電腦從1~100中的整數中，亂數取出10個不重複的號碼....");
        Random r = new Random();
        var tset= new TreeSet<>();

        while(tset.size()<10){
            int rn = r.nextInt(100)+1;
            if(tset.contains(rn)){
                continue;
            }else{
                tset.add(rn);
                System.out.println("第 "+tset.size()+" 個號碼："+rn);
            }
        }
        System.out.println("物件內元素個數為："+tset.size());
        System.out.println("物件內元素的內容："+tset);
        System.out.println("第一個元素內容為："+tset.first());
        System.out.println("最後一個元素內容："+tset.last());
        System.out.println("內容介於 30～70 者："+tset.subSet(30, 70));//若不包含30則把30改成31
        
    }
}
