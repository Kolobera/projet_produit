package sn.esmt.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.esmt.stock.entity.ProduitEntity;

import java.util.Optional;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity, String> {

  @Query("select p from ProduitEntity p where p.ref= ?1 and p.nom= ?2")
  public Optional<ProduitEntity> findByReferenceAndNom(String ref, String nom);

  @Query("select p from ProduitEntity p where p.ref= :r and p.nom= :n")
  public Optional<ProduitEntity> findByReferenceAndNomv2(@Param("r") String ref, @Param("n") String nom);

  public Optional<ProduitEntity> findByRef(String ref);
}
