import  java.lang.Math;

public class Main
{
	public static void main(String[] args) {
        // Задание №4
        // вычисления серии чисел Фурье (ДПФ?)
        int N;      // количество значений сигнала, измеренных за период, а также количество компонент разложения
        int k;      // индекс частоты
        double x;   // x(i)  измеренные значения сигнала
        double res; // X(k) = N комплексных амплитуд синусоидальных сигналов, слагающих исходный сигнал
        
        N = 5;
        k = 10;
        res = 0;
        for (int i = 0; i < N; i++) {
            x = (Math.random() * 100);
            res += x * Math.exp( (-2 * Math.PI / N) * k * i);
        }
        
        
        System.out.println("Ответ: " + String.format("%.4f", res));
	}
}
