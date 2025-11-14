public class Rectangle {
        double length;
        double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width  = width;
        }

        public double calculateArea() {
            return length * width;
        }
    }

}


    public static void main(String[] args) {

        // Create Rectangle objects
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(10.5, 4.2);

        // Display their areas
        System.out.println("Area of Rectangle 1: " + r1.calculateArea());
        System.out.println("Area of Rectangle 2: " + r2.calculateArea());
    }
}

}

