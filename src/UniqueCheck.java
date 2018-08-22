public class UniqueCheck {

    boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker = checker | (1 << val);
            System.out.println(checker);
        }
        return true;
    }

    private static int sumDigits(int n) {
        int sum = 0;
        int i = 1;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
            System.out.println(i++);
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean isUnique = new UniqueCheck().isUniqueChars("testchar");
        System.out.println(isUnique);

        String str = "This is test";
        String sub = str.replace(" ","%20");
        System.out.println(sub);

        int[] letters = new int[128];
        Integer[] let = new Integer[128];
        letters[0]++;

        for(int i : letters){
            System.out.println(i);
        }

        int[][] arr = {{3,3,4,5},{2,3},{1,2,3}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);

        System.out.println(sumDigits(9999));

        StringBuilder test = new StringBuilder("a");
        int firstAddressOfTest = System.identityHashCode(test);
        test.append("b");
        int secondAddressOfTest = System.identityHashCode(test);

        System.out.println(firstAddressOfTest +"-----" + secondAddressOfTest);
    }
}
