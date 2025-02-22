package com.example.demo.facade;

public class LancheFacade {
    private LancheApplication lancheApplication;

    public lanchesFacade(LancheApplication lancheApplication){
        this.lancheApplication = lancheApplication;
    }
    public void cadastrar(Lanche lanche){
        this.lancheApplication.cadastrar(lanche);
    }
}
