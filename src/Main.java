import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);


        String[] candidatos={"Lucas", "Carol", "Lucia", "João"," Victória", "julia", "Mariana", "Ana Luiza", "Julio", "Carlos"};
       int[] salariosPretendidos=new int[candidatos.length];

        for (int i=0; i<candidatos.length;i++){
            System.out.println("Qual o salario pretendido pelo candidato "+candidatos[i]+":");
            int salarioPretendido=scan.nextInt();
            AnalisarCandidatos.analisarCandidatos(salarioPretendido);
            salariosPretendidos[i]=salarioPretendido;

        }
        System.out.println("Acabaram os candidatos para essa vaga");
        SelecaoDeCandidatoa.selecaoDeCandidatos(candidatos, salariosPretendidos);

        OrdenacaoDeCandidatos.ordenacaoDeCandidatos(candidatos,salariosPretendidos);
        System.out.println("Candidatos escolhidos:");
        for (int i = 0; i < 5; i++) { // Imprimir os 5 primeiros candidatos (os escolhidos)
            System.out.println("Nome: " + candidatos[i] + ", Salário pretendido: " + salariosPretendidos[i]);
        }


    }


    //public  static int valorPretendido(){
      //  return ThreadLocalRandom.current().nextInt(1800,2000);
    //}

}
