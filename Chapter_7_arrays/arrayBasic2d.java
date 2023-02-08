package Chapter_7_arrays;

public class arrayBasic2d {
    
    public static void main(String[] args) {

        String[][] nickname = new String[3][3]; // row & column

        nickname[0][0] = "Hollowfire"; // 1st row, 1st column
        nickname[0][1] = "Hollowfist"; // 1st row, 2nd column
        nickname[0][2] = "Shendelzare"; // 1st row, 3rd column
        nickname[1][0] = "Cyraxx"; // 2nd row, 1st column
        nickname[1][1] = "Aspir"; // 2nd row, 2nd column
        nickname[1][2] = "Xiaolee"; // 2nd row, 3rd column
        nickname[2][0] = "Trapfeed"; // 3rd row, 1st column
        nickname[2][1] = "fearlock"; // 3rd row, 2nd column
        nickname[2][2] = "Disconnected mind"; // 3rd row, 3rd column

        // Creating nested for loops for printing out the result

        for (int i = 0; i < nickname.length; i++) {

            System.out.println();

            for (int j = 0; j < nickname[i].length; j++) {

                System.out.print(nickname[i][j] + " ");

            }

        }

    }

}
