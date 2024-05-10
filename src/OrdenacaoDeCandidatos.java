public class OrdenacaoDeCandidatos {
    public static void ordenacaoDeCandidatos(String[]candidatos, int [] salariosPretendidos){
        for (int i=0; i<salariosPretendidos.length-1;i++){
            for (int j=i+1; j<salariosPretendidos.length;j++){
                if (salariosPretendidos[i]>salariosPretendidos[j]){
                    int tempSalario = salariosPretendidos[i];
                    salariosPretendidos[i] = salariosPretendidos[j];
                    salariosPretendidos[j] = tempSalario;

                    String tempCandidato = candidatos[i];
                    candidatos[i] = candidatos[j];
                    candidatos[j] = tempCandidato;
                }
            }
        }
    }

}
