package br.edu.infnet.appcar.repository;

import br.edu.infnet.appcar.model.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

    @Query("from Veiculo v where v.usuario.id = :id")
    List<Veiculo> obterLista(Integer id);
}
