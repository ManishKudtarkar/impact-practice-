public class prac72 {
    public static void main(String[] args){
        String str = {"Flow", "Flow", "flight"};
        for (int i = 0 ; i < str.lngth; i++){
            for (int j = i + 1; i<str.length(); j++){
                if (str[i].charAt(j) == str[j].charAt(j)){
                    System.out.println(str[i].charAt(j));
                    if (str[i] == str[j]){
                        System.out.println(str[i]);
                    }
                    else{
                        System.out.println("No common prefix" + str);
                    }
                }
            }
        }
    }
}
