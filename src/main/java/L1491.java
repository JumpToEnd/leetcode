import org.junit.Test;

import java.util.Arrays;

public class L1491 {

    @Test
    public void test(){
        System.out.println(average(new int[]{48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000}));
    }

    public double average(int[] salary) {

        Arrays.sort(salary);
        double sum = 0;
        for (int i = 1; i < salary.length-1; i++) {
            sum += salary[i];
        }

        return sum / (salary.length - 2);

/*        double sum = 0;
        double maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE;
        for (int num : salary) {
            sum += num;
            maxValue = Math.max(maxValue, num);
            minValue = Math.min(minValue, num);
        }
        return (sum - maxValue - minValue) / (salary.length - 2);*/

        /*double min = salary[0];
        double max = salary[0];

        double sum = 0;

        for (int i = 0; i < salary.length; i++) {
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);

            sum += salary[i];
        }

        return (sum - min - max) / (salary.length - 2);*/
    }
}
