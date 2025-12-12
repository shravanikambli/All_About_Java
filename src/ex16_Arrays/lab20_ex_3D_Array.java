package ex16_Arrays;

public class lab20_ex_3D_Array {
    public static void main(String[] args) {
        int[][][] arr_3d = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 12, 12}
                }
        };

        System.out.println("Element at arr[1][0][2]: " + arr_3d[1][0][2]); // Output: 9
    }
}