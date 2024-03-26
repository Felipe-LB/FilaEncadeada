public class FilaEncadeada {

    public NoFila inicio;
    public NoFila fim;
    public int n;

    public void insere(int elem) {
        NoFila temp = fim;
        fim = new NoFila();
        fim.setElem(elem);
        if (vazia()) {
            inicio = new NoFila();
            inicio.setNo(fim);
        } else {
            temp.setNo(fim);
        }
        n++;
    }

    public int retira() throws Exception {

        if (vazia()) {
            throw new Exception("Fila está vazia");
        }

        NoFila temp = new NoFila();
        temp = inicio.getNo();

        int iRetorno = temp.getElem();

        inicio.setNo(temp.getNo());

        n--;

        return iRetorno;

    }

    public boolean vazia() {

        return (n == 0);

    }

    public void libera() {
        inicio.setNo(null);
        n = 0;
    }
}