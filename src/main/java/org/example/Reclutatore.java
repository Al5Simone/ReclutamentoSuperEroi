package org.example;
import net.datafaker.Faker;
public class Reclutatore {

    public void DifficoltaMissione(int missione) throws EroeNonIdoneo{
        Faker faker = new Faker();
        String nomeEroe = faker.superhero().name();
        int potere = faker.number().numberBetween(0,100);
        if( potere < missione){
            throw new EroeNonIdoneo(potere, nomeEroe);
        } else
        {
            System.out.println("Accettato per la missione");
        }
    }
}
