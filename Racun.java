

package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import org.hibernate.annotations.Cascade;

/**
 *
 * @author ilijaa
 */

@Entity
public class Racun implements Serializable{
	
	@Id
    private int racunID; 
    private Date datum;
    

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="racun")  
    @MapKey(name="racunID")
    @Column(name="rb")

    private List<StavkaRacuna> stavkeRacuna;
    /** Creates a new instance of Racun */
    public Racun() {
    }

    public int getRacunID() {
        return racunID;
    }

    public void setRacunID(int racunID) {
        this.racunID = racunID;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }


    public List<StavkaRacuna> getStavkeRacuna() {
        return stavkeRacuna;
    }

    public void setStavkeRacuna(List<StavkaRacuna> stavkeRacuna) {
        this.stavkeRacuna = stavkeRacuna;
    }

    public String toString() {
        return "RacunID: "+racunID+"  Datum: "+datum+"   Stavke racuna:\n"+stavkeRacuna.toString();
    }
    
}
