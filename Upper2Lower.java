import java.util.Scanner;

public class Upper2Lower {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your String:-");
        String str=scan.nextLine();

        if(str.equals(str.toLowerCase())){
            str=str.toUpperCase();
        }else{
            str=str.toLowerCase();
        }

        System.out.println(str);
    }
}
