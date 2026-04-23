import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;

public class Main {

    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao("GGG3333", "900kg", "6");
        Moto moto = new Moto("HHH4444", "500kg", true);

        Pacote pacote = new Pacote("113344", 500.0, "Em transito");

        // Informações do caminhão
        System.out.println("\n CAMINHAO ");
        System.out.println("Placa: " + caminhao.getPlaca());
        System.out.println("Capacidade: " + caminhao.getCapacidade());
        System.out.println("Eixos: " + caminhao.getEixos());

        // Informações da moto
        System.out.println("\n MOTO ");
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Capacidade: " + moto.getCapacidade());
        System.out.println("Possui bau: " + moto.isBau());


        // Informações do pacote
        System.out.println("\n PACOTE ");
        System.out.println("Codigo: " + pacote.getCodigo());
        System.out.println("Peso: " + pacote.getPeso());
        System.out.println("Status: " + pacote.getStatus());
    }
}