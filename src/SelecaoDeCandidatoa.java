public class SelecaoDeCandidatoa {
    public static void  selecaoDeCandidatos(String[]candidatos, int [] salariosPretendidos){
        int salarioBase=2000;
        int candidatoSelecionado=0;
        int candidatoAtual=0;
        while (candidatoSelecionado<5 && candidatoAtual < candidatos.length){
            String candidato=candidatos[candidatoAtual];
            int salarioPretendido=salariosPretendidos[candidatoAtual];
            System.out.println("O candidato "+candidato+" solicitou o valor de "+salarioPretendido);
            if (salarioBase>=salarioPretendido){
                candidatoSelecionado++;
            }
            candidatoAtual++;
        }
    }
}
