// public class p26{
//     public static void main(String[] args){
//         int i,even=0;odd=0;
//         for(i=20;i<101;i++){
//             if(i % 2! = 0){
//                 even++;
//             }else{
//                 odd++;
//             }
//             System.out.println("Even " +even);
//             System.out.println("Odd " +odd);
//         }
//     }
// }



public class p26
{
    public static void main(String[] args) {
        int oddcount = 0;
        int evencount= 0;
        int n;
        for (int i = 20; i <= 101; i++) {
            if (i % 2 != 0) {
                oddcount = oddcount + 1;
                System.out.println(i);// display the odd value
            }else{
                evencount
            }
        }
        System.out.println("evencount:" + evencount);
        System.out.println("oddcount:" + oddcount);// display the count value
    }
}