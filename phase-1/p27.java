public class p27{
    public static void main(String[] args){
        int i, s=0;
        for(i = 30;i < 91;i++){
            if((i%3) == 0){
                s++;
            }
            System.out.println(s);
        }
    }
}