package com.example.demo.applications;

public class LancheApplication {
    public LancheApplication(
            LancheService lancheService,
            LancheRepository lancheRepository){
        this.lancheService = lancheService;
        tihs.lancheRepository = lancheRepository;
    }
    public void cadastrar(Lanche lanche){
        this.lancheRepository.adicionar(lanche);
        this.lancheService.save(lanche);
    }
    public list<Lanche> buscar(){
        return.this.lancheRepository.buscarPorCodigo(codigo);
    }
    
}