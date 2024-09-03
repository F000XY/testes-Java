package Exercicio3;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.io.File;

public class Exercicio3 {
    public static void leitura(){
          try {

            File xmlFile = new File("/home/nathaliahelenna/IdeaProjects/questoes/src/Exercicio3/faturamento.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("dia");

            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;
            double soma = 0;
            int diasComFaturamento = 0;


            for (int temp = 0; temp < nList.getLength(); temp++) {
                Element diaElement = (Element) nList.item(temp);
                double valor = Double.parseDouble(diaElement.getElementsByTagName("valor").item(0).getTextContent());

                if (valor > 0) {
                    if (valor < menorValor) {
                        menorValor = valor;
                    }
                    if (valor > maiorValor) {
                        maiorValor = valor;
                    }
                    soma += valor;
                    diasComFaturamento++;
                }
            }

            double media = soma / diasComFaturamento;
            int diasAcimaDaMedia = 0;


            for (int temp = 0; temp < nList.getLength(); temp++) {
                Element diaElement = (Element) nList.item(temp);
                double valor = Double.parseDouble(diaElement.getElementsByTagName("valor").item(0).getTextContent());

                if (valor > media) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor valor de faturamento: " + menorValor);
            System.out.println("Maior valor de faturamento: " + maiorValor);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        leitura();

    }
}
