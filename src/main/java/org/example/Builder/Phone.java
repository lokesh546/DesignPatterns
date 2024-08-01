package org.example.Builder;

public class Phone {

    private final int ram;

    private final double storage;

    private final String processor;

    private final String camera;


    private Phone(IPhoneBuilder builder) {
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.processor = builder.processor;
        this.camera = builder.camera;
    }

    private Phone(PhoneBuilder builder) {
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.processor = builder.processor;
        this.camera = builder.camera;
    }

    public int getRam() {
        return ram;
    }

    public double getStorage() {
        return storage;
    }

    public String getProcessor() {
        return processor;
    }

    public String getCamera() {
        return camera;
    }

    public static class PhoneBuilder {
        private int ram;

        private double storage;

        private String processor;

        private String camera;

        public PhoneBuilder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public PhoneBuilder storage(double storage) {
            this.storage = storage;
            return this;
        }

        public PhoneBuilder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public PhoneBuilder camera(String camera) {
            this.camera = camera;
            return this;
        }

        public Phone builder() {
            return new Phone(this);
        }

    }

    public static class IPhoneBuilder {
        private int ram;

        private double storage;

        private String processor;

        private String camera;

        public IPhoneBuilder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public IPhoneBuilder storage(double storage) {
            this.storage = storage;
            return this;
        }

        public IPhoneBuilder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public IPhoneBuilder camera(String camera) {
            this.camera = camera;
            return this;
        }

        public Phone builder() {
            return new Phone(this);
        }

    }
}
