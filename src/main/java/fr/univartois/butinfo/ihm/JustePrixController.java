/**
 * Ce logiciel est distribué à des fins éducatives.
 *
 * Il est fourni "tel quel", sans garantie d’aucune sorte, explicite
 * ou implicite, notamment sans garantie de qualité marchande, d’adéquation
 * à un usage particulier et d’absence de contrefaçon.
 * En aucun cas, les auteurs ou titulaires du droit d’auteur ne seront
 * responsables de tout dommage, réclamation ou autre responsabilité, que ce
 * soit dans le cadre d’un contrat, d’un délit ou autre, en provenance de,
 * consécutif à ou en relation avec le logiciel ou son utilisation, ou avec
 * d’autres éléments du logiciel.
 *
 * (c) 2022-2023 Romain Wallon - Université d'Artois.
 * Tous droits réservés.
 */

package fr.univartois.butinfo.ihm;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * La classe HelloController illustre le fonctionnement du contrôleur associé à une vue.
 *
 * @author Romain Wallon
 *
 * @version 0.1.0
 */
public class JustePrixController {

    /**
     * Le label de l'application, où l'on va pouvoir afficher des messages.
     * Ce label sera initialisé automatiquement par JavaFX grâce à l'annotation
     * {@link FXML}.
     */
    @FXML
    private Label questionPrix;
    @FXML
    private Label indicePrix;
    @FXML
    private TextField entrerPrix;
    @FXML
    private Button validerPrix; 
    
    private static final int MAX = 10000;
    private static final Random numRandom = new Random();
    int nombre = numRandom.nextInt(MAX);
    
    /**
     * Cette méthode exécute une action lorsque l'utilisateur clique sur le bouton de la
     * fenêtre.
     * Le lien avec le bouton de l'application sera réalisé automatiquement par JavaFX
     * grâce à l'annotation {@link FXML}.
     */
    @FXML
    public void onValiderButtonClick() {
    	String s = entrerPrix.getText();
    	int nombreEntrer = Integer.parseInt(s);
    	if (nombreEntrer==nombre) {
    		indicePrix.setText("C'est bon !");
    	}
    	else if (nombreEntrer<nombre) {
    		indicePrix.setText("C'est plus !");
    	}
    	else if (nombreEntrer>nombre) {
    		indicePrix.setText("C'est moins !");
    	}
    }


    
    
}
