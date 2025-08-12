package ch5.example;

public class muriarray {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

        for(int i =0; i< mathScores.length;i++){
            for(int k=0;i<mathScores[i].length;k++){
                System.out.println("mathScores["+ i+ "]" + "[" + k + "]" + mathScores[i][k]);
            }
        }
        System.out.println();
        mathScores[0][0] = 80;
        mathScores[0][1] = 80;
        mathScores[0][2] = 80;
        mathScores[1][0] = 80;
        mathScores[1][1] = 80;
        mathScores[1][2] = 80;

        int totalStudent =0;
        int totalMathsum =0;
        for(int i =0;i<mathScores.length; i++){
            totalStudent += mathScores[i].length;
            for (int k =0; k < mathScores[i].length;k++){
                totalMathsum += mathScores[i][k];
            }
        }
        double totalMathAvg = (double) totalMathsum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수" + totalMathAvg);
        System.out.println();
        
        
    }
}
