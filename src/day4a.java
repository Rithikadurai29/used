void main(){
        //int[] marks = new int[5][3];
        int[][] studentmarks = {
                {78,90,34},
                {89,65,89},
                {12,34,56},
                {66,12,89},
                {33,77,88}
        };

        for(int row = 0; row < studentmarks.length; row++){
            int total=0;
            for(int col = 0; col < studentmarks.length; col++){
                total+=studentmarks[row][col];
            }
            double avg=total/3.0;
            System.out.println("Student"+ ( row+1));
            System.out.println("Total"+total);
            System.out.println("Average"+avg);
        }
        System.out.println();
    }
}