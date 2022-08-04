public class Main {

    public static void main(String[] args) {
        Cliente Reginaldo = new Cliente();
        Reginaldo.setNome("Reginaldo");

        Cliente Regiane = new Cliente();
        Regiane.setNome("Regiane");

        Conta cc = new ContaCorrente(Reginaldo);
        Conta poupanca = new ContaPoupanca(Reginaldo);
        Conta juridica = new  ContaJuridica(Regiane);

        cc.depositar(200);
        cc.transferir(100, poupanca);
        juridica.depositar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        juridica.imprimirExtrato();
    }

}
