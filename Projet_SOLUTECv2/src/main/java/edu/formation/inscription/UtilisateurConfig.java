package edu.formation.inscription;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class UtilisateurConfig implements WebMvcConfigurer {
	
	// Création d'une méthode permettant d'avoir une localisation par défaut
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.FRANCE);
		return slr;
	}
		
	// Intercepter une demande de changement de localisation
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}
	
	// Enregistrer l'intercepteur
	@Override
	public void addInterceptors(InterceptorRegistry registre) {
		registre.addInterceptor(localeChangeInterceptor());
	}

}
