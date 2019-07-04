package garage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.garage.voiture.Vehicule;

public class Garage {
		List<Vehicule> voitures = new ArrayList<Vehicule>();
		String saveFile= "garageGaia.txt";
	
		public Garage() {
			readSavedGarage();
		}
		
		private void readSavedGarage() {
			try( FileInputStream fis = new FileInputStream(saveFile);
					BufferedInputStream bis = new BufferedInputStream(fis);
						ObjectInputStream ois = new ObjectInputStream(bis) ){
				voitures= (List<Vehicule>)ois.readObject();
				ois.close();
				
			}catch(FileNotFoundException e) {
				System.err.println("Aucune voiture sauvegardée ! ");
			}catch(IOException e) {
				System.err.println("Erreur dans la lecture du fichier");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		
		}
		
		private void writeSavedGarage() {
			try(FileOutputStream fos = new FileOutputStream(saveFile);
					BufferedOutputStream bos = new BufferedOutputStream(fos);
						ObjectOutputStream oos= new ObjectOutputStream(bos)){
				oos.writeObject(voitures);
				oos.close();
			}catch(FileNotFoundException e) {
				System.err.println("Fichier non trouvé");
			}catch(IOException e) {
				System.err.println("Erreur d'écriture dans le fichier");
			}
		}
		
		public String toString() {
			String listeVoiture= "";
			if(Files.notExists(Paths.get("garageGaia.txt"))) listeVoiture += "Aucune voiture sauvegardée !\n";
			listeVoiture +="*********************************************************\n";
			listeVoiture +="Garage de Gaïa\n";
			listeVoiture+="*********************************************************\n";
			for(Vehicule v : voitures)
				listeVoiture += "+" + v + "\n"; 
			return listeVoiture;
		}
		
		public void addVoiture(Vehicule newVoiture) {
			voitures.add(newVoiture);
			writeSavedGarage();
			
		
		}
		
}

