
import org.example.EroeNonIdoneo;
import org.example.Reclutatore;

void main(){
    int missione = 75;

    Reclutatore reclutatore = new Reclutatore();

    for(int i = 0; i <=5; i++){
        System.out.println("\n Tentativo numero: " + i);
        try{
            reclutatore.DifficoltaMissione(missione);
        }catch (EroeNonIdoneo e){
            System.out.println("Eroe scartato: " + e.getNomeEroe());
            System.out.println("Potere eroe: " + e.getLivello() + " (Richiesto: " + missione + ")");
            System.out.println("Mancano " + (missione - e.getLivello()) + " punti potere per partecipare.");
        }
    }
}
