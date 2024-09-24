package bai6;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;
import java.io.File;

public class HtmlValidator {
    public void htmlValid(String filePath){
        try {
            File input = new File(filePath);
            Document doc = Jsoup.parse(input, "UTF-8");
            //Kiem tra cac the chua dong
            Elements unclosedTags = doc.select("*:not(html):not(head):not(body):not(meta):not(link):not(script):not(style)");
            for(Element tag : unclosedTags){
                System.out.println("The chua dong " + tag.tagName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
