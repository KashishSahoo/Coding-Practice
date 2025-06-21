public class a6_rockScissors {
    public static void main(String[] args) {
        String str="Rock";
        String ans=move(str);
        System.out.println(ans);
    }
    public static String move(String str){
        if(str.equalsIgnoreCase("rock")){
            return "paper";
        }
        else if(str.equalsIgnoreCase("paper")){
          return "scissor";
        }
        else{
            return "stone";
        }
    }
}
