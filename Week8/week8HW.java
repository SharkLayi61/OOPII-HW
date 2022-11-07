import javax.swing.*;
import java.awt.*;
import java.util.List;
import javax.swing.event.*;

class MyJFrame3 extends JFrame implements ListSelectionListener{
    private JPanel mainPane = new JPanel();
    private JPanel contPane = new JPanel();
    private JPanel contPane2 = new JPanel();
    private int cnt = 0;
    
    private JTextArea jta = new JTextArea("可選取地名...\n",5,20);
    private JScrollPane sp = new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    
    String[] city = {"台北","宜蘭","桃園","台中","南投","彰化"};
    private JList<String> jl1 = new JList<>(city);
    private JScrollPane sp2 = new JScrollPane(jl1,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    
    MyJFrame3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("各地名山");
        setBounds(50,50,300,300);

        mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.Y_AXIS));
        contPane.setLayout(new FlowLayout(FlowLayout.CENTER));
        contPane2.setLayout(new FlowLayout(FlowLayout.CENTER));
        setContentPane(mainPane);

        JLabel lblCity = new JLabel("找各地名山：");
        contPane.add(lblCity);

        
        jl1.addListSelectionListener(this);
        jl1.setVisibleRowCount(4);
        jl1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        contPane.add(sp2);
        
        jta.setEditable(false);
        contPane2.add(sp);

        mainPane.add(contPane);
        mainPane.add(contPane2);
        setVisible(true);
    }
    public void valueChanged(ListSelectionEvent e){
        cnt++;
        List<String> city=jl1.getSelectedValuesList();
        if(jl1.isSelectionEmpty()){
            jta.setText("可選取地名...\n");
        }
        if(cnt==1){
            jta.setText("");
        }   
        String cont = "";
        String mountain ="";
        for(int i = 0;i<city.size();i++){
            if(city.get(i)=="台中"){
                mountain="梨山";
            }else if(city.get(i)=="彰化"){
                mountain="八卦山";
            }else if(city.get(i)=="台北"){
                mountain="陽明山";
            }else if(city.get(i)=="宜蘭"){
                mountain="抹茶山";
            }else if(city.get(i)=="桃園"){
                mountain="拉拉山";
            }else if(city.get(i)=="南投"){
                mountain="玉山";
            }else{
                mountain="";
            }
            cont=cont+city.get(i)+" 名山：　"+mountain+"\n";
            jta.setText(cont);
        }
        
    }

    
}

public class week8HW {
    public static void main(String[] args) {
        MyJFrame3 f1 = new MyJFrame3();
    } 
}
