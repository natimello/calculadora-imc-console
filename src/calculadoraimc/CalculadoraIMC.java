/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraimc;

/**
 *
 * @author rosba
 */
public class CalculadoraIMC {

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    /* atributos */
    private String cpf;
    private String nome;
    private Float peso;
    private Float altura;

    /* métodos */
    public Float calcularIMC() {
        Float indice = getPeso() / (getAltura() * getAltura());
        return indice;
    }

    public String classificarIMC() {
        if (calcularIMC() < 18.5)
            return "Abaixo do peso";
        else if (calcularIMC() >= 18.5 || calcularIMC() <= 24.9)
            return "Peso normal";
        else if (calcularIMC() >= 25.0 || calcularIMC() <= 29.9)
            return "Sobrepeso";
        else if (calcularIMC() >= 30.0 || calcularIMC() <= 39.9)
            return "Obesidade";
        else if (calcularIMC() >= 40.0)
            return "Obesidade grave";
        return "";
        
    }   
} 
