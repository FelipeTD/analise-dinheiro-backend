package ti.tortora.analise.dinheiro.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ti.tortora.analise.dinheiro.domain.model.Deposito;

@Repository
public interface DepositoRepository extends JpaRepository<Deposito, Long> {
}
