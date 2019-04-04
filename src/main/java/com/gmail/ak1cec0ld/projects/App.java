package com.gmail.ak1cec0ld.projects;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        Timer t = new Timer();
        String textContents = "Failed";
        try {
            Document doc = Jsoup.connect("https://stackoverflow.com/questions/9825798/how-to-read-a-text-from-a-web-page-with-java").get();
             textContents = doc.select(".newsText").first().text();
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(textContents);
        t.schedule(new TimerTask(){
            @Override
            public void run() {
                System.out.println("hello world");
            }
        }, 500L,500L);

    }
}
