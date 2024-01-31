public class EnumColores {
    enum Color{
        ROJO, VERDE, AZUL, AMARILLO
    }
    
    public static void main(String[] args){
        
        
        Color colorSeleccionado = Color.VERDE;
        
        switch (colorSeleccionado) {
            case ROJO:
                System.out.println("El color es rojo");
                break;
            case VERDE:
                System.out.println("El color es verde");
                break;
            case AZUL:
                System.out.println("El color es azul");
                break;
            case AMARILLO:
                System.out.println("El color es amarillo");
                break;
            default:
                System.out.println("Color desconocido");
        }
    }
}
