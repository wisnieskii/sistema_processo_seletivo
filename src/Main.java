import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int salarioBase=2000;

        String[] candidatos={"Lucas", "Carol", "Lucia", "João"," Victória"};

        for (int i=0; i<candidatos.length;i++){
            System.out.println("Qual o salario pretendido pelo candidato "+candidatos[i]+":");
            int salarioPretendido=scan.nextInt();
            if (salarioPretendido<salarioBase){
                System.out.println("Ligar para o candidato!!");
            } else if (salarioPretendido== salarioBase) {
                System.out.println("Fazer uma contraproposta!!");
            }else {
                System.out.println("Aguardar a resposta dos demais candidatos!!");
            }

        }
        System.out.println("Acabaram os candidatos para essa vaga");


    }
}