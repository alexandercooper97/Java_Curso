public class CalculadoraIMC {
    // Función que calcula el IMC
    public double calcularIMC(double pesoKg, double alturaMetros) {
        double imc = pesoKg / Math.pow(alturaMetros, 2);
        return imc;
    }

    // Función que clasifica el IMC
    public String clasificarIMC(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 24.9 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    public static void main(String[] args) { 
        CalculadoraIMC calculadora = new CalculadoraIMC(); 
        double imc = calculadora.calcularIMC(75, 1.80); 
        String clasificacion = calculadora.clasificarIMC(imc); 
    
        System.out.println("IMC: " + imc); 
        System.out.println("Clasificación: " + clasificacion); 
      } 
}

