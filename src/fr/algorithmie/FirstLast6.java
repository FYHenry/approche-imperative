package fr.algorithmie;

public class FirstLast6 {
    /**
     * When the array arguments are all numerical the class-command returns
     * "true" if the first or the last elements is 6.
     * If not "false" is returned.
     *
     * @param args Numerical arguments from the terminal.
     */
    public static void main(String[] args) {
        boolean isIntArray = true;
        for (String arg: args) {
            isIntArray = isIntArray && arg.matches("[0-9]+");
        }
        if(isIntArray){
            int[] array = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                array[i] = Integer.decode(args[i]);
            }
            boolean itIsTrue = firstOrLastIs6(array);
            if(itIsTrue){
                System.out.print("true\n");
            } else {
                System.out.print("false\n");
            }
            System.exit(0);
        } else {
            System.exit(1);
        }
    }

    /**
     * Evaluates "true" when the first or the last elements are 6 from
     * a non-null array.
     * Else it returns "false".
     *
     * @param array Relative integers array
     * @return Boolean result
     */
    private static boolean firstOrLastIs6(int[] array){
        if(array.length > 0){
            return array[0] == 6 || array[array.length - 1] == 6;
        }
        return false;
    }
}
