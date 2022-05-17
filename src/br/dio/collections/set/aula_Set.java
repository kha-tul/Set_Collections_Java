package br.dio.collections.set;

import com.sun.source.doctree.SeeTree;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class aula_Set {
    public static void main(String[] args) {
        //
        //Set - não permite itens repetidos.
        //Por padrão, não garantem ordem de inserção. (erro comum)
        //Permine adição ou removação. Não possui busca por item e atualização, só navegação. (sem indice)
        //Não permite mudança na ordenação
        //Criada para performar melhor.
        //manter ordem, é custoso para dados. Buscas tambem.
        //Parmite navegação atréves de interator e outros objetos.

        //---Classificação---
        //Hashset:
        //Quando utilizar-não necessário manter ordenção-Não é ordenado,não permite repetição.
        //Performance: não tem repetição de valores, mais performática.
        //
        //LinkedHashSet:
        //Necessário manter a ordem na inserção. Mantém a ordem de inserção dos elementos.
        //Performance: Implementação mais lenta(por contér ordenação).
        //
        //TreeSet: (meio termo dos 2 anteriores)
        //Quando necessário manter a ordem através do uso de 'comparators' e precisa manter ordem árvore. Mantém ordem e pode ser ordenado.
        //Perfomance: Performatico para leitura. Para modificação tem a necessidade de reordenar, + lento que LinkedHashSet


        Set<Double> notaAlunos = new HashSet<>();

        notaAlunos.add(5.8);
        notaAlunos.add(9.3);
        notaAlunos.add(6.5);
        notaAlunos.add(10.0);
        notaAlunos.add(5.4);
        notaAlunos.add(7.3);
        notaAlunos.add(3.8);
        notaAlunos.add(4.0);

        System.out.println(notaAlunos);

        notaAlunos.remove(3.8);

        System.out.println(notaAlunos);

        System.out.println(notaAlunos.size());

        Iterator<Double> iterator = notaAlunos.iterator();

        while (iterator.hasNext()); {
            System.out.println(iterator.next());
        }
        for (Double nota: notaAlunos) {
            System.out.println(nota);
        }

        System.out.println(notaAlunos.isEmpty());







    }
}
