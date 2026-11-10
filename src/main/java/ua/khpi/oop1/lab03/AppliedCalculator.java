package ua.khpi.oop1.lab03;

public class AppliedCalculator {
    public static void main(String[] args) {
        double radiusMeters = 2.0;
        double liquidHeightMeters = 3.5;
        double densityKgPerM3 = 1000.0;

        double radiusSquared = radiusMeters * radiusMeters;
        double baseAreaM2 = Math.PI * radiusSquared;
        double volumeM3 = baseAreaM2 * liquidHeightMeters;
        double massKg = volumeM3 * densityKgPerM3;
        
        double wettedSurfaceM2 = baseAreaM2 + (2.0 * Math.PI * radiusMeters * liquidHeightMeters);

        double restoredRadius = Math.sqrt(volumeM3 / (Math.PI * liquidHeightMeters));
        double radiusDifference = Math.abs(restoredRadius - radiusMeters);

        System.out.println("=== Розподіл обчислень для циліндричного резервуара ===");
        System.out.printf("Радіус основи: %.3f м%n", radiusMeters);
        System.out.printf("Висота рідини: %.3f м%n", liquidHeightMeters);
        System.out.printf("Густина рідини: %.3f кг/м^3%n", densityKgPerM3);
        System.out.println("--------------------------------------------------");
        System.out.printf("Площа основи: %.3f м^2%n", baseAreaM2);
        System.out.printf("Об'єм рідини: %.3f м^3%n", volumeM3);
        System.out.printf("Маса рідини: %.3f кг%n", massKg);
        System.out.printf("Смочена поверхня: %.3f м^2%n", wettedSurfaceM2);
        System.out.println("--------------------------------------------------");
        System.out.printf("Зворотна перевірка радіуса: %.3f м (похибка: %.5f)%n", restoredRadius, radiusDifference);
    }
}