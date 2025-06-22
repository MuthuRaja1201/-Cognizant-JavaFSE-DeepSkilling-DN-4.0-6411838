public class BuilderPatternTest {
    public static void main(String[] args) {
        // Basic configuration
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();

        System.out.println("Basic Computer: ");
        System.out.println(basicComputer);

        System.out.println();

        // High-end configuration
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4070")
                .setOperatingSystem("Windows 11 Pro")
                .build();

        System.out.println("Gaming Computer: ");
        System.out.println(gamingComputer);
    }
}
