package garage;



import com.garage.moteur.*;
import com.garage.option.*;
import com.garage.voiture.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage garageDeGaia = new Garage();
		 //On affiche le garage
        System.out.println(garageDeGaia);
		
		//on instancie des nouvelles voitures
		Vehicule regera1 = new Regera();
		regera1.setMoteur(new MoteurEssence("1500 Chevaux", 100000d));
        regera1.addOption(new GPS());
        regera1.addOption(new SiegeChauffant());
        regera1.addOption(new VitresElectriques());
        
        Vehicule barracuda1 = new Barracuda();
        barracuda1.setMoteur(new MoteurEssence("235 Chevaux", 10000d));
        barracuda1.addOption(new VitresElectriques());
        barracuda1.addOption(new Climatisation());
        
        Vehicule camaro1 = new Camaro();
        camaro1.setMoteur(new MoteurDiesel("500 Chevaux", 30000d));
        camaro1.addOption(new RadarDeRecul());
        camaro1.addOption(new GPS());
        camaro1.addOption(new Climatisation());
        camaro1.addOption(new VitresElectriques());
        
        Vehicule charger1 = new Charger();
        charger1.setMoteur(new MoteurEssence("200 Chevaux", 15000d));
        charger1.addOption(new SiegeChauffant());
        
        Vehicule firebird1 = new Firebird();
        firebird1.setMoteur(new MoteurEssence("175 Chevaux", 8000d));
        firebird1.addOption(new SiegeChauffant());
        
        Vehicule gt1 = new Gt();
        gt1.setMoteur(new MoteurEssence("550 Chevaux", 20000d));
        gt1.addOption(new VitresElectriques());
        gt1.addOption(new GPS());
        gt1.addOption(new RadarDeRecul());
        
        Vehicule mustangBoss1 = new MustangBoss();
        mustangBoss1.setMoteur(new MoteurHybride("300 Chevaux", 30000d));
        mustangBoss1.addOption(new Climatisation());
        

        //On les ajoute au garage 
        garageDeGaia.addVoiture(regera1);
        garageDeGaia.addVoiture(barracuda1);
        garageDeGaia.addVoiture(camaro1);
        garageDeGaia.addVoiture(charger1);
        garageDeGaia.addVoiture(gt1);
        garageDeGaia.addVoiture(firebird1);
        garageDeGaia.addVoiture(mustangBoss1);
        
       
      
      
      
        
	}

}
