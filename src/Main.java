import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Task number: ");
        int s = in.nextInt();
        if(s == 1) { // TASK №1
            System.out.printf("remainder(1, 3) -> %d\n", remainder(1, 3));
            System.out.printf("remainder(3, 4) -> %d\n", remainder(3, 4));
            System.out.printf("remainder(-9, 45) -> %d\n", remainder(-9, 45));
            System.out.printf("remainder(5, 5) -> %d\n", remainder(5, 5));
            System.out.print("Print your test: "); // дополнительный тест
            int n = in.nextInt(); int k = in.nextInt();
            System.out.printf("remainder(%d, %d) -> %d\n", n, k, remainder(n, k));
        }else if (s==2){ // TASK №2
            System.out.printf("triArea(3, 2) -> %d\n", (int)triArea(3, 2));
            System.out.printf("triArea(7, 4) -> %d\n", (int)triArea(7, 4));
            System.out.printf("triArea(10, 10) -> %d\n", (int)triArea(10, 10));
            System.out.print("Print your test: "); // дополнительный тест
            int n = in.nextInt(); int k = in.nextInt();
            if(n%2==0 || k%2==0){
                System.out.printf("triArea(%d, %d) -> %d\n", n, k, (int)triArea(n, k));
            }else{
                System.out.printf("triArea(%d, %d) -> %f\n", n, k, triArea(n, k));
            }
        }else if (s==3){ // TASK №3
            System.out.printf("animals(2, 3, 5) -> %d\n", animals(2, 3, 5));
            System.out.printf("animals(1, 2, 3) -> %d\n", animals(1, 2, 3));
            System.out.printf("animals(5, 2, 8) -> %d\n", animals(5, 2, 8));
            System.out.print("Print your test: "); // дополнительный тест
            int n = in.nextInt(); int k = in.nextInt(); int t = in.nextInt();
            System.out.printf("animals(%d, %d, %d) -> %d\n", n, k, t, animals(n, k, t));
        }else if(s==4){ // TASK №4
            System.out.printf("profitableGamble(0.2, 50, 9) -> %b\n", profitableGamble(0.2, 50, 9));
            System.out.printf("profitableGamble(0.9, 1, 2) -> %b\n", profitableGamble(0.9, 1, 2));
            System.out.printf("profitableGamble(0.9, 3, 2) -> %b\n", profitableGamble(0.9, 3, 2));
            System.out.print("Print your test: "); // дополнительный тест
            double n = in.nextDouble(); int k = in.nextInt(); int t = in.nextInt();
            System.out.printf("animals(%.2f, %d, %d) -> %b\n", n, k, t, profitableGamble(n, k, t));
        }else if(s==5){ // TASK №5
            System.out.printf("operation(24, 15, 9) -> \"%s\"\n", operation(24, 15, 9));
            System.out.printf("operation(24, 26, 2) -> \"%s\"\n", operation(24, 26, 2));
            System.out.printf("operation(15, 11, 11) -> \"%s\"\n", operation(15, 11, 11));
            System.out.print("Print your test: "); // дополнительный тест
            int n = in.nextInt(); int k = in.nextInt(); int t = in.nextInt();
            System.out.printf("operation(%d, %d, %d) -> \"%s\"\n", n, k, t, operation(n, k, t));
        }else if(s==6){ // TASK №6
            System.out.printf("ctoa('A') -> %d\n", ctoa('A'));
            System.out.printf("ctoa('m') -> %d\n", ctoa('m'));
            System.out.printf("ctoa('[') -> %d\n", ctoa('['));
            System.out.printf("ctoa('\\') -> %d\n", ctoa('\\'));
            System.out.print("Print your test: ");
            char n = in.next().charAt(0); // дополнительный тест
            System.out.printf("ctoa('%s') -> %d\n", n, ctoa(n));
        }else if(s==7){ // TASK №7
            System.out.printf("addUpTo(3) -> %d\n", addUpTo(3));
            System.out.printf("addUpTo(10) -> %d\n", addUpTo(10));
            System.out.printf("addUpTo(7) -> %d\n", addUpTo(7));
            System.out.print("Print your test: "); // дополнительный тест
            int n = in.nextInt();
            System.out.printf("addUpTo(%d) -> %d\n", n, addUpTo(n));
        }else if(s==8){ // TASK №8
            System.out.printf("nextEdge(8, 10) -> %d\n", nextEdge(8, 10));
            System.out.printf("nextEdge(5, 7) -> %d\n", nextEdge(5, 7));
            System.out.printf("nextEdge(9, 2) -> %d\n", nextEdge(9, 2));
            System.out.print("Print your test: "); // дополнительный тест
            int n = in.nextInt(); int k = in.nextInt();
            System.out.printf("nextEdge(%d, %d) -> %d\n", n, k, nextEdge(n, k));
        }else if(s==9){ // TASK №9
            System.out.printf("sumOfCubes([1, 5, 9]) -> %d\n", sumOfCubes(new int[]{1, 5, 9}));
            System.out.printf("sumOfCubes([3, 4, 5]) -> %d\n", sumOfCubes(new int[]{3, 4, 5}));
            System.out.printf("sumOfCubes([2]) -> %d\n", sumOfCubes(new int[]{2}));
            System.out.printf("sumOfCubes([]) -> %d\n", sumOfCubes(new int[]{}));
            System.out.print("Print your test: "); // дополнительный тест
            String k = in.nextLine(); String n = in.nextLine();
            String[] g = n.split(" ");
            System.out.print("sumOfCubes([");
            int[] a = new int[g.length];
            int r;
            for(int i=0; i<g.length; i++){
                r=0;
                for(int j=g[i].length()-1; j>=0; j--){
                    r += (int) (g[i].charAt(j)-'0')*Math.pow(10, g[i].length()-j-1);
                }
                a[i]=r;
                if(i==g.length-1){System.out.printf("%d]) -> %d\n", r, sumOfCubes(a));}
                else{System.out.printf("%d, ", r);}
            }
        }else if(s==10){ // TASK №10
            System.out.printf("abcmath(42, 5, 10) -> %b\n", abcmath(42, 5, 10));
            System.out.printf("abcmath(5, 2, 1) -> %b\n", abcmath(5, 2, 1));
            System.out.printf("abcmath(1, 2, 3) -> %b\n", abcmath(1, 2, 3));
            System.out.print("Print your test: "); // дополнительный тест
            int n = in.nextInt(); int k = in.nextInt(); int t = in.nextInt();
            System.out.printf("abcmath(%d, %d, %d) -> %b\n", n, k, t, abcmath(n, k, t));
        }
    }
    // TASK №1
    private static int remainder(int n, int k){ // подсчёт остатка при делении n на k
        return n-((n/k)*k); // делим n на k целочисленно, затем умножаем на k и вычитаем из n
    }
    // TASK №2
    private static double triArea(int n, int k){ // рассчёт площади треугольника (n - основание, k - высота)
        return (n*k/2.0); // основание умножить на высоту, разделить на 2
    }
    // TASK №3
    private static int animals(int n, int k, int t){ // подсчёт количества ног n куриц, k коров и t свиней
        return (2*n+(k+t)*4); // 2 ноги * количество куриц(n) + 4 ноги * количество коров(k) и свиней(t)
    }
    // TASK №4
    private static boolean profitableGamble(double prob, double prize, double pay){ // является ли произведение prob и prize больше, чем pay
        return prob*prize>pay; // проверяем больше ли prob*pay, чем pay
    }
    // TASK №5
    private static String operation(int n, int k, int t){ // операция с числами k и t для получения n
        if((k+t) == n) { // если k и t в сумме дают n
            return "added";
        }else if((k-t) == n || (t-k) == n){ // если модуль разности k и t даёт n
            return "subtracted";
        }else if((k*t) == n){ // если произведение k и t даёт n
            return "multiplied";
        }else if(((k/t) == n && k%t==0) || ((t/k) == n && t%k==0)){ // если k делится на t и даёт n или t делится на k и даёт n
            return "divided";
        }else{ // если ни одно не выполнилось
            return "none";
        }
    }
    // TASK №6
    private static int ctoa(char s){ // возвращает ASCII значение символа
        return (int)s;
    }
    // TASK №7
    private static int addUpTo(int n){ // подсчёт суммы чисел от 1 до n
        return (1+n)*n/2; // сумма арифметической програссии
    }
    // TASK №8
    private static int nextEdge(int n, int k){ // третье ребро
        return n+k-1; // Сумма n и k должна быть больше, чем третье ребро
    }
    // TASK №9
    private static long sumOfCubes(int[] a){ // посчитать сумму кубов
        long res=0;
        for (int i : a) { // перебрать все числа массива и прибавить кубы чисел к результату
            res += (long) i * i * i;
        }
        return res;
    }
    // TASK №10
    private static boolean abcmath(int n, int k, int t){ // прибавить n к себе k раз и проверить, делится ли на t
        int res = n;
        for(int i=0; i<k;i++){
            res *= 2;
        }
        return res%t==0;
    }
}