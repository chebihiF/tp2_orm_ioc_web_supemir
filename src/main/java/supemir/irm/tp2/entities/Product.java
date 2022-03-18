package supemir.irm.tp2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity @Table(name = "produit")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Product {
    @Id @Column(length = 30) @Length(min = 3, max =20)
    private String ref ;
    @Column(name = "libelle", unique = true)
    private String label ;
    @Column(name = "prix")
    @Min(value = 10)
    private double price ;
    @Column(name = "quantite")
    private int quantity ;
}
