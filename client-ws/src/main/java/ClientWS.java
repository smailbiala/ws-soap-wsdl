import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        //intermediare stub
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(7600));
        Compte cp = stub.getCompte(4);
        System.out.println("----------------------");
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCration());
        System.out.println(cp.getCode());
        System.out.println("-----------------------");
        List<Compte> compteList = stub.listesComptes();
        compteList.forEach(c->{
            System.out.println("----------------------");
            System.out.println(c.getSolde());
            System.out.println(c.getDateCration());
            System.out.println(c.getCode());
            System.out.println("-----------------------");
        });
    }
}
