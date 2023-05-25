import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuarDesconto(orcamento);
        }
        return proximo.calcular(orcamento);
    };

    protected abstract BigDecimal efetuarDesconto(Orcamento orcamento);

    protected abstract boolean deveAplicar(Orcamento orcamento);
}
