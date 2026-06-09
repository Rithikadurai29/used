/*void main() {
    //int[] marks = new int[5];
    int[][] marks = new int[5][5];
    int[][] studentMarks = {
            {78, 90, 34}, -
            {89, 65, 89},
            {12, 34, 56},
            {66, 12, 89},
            {33, 77, 88},
    };
    for (int row = 0; row < studentMarks.length; row++) {
        for (int col = 0; col < studentMarks[row].length; col++) {
            System.out.print(studentMarks[row][col] + " ");
        }
    System.out.println();
 }
}*/
    void main() {
        int[][] attendence = {
                {0, 1, 0},
                {1, 0, 0},
                {1, 1, 1},
                {0, 0, 0},
                {0, 0, 0}

        };
        for (int row = 0; row < attendence.length; row++) {
            System.out.println("Student" + (row + 1) + ":");
            for (int col = 0; col < attendence[row].length; col++) {
                if (attendence[row][col] == 1) {
                    System.out.println("class" + (col + 1) + ": present");
                } else {
                    System.out.println("class" + (col + 1) + ":Absent");

                }
            }
            System.out.println();
        }
    }

