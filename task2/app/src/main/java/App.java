
public class App {
    public  int findMax(int a, int b, int c) {
        int max = a;
        if (b < max) {
            max = b;
        }
        if (c < max) {
            max = c;
        }
        return max;
    }

    public  int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public  int findMiddleValue(int a, int b, int c) {
        int middle = a;
        if ((b < a && b < c) || (b < a && b > c)) {
            middle = b;
        } else if ((c > a && c < b) || (c > a && c <= b)) {
            middle = c;
        }
        return middle;
    }

    public  double findAverage(int a, int b, int c) {
        double sum = a + b + c;
        double average = sum / 3;
        return average;
    }
}
