/**
 * @Author : N'zo lagou
 *
 * Exercice 1 : Transaction JDBC
 * Instruction
 * Dans cet exercice, vous allez insérer un nouvel acteur dans la table des acteurs et affecter à l'acteur un film spécifié par un
 * identifiant de film.
 *
 * Tout d'abord, créez une classe qui représente un acteur
 *
 * public class Actor {
 *
 * }
 * Ensuite, créez une classe App
 *
 * Créer addActorAndAssignFilm()une méthode qui insère un nouvel acteur et attribue un film à l'acteur dans une transaction.
 *
 * Tout d'abord, insérez un nouvel acteur dans la table des acteurs.
 *
 * Ensuite, obtenez l'identifiant de l'acteur nouvellement inséré
 * Affectez ensuite l'acteur à un film en insérant une nouvelle ligne dans la table film_actor.
 * Après cela, si les étapes 2 et 3 ont réussi, validez la transaction. Sinon, annulez la transaction
 * Enfin, fermez les objets ResultSet, PreparedStatement et Connection.
 */


package models;

import java.util.Date;

public class Actor {
    private int id;
    private String firstName;
    private String lastName;
    private Date lastUpdate;

    public Actor() {
    }

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor(int id, String firstName, String lastName, Date lastUpdate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
