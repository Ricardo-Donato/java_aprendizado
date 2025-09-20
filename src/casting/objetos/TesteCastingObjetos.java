package casting.objetos;

/**
 *
 * @author Pedro
 */
public class TesteCastingObjetos {

    public static void main(String[] args) {
        Funcionario f1;
        f1 = new Gerente();
        
        Gerente g0 = (Gerente) f1;
        g0.nome = "Pedro";
        
        Gerente g1 = new Gerente();
        g1.nome = "Donato";
        
        System.out.println(g0.nome + " " + g1.nome);
    }
}