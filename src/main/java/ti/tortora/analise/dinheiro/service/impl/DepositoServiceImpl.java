package ti.tortora.analise.dinheiro.service.impl;

import org.springframework.stereotype.Service;
import ti.tortora.analise.dinheiro.domain.model.Deposito;
import ti.tortora.analise.dinheiro.domain.repository.DepositoRepository;
import ti.tortora.analise.dinheiro.service.DepositoService;

@Service
public class DepositoServiceImpl implements DepositoService {

    private final DepositoRepository repository;

    public DepositoServiceImpl(DepositoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Deposito depositar(Deposito deposito) {
        return repository.save(deposito);
    }

}
