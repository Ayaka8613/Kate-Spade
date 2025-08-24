class ConditionBranch{

     public static String outputScore(int score){
         if (score >= 90){
             return "A";
         }else if(score >= 80){
             return "B";
         }else if (score >= 70){
             return "C";
         }else if(score >= 60){
             return "D";
         }else{
            return "F";
        }
    }

    public static void outputMenu(int menuNo) {

        int menu = menuNo;

        switch (menu){
         case  10:
         System.out.println("うどん");
         break;

         case 20:
         System.out.println("そば");
         break;

         case 30:
         System.out.println("パスタ"); 
         break;

         case 40:
         System.out.println("ご飯");  
         break;

         default:
            System.out.println("その他");         
        }
    }
}

class Main{
     public static void main(String[] args) {
        ConditionBranch cd= new ConditionBranch();
        String result = cd.outputScore(62);
        System.out.println(result);
        cd.outputMenu(10);
     }
}
