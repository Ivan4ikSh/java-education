/**
 * @author Ivan Shupayev
 */
enum Planet {
    MERCURY(3.303e+23),
    VENUS(4.869e+24),
    EARTH(5.976e+24),
    MARS(6.421e+23);

    private final double mass; // масса в килограммах

    // Конструктор
    Planet(double mass) {
        this.mass = mass;
    }

    // Метод для получения массы планеты
    public double getMass() {
        return mass;
    }

    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf("Масса %s: %.2e кг%n", planet, planet.getMass());
        }
    }
}
