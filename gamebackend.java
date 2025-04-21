package assesment;
import java.util.Scanner;
public class gamebackend {
public static void main(String[] args) {
	gamestore op =new gamestore();
	Scanner sc =new Scanner(System.in);
	op.gamestore();
	System.out.println("enter the choice");
	int res=sc.nextInt();
	op.operation(0, res);
    int copies=sc.nextInt();
	if(res==1) {
		System.out.println(1500*(copies));
	}if(res==2){
		System.out.println(1200*(copies));
	}if(res==3) {
		System.out.println(1000*(copies));
	}if(res==4) {
		System.out.println(800*(copies));
	}if(res==5) {
		System.out.println(500*(copies));
	}else{
		System.out.println("thank you");
	}
	
}


 }
 
