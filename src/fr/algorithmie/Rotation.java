package fr.algorithmie;

public class Rotation {
    /**
     * When the array arguments are all numerical the class-command returns
     * the right-rotated version.
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
            int[] newArray = rightRotated(array);
            System.out.printf("\u001b[33mRight-rotated array :\u001b[0m\n");
            for (int nbr: newArray) {
                System.out.printf("%+3d ", nbr);
            }
            System.out.printf("\n");
            System.exit(0);
        } else {
            System.exit(1);
        }
    }
    /**
     * Right-rotator. One element to right.
     *
     * @param array Relative integers array
     * @return Right-rotated array.
     */
    private static int[] rightRotated(int[] array){
        int[] newArray = new int[array.length];
        newArray[0] = array[array.length - 1];
        for(int i = 0; i < array.length-1; i++){
            newArray[i+1] = array[i];
        }
        return newArray;
    }
}
