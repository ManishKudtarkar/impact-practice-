import java.util.*;

import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.synth.SynthOptionPaneUI;
public class prac28{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, World!");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,  'J');
        System.out.println(sb);

        sb.insert(3 , 'S');
        System.out.println(sb);

        sb.delete(3,6);
        System.out.println(sb);
}

}