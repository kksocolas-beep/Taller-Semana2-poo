public class Main {

    static class Estudiante {
        String nombre;
        int edad;
        String carrera;

        public Estudiante(String nombre, int edad, String carrera) {
            this.nombre = nombre;
            this.edad = edad;
            this.carrera = carrera;
        }

        public void presentarse() {
            System.out.println("Hola, mi nombre es " + nombre +
                    ", tengo " + edad +
                    " años y estudio " + carrera + ".");
        }

        public void estudiar() {
            System.out.println(nombre + " está estudiando para mejorar sus conocimientos.");
        }
    }

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(
                "Kerly",
                35,
                "Ciencias Experimentales de la Matemática y la Física"
        );

        Estudiante estudiante2 = new Estudiante(
                "Carlos",
                22,
                "Física"
        );

        estudiante1.presentarse();
        estudiante1.estudiar();

        System.out.println("------------------------");

        estudiante2.presentarse();
        estudiante2.estudiar();
    }
}