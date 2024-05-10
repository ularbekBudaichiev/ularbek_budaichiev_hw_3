public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.4, 3.5, 6.7, 4.9, -8.1, 4.5, 9.7, -7.2, 5.4, 7.4, -9.6, 4.7, -3.6, -8.5, 3.9};
        double average = 0.0;
        int quantity = 0;
        boolean negative = false;
        for (double index : numbers) {
            if (index < 0) {
                negative = true;
            }
            if (index > 0 && negative) {
                average += index;
                quantity += 1;
            }
        }


        if (!negative)
            System.out.println("Отрицательных чисел нет");
        else {
            System.out.println("Сумма чисел: " + average);
            System.out.println("Кол-во чисел: " + quantity);
            System.out.println("Cреднее число: " + average / quantity);
        }
    }
}


