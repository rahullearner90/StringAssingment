import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter String to check for pellindrome:-");
        String strOrg=scan.nextLine();

        String strRvs="";

        for(int i=strOrg.length()-1; i>=0; i--){
            strRvs += strOrg.charAt(i);
        }
        
        if(strOrg.equals(strRvs)){
            System.out.println("it is pellindrome");
        }else{
            System.out.println("it is not a pellindrom");
        }

        System.out.println(strRvs);
    }
}
