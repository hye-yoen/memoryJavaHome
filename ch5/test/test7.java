package ch5.test;

public class test7 {
    public static void main(String[] args) {
        int max=0;
        int[] array = {1,5,3,9,2};

        for(int i=0; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
