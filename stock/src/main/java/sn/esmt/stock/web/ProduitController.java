package sn.esmt.stock.web;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.stock.entity.ProduitEntity;
import sn.esmt.stock.service.ProduitService;

import java.util.List;

@RestController
@RequestMapping("produits")
@AllArgsConstructor
public class ProduitController {
  private ProduitService produitService;

  @PostMapping
  public ProduitEntity save(ProduitEntity produitEntity) {
    return produitService.save(produitEntity);
  }

  @GetMapping
  public List<ProduitEntity> all() {
    return produitService.getAll().get();
  }

  @GetMapping("/{ref}")
  public  ProduitEntity get(@PathVariable String ref) {
    return produitService.get(ref).get();
  }

  @PutMapping
  public ProduitEntity update(@RequestBody String ref, @RequestBody ProduitEntity produitEntity) {
    return produitService.update(ref, produitEntity);
  }

  @DeleteMapping
  public void delete(@RequestBody String ref) {
    produitService.delete(ref);
  }
}
