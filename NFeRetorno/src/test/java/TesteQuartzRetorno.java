import br.com.bv.nfe.agendador.Agendador;

public class TesteQuartzRetorno {

	public static void main(String[] args) {
		try {
			Agendador.inicia();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
