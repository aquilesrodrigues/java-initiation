// Lista Encadeada IsEmpty, Size()
// add()
package com.ars.listas;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public ListaEncadeada(){

        this.referenciaEntrada = null;
    }

    /** Método sem retorno Adiciona elemento a lista
     *
     * @param conteudo
     */
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada =novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    /** Método privado busca nó
     *
     * @param index
     * @return
     */
    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i < this.size()-1; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    /** Método de validação
     * Utilizado internamente para a classe
     * para auxiliar o getNo e o removeNo
     */
    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice"+ index + "desta lista. /b Esta lista só vai até o índice " + ultimoIndice);
        }
    }

    /** Método verifica tamanho lista
     *
     * @return
     */
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true) {
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }

            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    /** Método verifica referência vazia
     *
     * @return
     */
    public boolean isEmpty(){

        return referenciaEntrada == null ? true : false;
    }
}
