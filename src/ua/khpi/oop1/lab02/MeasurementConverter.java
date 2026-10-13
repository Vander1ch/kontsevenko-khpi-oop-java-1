package ua.khpi.oop1.lab02;

public class MeasurementConverter {
    public static void main(String[] args) {
        System.out.println("=== ЛАБОРАТОРНА РОБОТА № 2 (Варіант 12) ===");
        
        // Чотири набори даних за вимогами лаби (Типовий, Мінімальний, Максимальний, Ризиковий)
        runTestCase("Типовий набір", 1024 * 1024 * 50L, 100_000_000.0); // 50 МБ, 100 Мбіт/с
        runTestCase("Мінімальний набір", 1L, 1000.0);                    // 1 байт, 1 кбіт/с
        runTestCase("Максимальний набір", 10_000_000_000_000L, 1_000_000_000.0); // 10 ТБ, 1 Гбіт/с
        runTestCase("Ризиковий набір", Long.MAX_VALUE, 1.0);             // Макс. байти, мінімальна швидкість
    }

    public static void formatAndPrintResults(String dataSetName, long bytesSize, double bitsPerSecond, long totalBits, double timeSeconds) {
        System.out.println("\n--- " + dataSetName + " ---");
        System.out.printf("Вхідний розмір: %d байт%n", bytesSize);
        System.out.printf("Швидкість мережі: %.1f біт/с%n", bitsPerSecond);
        System.out.printf("Загальний обсяг (проміжний у бітах): %d біт%n", totalBits);
        System.out.printf("Час передавання: %.4f секунд%n", timeSeconds);
        
        double timeMinutes = timeSeconds / 60.0;
        System.out.printf("Час передавання (у хвилинах): %.2f хв%n", timeMinutes);
    }

    public static void runTestCase(String name, long bytesSize, double bitsPerSecond) {
        // Множимо на 8L, щоб задіяти тип long і не допустити переповнення
        long totalBits = bytesSize * 8L;
        
        // Дійсне ділення (множимо на 1.0, щоб отримати double)
        double timeSeconds = (totalBits * 1.0) / bitsPerSecond;
        
        formatAndPrintResults(name, bytesSize, bitsPerSecond, totalBits, timeSeconds);
    }
}