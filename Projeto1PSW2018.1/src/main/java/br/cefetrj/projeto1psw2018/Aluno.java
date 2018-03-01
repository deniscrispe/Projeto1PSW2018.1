package br.cefetrj.projeto1psw2018;

/**
 * Classe Aluno para exemplo de testes unitários e cobertura de testes
 * @author Denis
 * @version 1.0
 */
public class Aluno {
    
    /**
     * Metodo para verificar a situação do aluno na disciplina.
     * @param frequencia variável double que receberá a porcentagem da frequência do aluno
     * @param P1 variável double que receberá a nota da primeira prova do aluno
     * @param trabalho variável double que receberá a nota do trabalho do aluno
     * @param projeto variável double que receberá a nota dos projetos feitos em sala pelo aluno
     * @param PF variável double que receberá a nota da prova final do aluno
     * @return retorna uma String com a situação do aluno (Aprovado ou Reprovado).
     */

    public String situacao(double frequencia, double P1, double trabalho, double projeto, double PF) {

        double M1;
        M1 = (0.7 * ((P1 + trabalho) / 2)) + projeto * 0.3;

        if (frequencia >= 0.75) {
            if (M1 >= 7) {
                return "Aprovado";
            } else if (M1 < 3) {
                return "Reprovado";
            } else {
                if ((PF + M1) / 2 >= 5) {
                    return "Aprovado";
                } else {
                    return "Reprovado";
                }
            }
        } else {
            return "Reprovado";
        }

    }

}
