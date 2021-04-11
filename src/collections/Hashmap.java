package collections;

import javax.swing.*;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        //HashMap : it is a key - value pair, which takes boxing classes as an Parameter i.e. Integer,Float,Double
        // Initializing HashMap
        HashMap<String,String> stateCapitalPair = new HashMap<>(){
            {
                put("Bihar","Patna");
                put("Rajasthan","Jaipur");
                put("West bengal","Kolkata");
                put("uttar pradesh","Lucknow");
                put("Maharashtra","Mumbai");
                put("Punjab","Chandigarh");
                put("Tamil nadu","Chennai");
            }
        };
        HashMap<String,String> gfName = new HashMap<>();
        gfName.put("Gk",null);
        gfName.put("Dk","Neha");
        gfName.put("Jp","Samiksha");
        gfName.put("Pk","Nidhi");

        JFrame frame = new JFrame();
        String name = JOptionPane.showInputDialog(frame,"Enter Your Name");
        System.out.println(name);

        if (gfName.containsKey(name)){
            JOptionPane.showMessageDialog(frame,"Contracts! Your gf name is : "+gfName.get(name));
        }else
            JOptionPane.showMessageDialog(frame,"Luckiest person in the world");

    }
}
