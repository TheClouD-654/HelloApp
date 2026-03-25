import java.util.Scanner;
public class HelloApp{

    private String name;
    String result;

    public void getnames(){
        Scanner input= new Scanner (System.in);
        System.out.println("Enter any many names you want: ");
        name= input.nextLine();
        String[] names=name.split(" ");
        result = String.join(", ", names);
        input.close();
    }
    public void display(){
        
        System.out.println("Hello "+result+"!");
    }
    public static void main(String[] args) {
        HelloApp a=new HelloApp();
        a.getnames();
        a.display();
    }
}