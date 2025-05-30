public class persona {

    private String nombre;
    private double peso;
    private double altura;
    private double imc;

    public persona(String nombre, double peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        imc = peso / (altura * altura);
        System.out.println("Imc: " + imc);
        return imc;
    }

    public String devolverIMC() {
        if (imc <= 18.5 && imc >= 24.9) {
            return "Buen peso";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30.0) {
            return "Obeso";
        }else{
            return "Bajo peso come bien";
        }
    }
}
