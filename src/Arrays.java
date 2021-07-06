public class Arrays {

    public static void main (String[] args){
       int[] intArray = getIntArray();
    }

    public static int[] getIntArray(){
        return new int[]  {1, 2, 3};
    }

    public static int[] getIntArray(int length){
        int[] intArray = new int[length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }
      return intArray;
    }
}
