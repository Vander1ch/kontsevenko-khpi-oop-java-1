package ua.khpi.oop1.lab02;

public class CalibrationTask {
    public static void main(String[] args) {
        System.out.println("=== АЛГОРИТМІЧНА ЗАДАЧА 2 (Калібрування) ===");
        
        short[] codes = {-500, -1, 0, 1, 800};
        double k = 1.002;
        double b = -0.15;

        for (short r : codes) {
            // Формула: T = k * r / 10.0 + b
            double temperature = (k * r) / 10.0 + b;

            // Обернена формула та явне звуження до short
            long rawRestoredLong = Math.round((temperature - b) * 10.0 / k);
            short rPrime = (short) rawRestoredLong; 

            int diff = rPrime - r;

            System.out.printf("Код (r): %d | Температура: %.4f °C | Відновлений код (r'): %d | Різниця: %d%n",
                    r, temperature, rPrime, diff);
        }
    }
}