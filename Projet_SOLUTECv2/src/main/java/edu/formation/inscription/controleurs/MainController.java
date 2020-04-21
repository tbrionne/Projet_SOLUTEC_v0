package edu.formation.inscription.controleurs;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.formation.inscription.dao.Utilisateur;
import edu.formation.inscription.dao.UtilisateurRepository;

@Controller
@RequestMapping(path="/")
public class MainController {
	
	@Autowired
	private UtilisateurRepository ur;
	
	@GetMapping
	public String getIndex() {
		return "index";
	}
	
	@GetMapping(path="/ajouter")
	public String getFormAjoutUtilisateur(@Valid @ModelAttribute("utilisateur") Utilisateur u, BindingResult result) {
		return "ajouterUtilisateur";
	}
	
	@PostMapping(path="/ajouter")
	public String postFormAjoutUtilisateur(@Valid @ModelAttribute("utilisateur") Utilisateur u, BindingResult result) {
		if (result.hasErrors()) {
			return "ajouterUtilisateur";
		}
		ur.save(u);
		return "detailsUtilisateur";
	}
	
	@GetMapping(path="/utilisateurs")
	public String getUsers(Map<String, Object> model) {
		model.put("utilisateurs", ur.findAll());
		return "utilisateurs";
	}

}
