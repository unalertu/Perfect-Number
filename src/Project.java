public class Project {
    public static void main(String[] args) {
        helperMethod();
    }
    public static void helperMethod(){
        for(int i=0;i<10000;i++){
            int sumOfNumbers=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sumOfNumbers +=j;
                }
            }
            if (sumOfNumbers==i){
                System.out.println(i);
            }
        }
    }
}
