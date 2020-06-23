public class LuhnVerifier implements ChecksumVerifier {

    @Override
    public boolean verify(String number) {
        int sum = 0;
        String[] numbers = number.split("");
        for (int i = 0; i < numbers.length - 1; i++) {
            if (i % 2 != 0) {
                sum = sum + Integer.parseInt(numbers[i]);
            } else {
                int result = Integer.parseInt(numbers[i]) * 2;
                if (result > 9) {
                    int sum2 = 0;
                    while (result > 0) {
                        sum2 = sum2 + result % 10;
                        result = result / 10;
                    }
                    sum = sum + sum2;
                }
                sum = sum + result;
            }
        }
            if (10 - sum % 10 == Integer.parseInt(numbers[15])) {
                return true;
            } else {
                return false;
            }
        }
}

