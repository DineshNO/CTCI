import java.util.ArrayList;
import java.util.List;

public class GeneratingCombinations {

    private void recursive_combinations(List<Object> combination,
                                        int ndx, Object[] elems) {
        if (ndx == elems.length) {

            // (reached end of list after selecting/not selecting)
            System.out.println(combination);

        } else {

            // (include element at ndx)
            combination.add(elems[ndx]);
            System.out.println("recursive_combinations("+combination+","+ (ndx + 1)+", elems)");
            recursive_combinations(combination, ndx + 1, elems);

            // (don't include element at ndx)
            combination.remove(elems[ndx]);
            System.out.println("recursive_combinations("+combination+","+ (ndx + 1)+", elems)");
            recursive_combinations(combination, ndx + 1, elems);

        }
    }

    public void recursive_combinations_start(Object[] elems) {
        List<Object> combination = new ArrayList<>();
        recursive_combinations(combination, 0, elems);
    }

    public void iterate_combinations(Object[] elems) {
        int n = elems.length;
        for (int num = 0; num < (1 << n); num++) {
            List<Object> combination = new ArrayList<>();
            for (int ndx = 0; ndx < n; ndx++) {
                // (is the bit "on" in this number?)
                if ((num & (1 << ndx)) != 0) {
                    // then it's included in the list
                    combination.add(elems[ndx]);
                }
            }
            // (show the current combination)
            System.out.println(combination);
        }
    }

        public static void main(String[] args) {
            String elems[] = { "A", "B","C"};

            System.out.println("Recursive combinations");
            new GeneratingCombinations().recursive_combinations_start(elems);
            System.out.println("Iterate combinations");
           // new GeneratingCombinations().iterate_combinations(elems);
        }

}
