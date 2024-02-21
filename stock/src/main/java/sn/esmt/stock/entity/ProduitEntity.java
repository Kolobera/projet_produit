package sn.esmt.stock.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "produit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProduitEntity {
  @Id
  @Column(name = "reference", length = 100)
  private String ref;
  @Column(name = "nom", length = 200)
  private String nom;
  @Column(name = "quantite_stock")
  private double qtStock;
}
