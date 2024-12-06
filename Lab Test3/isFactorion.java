
    public boolean isFactorion(int num) {
        int original = num;
        int sumOfFactorials = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfFactorials += calculateFactorial(digit);
            num /= 10;
        }

        return sumOfFactorials == original;
    }
}
