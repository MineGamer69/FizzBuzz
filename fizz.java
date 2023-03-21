public class fizz {
    public static void main(String[] args){
        boolean x = true;
        int p = 0;
        while (x){
            if (p < 100){
                p++;
                if(p % 3 == 0 && p % 5 == 0){
                    System.out.println("FizzBuzz");
                } else if(p % 5 == 0){
                    System.out.println("Buzz");
                } else if (p % 3 == 0){
                    System.out.println("Fizz");
                } else {
                    System.out.println(p);
                }
            
        }
        else{
            x = false;
        }
        
    }  
}
}


