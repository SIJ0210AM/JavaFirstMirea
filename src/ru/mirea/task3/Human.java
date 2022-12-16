package ru.mirea.task3;

public class Human {
    private String firstName;
    private String lastName;
    private int age;

    public static class Head {
        private Boolean hairLess;
        private double size;

        public void setHairLess(Boolean hairLess) {
            this.hairLess = hairLess;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public Boolean getHairLess() {
            return hairLess;
        }

        public double getSize() {
            return size;
        }
    }

    public static class Leg {
        private Boolean isMissing;

        public void setMissing(Boolean missing) {
            isMissing = missing;
        }

        public Boolean getMissing() {
            return isMissing;
        }
    }

    public static class Hand {
        private Boolean isMissing;

        public void setMissing(Boolean missing) {
            isMissing = missing;
        }

        public Boolean getMissing() {
            return isMissing;
        }
    }
}