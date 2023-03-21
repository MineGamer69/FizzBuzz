public class fizz {
    public static void main(String[] args){
        boolean x = true;
        int p = 0;
        while (x){
            if (p < 101){
                p++;
                if (p % 3 == 0){
                    if (p % 5 == 0){
                        System.out.println("FizzBuzz");
                    }
                    System.out.println("Fizz");
                }
                if (p % 5 == 0){
                    System.out.println("Buzz");
                }
                
            }
            else{
                x = false;

            }
        }
    }  
}

