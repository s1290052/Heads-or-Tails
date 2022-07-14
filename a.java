import java.util.Random;
    import java.util.Scanner;

    public class a{

    public static void main(String[] args) {

        String[] hands = {"Heads", "Tails"};
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int cou = 0;


        System.out.println("Who are you?");
       System.out.print(">");

        String name = sc.nextLine();
        System.out.println("Hello,"+name+"!");

        System.out.println("Tossing a coin,,,");

        for(int n = 0;n < 3;n++){
            String point = hands[ran.nextInt(2)];
            int t = n + 1;

            if(point == hands[0])cou++;
            System.out.println("Round "+t+": "+point);
      int w = 3 - cou;
    System.out.println("Heads: "+cou+", Tails: "+w);

  if(cou >= 2){
	System.out.println( "You won!");
  }else System.out.println("You lost!");
    }
    }

    }
