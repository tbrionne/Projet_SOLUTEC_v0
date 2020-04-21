package edu.formation.inscription.controleurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.formation.inscription.dao.Utilisateur;
import edu.formation.inscription.dao.UtilisateurRepository;

@Controller
@RequestMapping(path="/inscription")
public class TestController {
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	@GetMapping(path="/ajouter")
	public @ResponseBody String addNewUser(@RequestParam String nom, @RequestParam String prenom, @RequestParam String nomDeCompte, @RequestParam String motDePasse) {
		/* @ResponseBody : le String retourné est la réponse et non une vue */
		/* @RequestParam : un paramètre de la requête */
		
		// Préparation de l'objet
		Utilisateur n = new Utilisateur();
		n.setNom(nom);
		n.setPrenom(prenom);
		n.setNomDeCompte(nomDeCompte);
		n.setMotDePasse(motDePasse);
		
		// Stockage de l'objet
		utilisateurRepository.save(n);
		return "Enregistré";
	}
	
	@GetMapping(path="/utilisateurs")
	public @ResponseBody Iterable<Utilisateur> getAllUser() {
		/* Retourne un fichier JSON contenant les utilisateurs */
		return utilisateurRepository.findAll();
	}

}
