public class main{
    public static void main(String[] args) {
        for(int counter = 1; counter < 11; counter++){
            System.out.println(counter);
        }
        for(int i=10; i>0; i--){
            System.out.println(i);
        }

        int i=0;
        while(i<11){
            System.out.println(i);
             i = i+1;
        }

        do{
            System.out.println(i);
            i=i+1;
        }while(i<111);
        int sum = 0;
        for(int i = 1; i<=4; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}