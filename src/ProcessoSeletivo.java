import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		for(String candidato: candidatos) {
            EntrandoEmContato(candidato);
		}
	}
    static void EntrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do { atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
                else
                    System.out.println("Contato realizado com sucesso!");    
        } while (continuarTentando&&tentativasRealizadas<3);
        if(atendeu)
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
            else
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
}
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
}

