public class Main
{
	public static void main(String[] args) {
	   // Задание №2
	   // смена мест значений, хранящиеся в двух переменных, без использования третьей переменной.
        int a = 1;
        int b = 2;
        
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.print("b = " + b);
	}
}
