package Area_Quadrilateros;
public class area_quadrilateros {
      
    static int area;

    public static  void areaQuadrilateros(int lado){
        area = lado * lado;
        System.out.println("A area do Quadrado é: " + area);
    }

    public static void  areaQuadrilateros(int base, int altura){
        area = base * altura;
        System.out.println("A area do Retangulo é: " + area);
    }

    public static void areaQuadrilateros(int baseMenor, int baseMaior, int altura){
        area = ((baseMenor+baseMaior)/2) * altura;
        System.out.println("A area do Trapézio é: " + area);
    }

    
}

