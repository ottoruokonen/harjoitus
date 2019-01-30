package hh.swd20.autoprojekti.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.swd20.autoprojekti.domain.Auto;

@Controller
public class AutocController {
	
	
	//lähettää selaimeen tyhjän lomakkeen autosta
	//esimerkissä /uusiauto
	//requestmapping tarkoittaa osoitteen loppuosaa.
	
	@RequestMapping(value="/addcar", method=RequestMethod.GET )
	public String uusiAuto(Model model) {
		
		Auto auto1 = new Auto();
		model.addAttribute("Auto", auto1);
		return "newcar"; //newcar.html (Thymeleaf template)
		
	}
// vastaanottaa täytetyn autolomakkeen tiedot
	//esimerkissä lisaaauto
	
	@RequestMapping(value="/lisaaauto", method=RequestMethod.POST)
	public String lisaaauto(@ModelAttribute Auto uusiauto, Model model) {
		//lisättäisiin tietokantaa, mutta ei vielä osata
		model.addAttribute("Auto", uusiauto);
		return "carview"; //carview.html
	}
}
