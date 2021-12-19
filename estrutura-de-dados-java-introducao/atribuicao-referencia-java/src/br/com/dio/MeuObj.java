package br.com.dio;

public class MeuObj {
    Integer num;

    public MeuObj(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
