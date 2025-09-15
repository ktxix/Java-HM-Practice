public class Task6 {

        static class Animals {
            void makeSound() {
                System.out.println("Animal make sound");
            }
        }

        static class Dog extends Animals {
            void makeSound() {
                System.out.println("Dogs says: Ruuf-ruf!");
            }
        }

        static class Citten extends Animals {
            void makeSound() {
                System.out.println("Cittens says: Miiieow-miiieow!");
            }
        }

        static class Cow extends Animals {
            void makeSound() {
                System.out.println("Cows says: Moo-mo!");
            }
        }

        public static void main(String[] args) {
            Dog dog = new Dog();
            Citten cat = new Citten();
            Cow cow = new Cow();

            dog.makeSound();
            cat.makeSound();
            cow.makeSound();
        }
    }


