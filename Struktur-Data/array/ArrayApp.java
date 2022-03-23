package study;

public class ArrayApp {
    public static void main(String[] args) {

        //Perulangan Array 1 Dimensi
        char[] huruf = {
             'G', 'A', 'L', 'E', 'H'
        };

        for(var i = 0; i < huruf.length; i++) {
            System.out.println(huruf[i]);
        }


        //Perulangan Array 2 Dimensi
        String[][] name = {
                {"Galeh", "Ariya", "Irwana"},
                {"Sidoarjo", "Jawa Timur", "Balongbendo"}
        };

        for(var i = 0; i < name.length; i++) {
            for(var j = 0; j < name[i].length; j++) {
                System.out.println(name[i][j]);
            }
        }



        //Perulangan Array 3 Dimensi
        int[][][] number = {
                {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10}
                },
                {
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20}
                }
        };

        for(var i = 0; i < number.length; i++) {
            for (var j = 0; j < number[i].length; j++) {
                for (var k = 0; k < number[i][j].length; k++) {
                    System.out.print(number[i][j][k] + ", ");
                }
            }
        }

    }
}
