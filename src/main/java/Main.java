public class Main {
    static class Number {
        int min;
        int max;
    }
    static Number printnumber(int[] array, int cnt) {
        Number digit = new Number();
        if(cnt == 1) {
            digit.max = array[0];
            digit.min = array[0];
            return digit;
        }
        if(array[0] > array[1]){
            digit.max = array[0];
            digit.min = array[1];
        }
        else{
            digit.max = array[1];
            digit.min = array[0];
        }
        for(int i = 2; i < cnt; ++i){
            if(array[i] > digit.max) {
                digit.max = array[i];
            }
            else if(array[i] < digit.min){
                digit.min = array[i];
            }
        }
        return digit;
    }

    public static void main(String[] args){
        int[] array = {1000, 11, 44555, 1, 330, 3000};
        int cnt = 6;
        Number digit = printnumber(array, cnt);
        System.out.printf("\nMinimum Number is %d", digit.min);
        System.out.printf("\nMaximum Number is %d", digit.max);
    }
}
