import org.newdawn.slick.AppGameContainer; //Conteneur de base du jeu
import org.newdawn.slick.GameContainer; //Conteneur annexe
import org.newdawn.slick.BasicGame; //La classe principale dont dépend votre jeu
import org.newdawn.slick.Graphics; //Sauf si vous voulez pas de graphismes mais j'en doute
import org.newdawn.slick.SlickException; //L'exception de base de Slick
 
public class Test extends BasicGame
{
    //Conteneur du jeu 
    private GameContainer container; 
 
    //Constructeur de base, le seul argument nécessaire est le titre de la fenêtre
    public Test()
    { 
        super("Hello world"); 
    } 
 
    //Initialisation des ressources pour l'application
    public void init(GameContainer container) throws SlickException
    {
        this.container = container;
    }
 
    //Fonction de rendu de l'application
    public void render(GameContainer container, Graphics g)
    {
        g.drawString("Hello World", 100, 50);
    }
 
    //Mise à jour du jeu, c'est ici que se situe la boucle principale de l'application
    public void update(GameContainer container, int delta)
    {
 
    } 
 
    public static void main(String[] argv)
    {
    	//Création du jeu, le try catch est fortement conseillé
        try
        {
            AppGameContainer container = new AppGameContainer(new Test()); 
            container.setDisplayMode(800,600,false); //Hauteur, Largeur et Plein Ecran
            container.start(); //Lancement de l'application
        }
        catch (SlickException e)
        {
            e.printStackTrace(); 
        } 
    }
}