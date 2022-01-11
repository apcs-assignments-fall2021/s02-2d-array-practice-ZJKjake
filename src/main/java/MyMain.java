import java.util.ArrayList;

public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int count=0;
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if (mat[i][j]%2!=0){
                    count+=1;
                }
            }
        }
        return count;
    }

    public static int countDigit(double[][] mat,double x) {
        int count=0;
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if (mat[i][j]==x){
                    count+=1;
                }
            }
        }
        return count;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int biggest=mat[0][0];
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if (mat[i][j]>=biggest){
                    biggest=mat[i][j];
                }
            }
        }
        return biggest;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        for (int i=0;i<mat.length;i++){
            int temp=mat[i][0];
            for (int j=0;j<mat[i].length-1;j++){

                mat[i][j]=mat[i][j+1];

            }
            mat[i][mat[i].length-1]=temp;
        }
        return mat;
    }

    // Creates a new array list of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int[][] mat=new int[arraySize][arraySize];
        for (int i=0;i<arraySize;i++){
            for (int j=0;j<arraySize;j++){
                mat[i][j]=i+j;
            }
        }
        return mat;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        int sum = 0;
        int count=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
                count+=1;
            }
        }
        return (double)sum/count;
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        ArrayList<Double> n=new ArrayList<Double>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                n.add(mat[i][j]);
            }
        }
        if (n.size()%2==0){
            return ((n.get(n.size()/2)+n.get(n.size()/2-1))/2);
        }
        else{
            return n.get(n.size()/2);
        }
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        double mode=mat[0][0];
        int lar=countDigit(mat,mode);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (countDigit(mat,mat[i][j])>lar){
                    lar=countDigit(mat,mat[i][j]);
                    mode=mat[i][j];
                }
            }
        }
        return mode;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
