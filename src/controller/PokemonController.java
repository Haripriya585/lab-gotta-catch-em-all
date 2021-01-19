package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD
import model.Pokemon;
import model.Charizard;
import model.Bulbasaur;
import model.Dragonite;
import model.Pikachu;
import model.Mew;
=======

>>>>>>> e448b5052f2f59e53105ec371ffe2524fda9d2ca
@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
<<<<<<< HEAD
			Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pok�mon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pok�mon in the Kanto region.","POISON","IVYSAUR","64");
			msg = "<center>" +  bulbasaur.getPokemonName() + "  #" + bulbasaur.getPokemonNUmber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", bulbasaur.getCharacteristics());
			request.setAttribute("type1",bulbasaur.getType());
			request.setAttribute("evolution1",bulbasaur.getEvolution());
			request.setAttribute("baseExp1",bulbasaur.getBaseExp());
//		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard charizard = new Charizard("Charizard",006,"Charizard is fit and strong and has the ability to soar up to ridiculous heights.With a single breath of fire, it can burn down forests and melt gigantic glaciers.","FIRE","CHARMELEON","240");
			 
			msg = "<center>" + charizard.getPokemonName()  + "  #" + charizard.getPokemonNUmber();
			request.setAttribute("message2",msg);
			//System.out.println("char");
			request.setAttribute("character2", charizard.getCharacteristics());
			request.setAttribute("type2",charizard.getType());
			request.setAttribute("evolution2", charizard.getEvolution());
			request.setAttribute("baseExp2", charizard.getBaseExp());
=======
		/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message1",//getter);
			request.setAttribute("character1", //getter);
			request.setAttribute("type1",//getter;
			request.setAttribute("evolution1", //getter);
			request.setAttribute("baseExp1", //getter);*/
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			
			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message2",//getter);
			request.setAttribute("character2", //getter);
			request.setAttribute("type2",//getter;
			request.setAttribute("evolution2", //getter);
			request.setAttribute("baseExp2", //getter);*/
>>>>>>> e448b5052f2f59e53105ec371ffe2524fda9d2ca
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	
<<<<<<< HEAD
			Dragonite dragonite =new Dragonite("Dragonite",149,"Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pok�mon with human-like intelligence. It shows signs of altruism.","DRAGON","DRATINI","270");
			  
			msg = "<center>" + dragonite.getPokemonName()  + "  #" + dragonite.getPokemonNUmber();
			request.setAttribute("message3",msg);
			request.setAttribute("character3", dragonite.getCharacteristics());
			request.setAttribute("type3",dragonite.getType());
			request.setAttribute("evolution3", dragonite.getEvolution());
			request.setAttribute("baseExp3", dragonite.getBaseExp());
		}
		if (value4 != null) {
			Mew mew=new Mew("Mew",151,"Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.","PSYCHIC","NONE","64");
			// Create the object for Mew class and use getters to retrieve the values	
				  
			msg = "<center>" + mew.getPokemonName()  + "  #" + mew.getPokemonNUmber();
			request.setAttribute("message4",msg);
			request.setAttribute("character4", mew.getCharacteristics());
			request.setAttribute("type4",mew.getType());
			request.setAttribute("evolution4", mew.getEvolution());
			request.setAttribute("baseExp4", mew.getBaseExp());
		}

		if (value5 != null) {
			Pikachu pikachu = new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.","ELECTRIC","RAICHU","112");
			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
	  
			msg = "<center>" + pikachu.getPokemonName()  + "  #" + pikachu.getPokemonNUmber();
			request.setAttribute("message5",msg);
			request.setAttribute("character5", pikachu.getCharacteristics());
			request.setAttribute("type5",pikachu.getType());
			request.setAttribute("evolution5", pikachu.getEvolution());
			request.setAttribute("baseExp5", pikachu.getBaseExp());
=======

			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message3",//getter);
			request.setAttribute("character3", //getter);
			request.setAttribute("type3",//getter;
			request.setAttribute("evolution3", //getter);
			request.setAttribute("baseExp3", //getter);*/
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message4",//getter);
			request.setAttribute("character4", //getter);
			request.setAttribute("type4",//getter;
			request.setAttribute("evolution4", //getter);
			request.setAttribute("baseExp4", //getter);*/
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message5",//getter);
			request.setAttribute("character5", //getter);
			request.setAttribute("type5",//getter;
			request.setAttribute("evolution5", //getter);
			request.setAttribute("baseExp5", //getter);*/
>>>>>>> e448b5052f2f59e53105ec371ffe2524fda9d2ca

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}
<<<<<<< HEAD
	}
=======

>>>>>>> e448b5052f2f59e53105ec371ffe2524fda9d2ca
}
