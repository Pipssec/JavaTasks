public class Tasks {
    public static void main(String[] args) {
        task5();
    }

    static void task1() {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[i + 1]) {
                System.out.println("Не является");
                break;
            } else counter++;
        }
        if (counter == a.length) {
            System.out.println("Является");
        }
    }

    static void task2() {
        Random random = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(15);
            System.out.print(a[i] + " ");
        }
        int max = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (max <= a[i]) {
                max = a[i];
                index = i;
            }
        }
        System.out.println("Max: " + max + " Index: " + index);
    }

    static void task3() {
        Random random = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(15);
            System.out.print(a[i] + " ");
        }
        int max = a[0];
        int lastmax = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                lastmax = max;
                max = a[i];
            } else if (max > a[i]) {
                if (a[i] > lastmax) {
                    lastmax = a[i];
                }
            }
        }
        System.out.println("");
        System.out.println("2й по велечине: " + lastmax);
    }

    static void task4() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = random.nextInt(50);
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        int sum1 = 0;
        for (int i = 0; i < a.length; i++){
            int j = i;
            if ((a[i][j] % 2) == 0){
                sum1 += a[i][j];
            }
        }
        System.out.println("Cумма четных элементов: " + sum1);
        System.out.print("Нечетные элементы под главной диагональю: ");
        for (int i = a.length - 1; i>=0; i--){
            for (int j = i; j >= 0; j--){
                if ((a[i][j] % 2) != 0){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }

    static void task5() {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = 0;
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        int game = 0;
        int counter = 0;
        while (game == 0 & counter != 8){
            System.out.println("Игрок 1 введите поле:");
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            a[i][j] = 1;
            counter++;
            drawing(a);
            if ((a[0][0]+a[0][1]+a[0][2] == 3) || (a[1][0]+a[1][1]+a[1][2] == 3) || (a[2][0]+a[2][1]+a[2][2] == 3) ||
                    (a[0][0]+a[1][0]+a[2][0] == 3) || (a[0][1]+a[1][1]+a[2][1] == 3) || (a[0][2]+a[1][2]+a[2][2] == 3) ||
                    (a[0][0]+a[1][1]+a[2][2] == 3) || (a[0][2]+a[1][1]+a[2][0] == 3)){
                game = 1;
                break;
            }
            System.out.println("Игрок 2 введите поле:");
            int k = scanner.nextInt();
            int h = scanner.nextInt();
            a[k][h] = 22;
            drawing(a);
            if ((a[0][0]+a[0][1]+a[0][2] == 66) || (a[1][0]+a[1][1]+a[1][2] == 66) || (a[2][0]+a[2][1]+a[2][2] == 66) ||
                    (a[0][0]+a[1][0]+a[2][0] == 66) || (a[0][1]+a[1][1]+a[2][1] == 66) || (a[0][2]+a[1][2]+a[2][2] == 66) ||
                    (a[0][0]+a[1][1]+a[2][2] == 66) || (a[0][2]+a[1][1]+a[2][0] == 66)){
                game = 2;
                break;
            }
            counter++;
        }
        if (game == 1){
            System.out.println("Победил 1");
        }
        else if (game == 2){
            System.out.println("Победил 2");
        }
        else System.out.println("Ничья");

    }

    static void drawing(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
