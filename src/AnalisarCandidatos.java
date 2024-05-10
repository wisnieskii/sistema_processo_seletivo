public class AnalisarCandidatos {
    public static void analisarCandidatos(int salarioPretendido){
        int salarioBase=2000;
        if (salarioPretendido<salarioBase){
            System.out.println("Ligar para o candidato!!");
        } else if (salarioPretendido== salarioBase) {
            System.out.println("Fazer uma contraproposta!!");
        }else {
            System.out.println("Aguardar a resposta dos demais candidatos!!");
        }
    }
}
