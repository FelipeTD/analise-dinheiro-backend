package ti.tortora.analise.dinheiro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ti.tortora.analise.dinheiro.domain.model.Deposito;
import ti.tortora.analise.dinheiro.service.DepositoService;

@RestController
@RequestMapping("/depositos")
public class DepositoController {

    private final DepositoService service;

    public DepositoController(DepositoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Deposito> realizarDeposito(@RequestBody Deposito deposito) {
        return ResponseEntity.ok(service.depositar(deposito));
    }

}
