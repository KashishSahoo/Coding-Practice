public class a36_movieTickets {
    public static void main(String[] args) {
        int t=35;
        String c="yes";
        String ref="yes";
        char cl='B';
        double cost=0;

        if(cl=='A' || cl=='a'){
          cost=150*t;
        }
         else if(cl=='B' || cl=='B'){
          cost=75*t;
        }
        if(t>20){
            cost=cost-cost*0.10;
        }
        if(c.equalsIgnoreCase("yes")){
             cost=cost-cost*0.02;
        }
        if(ref.equalsIgnoreCase("yes")){
            cost=cost+t*50;
        }
        System.out.println(cost);

    }
}
