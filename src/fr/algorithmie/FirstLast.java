package fr.algorithmie;

public class FirstLast {
    /**
     * When the array arguments are all numerical the class-command returns
     * "true" if the first element equals the last element.
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
            boolean itIsTrue = firstEqualsLast(array);
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
     * Evaluates "true" when the first element equals the last from
     * a non-null array.
     * Else it returns "false".
     *
     * @param array Relative integers array
     * @return Boolean result
     */
    private static boolean firstEqualsLast(int[] array){
        if(array.length > 0){
            return array[0] == array[array.length - 1];
        }
        return false;
    }
}
