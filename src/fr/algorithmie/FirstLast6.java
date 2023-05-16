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
            boolean result = eval(array);
            System.exit(0);
        } else {
            System.exit(1);
        }
    }
    private static boolean eval(int[] array){

        return false;
    }
}
