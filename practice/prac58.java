public class prac58{
    public static void main(String[] args){
        String str = "Hellooooo";
        //Hello World = H= 1, e= 1, l= 2, o= 2
        int count= 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'o'){
                count++;
            }
        }        System.out.println("The number of 'o' in the string is: " + count);
    }
}