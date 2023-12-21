class FizzBuzz {
    
    
    public String check(int i) {
        if (i >= 1 && i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                return "FizzBuzz";
            }
            if (i % 3 == 0) {
                return "Fizz";
            } else {
                if (i % 5 == 0) {
                    return "Buzz";
                }
                return String.valueOf(i);
            }
        } else {
            return String.valueOf(i)+" est non compris entre 1 et 100";
        }
        
    }
}
