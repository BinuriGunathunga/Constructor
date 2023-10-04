public class Student {
        int id = 125;
        String name = "Binuri Guanthunga";

        Student() {
        }

        void display() {
            System.out.println(this.id + " " + this.name);
        }

        public static void main(String[] args) {
            Student s1 = new Student();
            s1.display();
        }
    }

