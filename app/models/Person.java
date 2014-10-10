package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.db.ebean.Model;

/**
 * Created by olza10131 on 10.10.2014.
 */
@Entity
public class Person extends Model {
    @Id
    public String id;
    public String name;
}
