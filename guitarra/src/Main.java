//
//Você é iniciante? 1: sim / 2: não
//Quanto você deseja investir?
//Qual cor você gostaria que o corpo da guitarra tenha? 1: vermelho / 2: preto / 3: verde / 4: branco
//Você quer 22 ou 24 casas?
//Você quer 6, 7 ou 8 cordas?
//
//Leonardo Ikeda, Daniel Nowak Assis e Danilo Alecrim Almeida

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Guitarra gibsonLesPaulClassic = new Guitarra("Gibson Les Paul Classic", 10500,2,1,22,6);
        Guitarra EpiphoneLesPaulSL = new Guitarra("Epiphone Les Paul SL", 740,1,3,22,6);
        Guitarra fenderSquierAffinitySeries = new Guitarra("Fender Squier Affinity Series",3200,2,4,22,6);
        Guitarra schecterGuitarC6Deluxe = new Guitarra("Schecter Guitar C-6 Deluxe",3500,2,1,24,6);

        Guitarra ibanezGrg7221qa = new Guitarra("Ibanez Grg 7221qa", 3600,1,2,24,7);
        Guitarra Schecter1477C7 = new Guitarra("Schecter 1477 C-7 Multi Scale Silver Mountain Guitar", 8800,2,1,24,7);
        Guitarra SchecterC7Pro = new Guitarra("Schecter C-7 Pro", 5800,2,4,24,7);
        Guitarra KieselDelos7StringHSS = new Guitarra("Kiesel Delos 7-String HSS", 6700,2,3,24,7);

        Guitarra ibanezRG8 = new Guitarra("Ibanez RG8", 4100, 2, 2, 24, 8);
        Guitarra ibanezRGMS8 = new Guitarra("Ibanez RGMS8", 5200, 2, 2, 24,8);
        Guitarra schecterHellraiserC8 = new Guitarra("Schecter Hellraiser C-8",  7500,2,1, 24,8);
        Guitarra schecterC8MultiscaleSilverMountain = new Guitarra("Schecter C8 Multiscale Silver Mountain",  7500,2,1, 24,8);

        var lista_Guitarras = new ArrayList<Guitarra>();
        lista_Guitarras.add(gibsonLesPaulClassic);
        lista_Guitarras.add(EpiphoneLesPaulSL);
        lista_Guitarras.add(fenderSquierAffinitySeries);
        lista_Guitarras.add(schecterGuitarC6Deluxe);

        lista_Guitarras.add(ibanezGrg7221qa);
        lista_Guitarras.add(Schecter1477C7);
        lista_Guitarras.add(SchecterC7Pro);
        lista_Guitarras.add(KieselDelos7StringHSS);

        lista_Guitarras.add(ibanezRG8);
        lista_Guitarras.add(ibanezRGMS8);
        lista_Guitarras.add(schecterHellraiserC8);
        lista_Guitarras.add(schecterC8MultiscaleSilverMountain);

        //sistema de regras com teoria dos conjuntos por lista

        var lista_selecao = new ArrayList<Guitarra>();
        System.out.println("Quanto você deseja investir?");
        Scanner investimento = new Scanner(System.in);
        int intInvestimento = investimento.nextInt();
        if (intInvestimento < 740){
            System.out.println("Não temos guitarras por menos de 740 reais");
            System.exit(1);
        }else{
            for(int i = 0; i < lista_Guitarras.size(); i++) {
                if (lista_Guitarras.get(i).getInvestimento() == intInvestimento) {
                    lista_selecao.add(lista_Guitarras.get(i));
                }
            }
        }

        System.out.println("Você é iniciante? 1: sim / 2: não");
        Scanner experiencia = new Scanner(System.in);
        int intexperiencia = experiencia.nextInt();

        if (intexperiencia == 1 || intexperiencia == 2) {
            for(int i = 0; i < lista_Guitarras.size(); i++) {
                if (lista_Guitarras.get(i).getExperiencia() == intexperiencia) {
                    lista_selecao.add(lista_Guitarras.get(i));
                }
            }
        }else{
            System.out.println("Digite 1 ou 2");
            System.exit(1);
        }

        System.out.println("Qual cor você gostaria que o corpo da guitarra tenha? 1: vermelho / 2: preto / 3: verde / 4: branco");
        Scanner cor = new Scanner(System.in);
        int intcor = cor.nextInt();

        if (intcor == 1 || intcor == 2 || intcor == 3 || intcor == 4) {
            for (int a = 0; a < lista_Guitarras.size(); a++) {
                if (lista_Guitarras.get(a).getCor() == intcor) {
                    lista_selecao.add(lista_Guitarras.get(a));
                }
            }
        }else{
            System.out.println("Digite 1, 2, 3 ou 4");
            System.exit(1);
        }

        if (intexperiencia == 2) {

            System.out.println("Você quer 22 ou 24 casas? ");
            Scanner casas = new Scanner(System.in);
            int intcasas = casas.nextInt();

            if (intcasas == 22 || intcasas == 24) {
                for (int b = 0; b < lista_Guitarras.size(); b++) {
                    if (lista_Guitarras.get(b).getCasas() == intcasas) {
                        lista_selecao.add(lista_Guitarras.get(b));
                    }
                }
            }else{
                System.out.println("Digite 22 ou 24");
                System.exit(1);
            }

            System.out.println("Você quer 6, 7 ou 8 cordas? ");
            Scanner tarraxa = new Scanner(System.in);
            int inttarraxa = tarraxa.nextInt();

            if (inttarraxa == 6 || inttarraxa == 7 || inttarraxa == 8) {
                for (int c = 0; c < lista_Guitarras.size(); c++) {
                    if (lista_Guitarras.get(c).getTarraxa() == inttarraxa) {
                        lista_selecao.add(lista_Guitarras.get(c));
                    }
                }
            }else{
                System.out.println("Digite 6, 7 ou 8");
                System.exit(1);
            }

            for(int g = 0; g < lista_selecao.size(); g++) {
                if (lista_selecao.get(g).getTarraxa() != inttarraxa) {
                    lista_selecao.remove(g);
                    g--;
                }
            }

            for(int s = 0; s < lista_selecao.size(); s++) {
                if (lista_selecao.get(s).getCasas() != intcasas) {
                    lista_selecao.remove(s);
                    s--;
                }
            }
        }

        for(int j = 0; j < lista_selecao.size(); j++) {
            if (lista_selecao.get(j).getInvestimento() > intInvestimento) {
                lista_selecao.remove(j);
                j--;
            }
        }

        for (int h = 0; h < lista_selecao.size(); h++) {
            if (lista_selecao.get(h).getExperiencia() != intexperiencia) {
                lista_selecao.remove(h);
                h--;
            }
        }

        for (int k = 0; k < lista_selecao.size(); k++) {
            if (lista_selecao.get(k).getCor() != intcor) {
                lista_selecao.remove(k);
                k--;
            }
        }

        Set set = new HashSet<>(lista_selecao);
        List<Guitarra> Newlista_selecao = new ArrayList(set);

        if (Newlista_selecao.size() == 0) {
            System.out.println("Não temos o que você deseja, porém temos esses modelos");
            for (int l = 0; l < lista_Guitarras.size(); l++){
                lista_Guitarras.get(l).imprimirDadosIniciante();
            }
        }else{
            System.out.println("Temos esse(s) modelo(s) para você: ");
            for (int m = 0; m < Newlista_selecao.size(); m++){
                Newlista_selecao.get(m).imprimirDadosIniciante();
            }
        }
    }
}