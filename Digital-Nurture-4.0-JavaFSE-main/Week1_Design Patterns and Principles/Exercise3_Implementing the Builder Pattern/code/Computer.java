public class Computer {
    // Required attributes
    private String CPU;
    private String RAM;

    // Optional attributes
    private String storage;
    private String graphicsCard;
    private String operatingSystem;

    // Private constructor accepting Builder object
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
               "CPU='" + CPU + '\'' +
               ", RAM='" + RAM + '\'' +
               ", Storage='" + storage + '\'' +
               ", GraphicsCard='" + graphicsCard + '\'' +
               ", OperatingSystem='" + operatingSystem + '\'' +
               '}';
    }

    // Static nested Builder class
    public static class Builder {
        // Required attributes
        private String CPU;
        private String RAM;

        // Optional attributes
        private String storage;
        private String graphicsCard;
        private String operatingSystem;

        // Builder constructor for required fields
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        // build() method to create Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}
