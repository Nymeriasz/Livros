package livros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Livro livros[] = new Livro[3];
        Biblioteca fip = new Biblioteca();
        Aluno aluno1 = new Aluno();
        Scanner input = new Scanner(System.in);


        for(int i=0; i< livros.length; i++){
            livros[i] = new Livro();
            System.out.println("Insira os valores: ");
            livros[i].setAutor(input.nextLine());
            livros[i].setIsbn(input.nextInt());
            input.nextLine();
        }

        fip.setLivros(livros);

        System.out.println("Quantos livros deseja pegar?");
        int quantidade = input.nextInt();
        input.nextLine();
        Livro livrosAluno[] = new Livro[quantidade];
        int cont = 0;
        for (int i=0; i<livros.length; i++){
            System.out.println(fip.getLivros()[i].getAutor());
            System.out.println("Deseja esse livro?");
            String resposta = input.nextLine();
            if(resposta.equals("sim")){
                livrosAluno[cont] = new Livro();
                livrosAluno[cont] = livros[i];
                cont++;
            }
        }

        aluno1.setLivros(livrosAluno);

        for (int i=0; i<livrosAluno.length; i++) {
            System.out.println(aluno1.getLivros()[i].getAutor());
        }

    }
}
