public class Task7 {

        static class Circle {
            double r;

            Circle(double r) {
                this.r = r;
            }

            double area() {
                return 3.14 * r * r;
            }
        }

        static class Rectangle {
            double w;
            double h;

            Rectangle(double w, double h) {
                this.w = w;
                this.h = h;
            }

            double area() {
                return w * h;
            }
        }

        static class Square {
            double s;

            Square(double s) {
                this.s = s;
            }

            double area() {
                return s * s;
            }
        }

        public static void main(String[] args) {
            Circle c = new Circle(5);
            Rectangle r = new Rectangle(4, 6);
            Square s = new Square(3);

            System.out.println("Круг площадь = " + c.area());
            System.out.println("Прямоугольник площадь = " + r.area());
            System.out.println("Квадрат площадь = " + s.area());
        }
    }


