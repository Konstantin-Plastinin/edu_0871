/* Программа запрашивает у пользователя значение в градусах Цельсия. Программа должена переводить температуру и выводить на экран
значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Пример:
на вход подается значение 41.
Пример вывода:
105.8 */

public class Main {
    public static void main(String[] args) {
       // Ваш код
       System.out.println(convertCelsiumToFahrenheit(41));
       }
    public static double convertCelsiumToFahrenheit(int TC) {
    double TF = 9 / 5.0 * TC + 32;
    return TF;
    }
}
