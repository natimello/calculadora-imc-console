/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraimc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author natalia
 */
public class Front {
    static ArrayList<CalculadoraIMC> listaCalculos = new ArrayList<>();
            
    public static void main(String[] args) {
        
        while (true) {            
            System.out.println("PROGRAMA OO CÁLCULO IMC");
            System.out.print(" N = Novo");
            System.out.print(" L = Listar");
            System.out.print(" S = Sair");
            System.out.print(" Opção: ");
            Scanner sc = new Scanner(System.in);
            String lido = sc.nextLine();
            if (lido.equals("S")){
                break;
            } else if (lido.equals("N")){
               CalculadoraIMC a = criarCalculo();
               listaCalculos.add(a);
            } else if (lido.equals("L")){
                for(CalculadoraIMC a : listaCalculos){
                   mostrarResultado(a);
                }
                
            }
        }
    }
    
    public static void mostrarResultado(CalculadoraIMC a1) {
        
        System.out.print("CPF: " + a1.getCpf());        
        System.out.print(" | Nome: " + a1.getNome());
        System.out.print(" | Peso: " + a1.getPeso());
        System.out.println(" | Altura: " + a1.getAltura());
        System.out.println("Seu IMC é " + a1.calcularIMC());
        System.out.println("Sua classificação é: " + a1.classificarIMC());
    }
    
    public static CalculadoraIMC criarCalculo() {
        // Teste1: Um aluno com dados fictícios
        CalculadoraIMC a1 = new CalculadoraIMC();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("CPF: ");
        a1.setCpf(sc.next());
        
        System.out.print("Nome: ");
        a1.setNome(sc.next());
        
        System.out.print("Peso: ");
        a1.setPeso(sc.nextFloat());
        
        System.out.print("Altura: ");
        a1.setAltura(sc.nextFloat());
        
        return a1;
    }
}  