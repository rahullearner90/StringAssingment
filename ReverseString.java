import java.util.Scanner;

class ReverseString{
    public static void main(String args[]){
        // method 1 to show only
        String str="indian";
        char ch[]=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(ch[i]);
        }

        // method 2
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter String to Reverse:-");
        String strOrg=scan.nextLine();
        String strRvs="";
        for(int i=strOrg.length()-1; i>=0; i--){
            strRvs += strOrg.charAt(i);
        }
        System.out.println(strRvs);
    }
}