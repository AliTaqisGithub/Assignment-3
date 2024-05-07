import  java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
Movie m1 = new Movie("God Father","Dir.",2019,3);
Movie m2 = new Movie("Resident evil","Dir..",2014,4);
Movie m3 = new Movie("Joker","Dir...",2019,5);
    ArrayList<Movie> arrayList = new ArrayList<Movie>();
    arrayList.add(m1);
    arrayList.add(m2);
    arrayList.add(m3);
    System.out.println(arrayList);
    arrayList.remove(new Movie("Joker","Dir...",2019,5));
    arrayList.remove(2);
    System.out.println("Removing array.......\n");
    System.out.println(arrayList);
    for(Movie m : arrayList){
        m.setRating(4);
        arrayList.set(0,m1);
        System.out.println("updating rating.........\n");
        System.out.println(arrayList);
    }
    System.out.println("Finding index of object");
    System.out.println( arrayList.indexOf(m1));
    Text t = new Text();

    ArrayList<Text>texts = new ArrayList<Text>();
    texts.add(t);

    System.out.println(Arrays.toString(t.text.split("\n")));
    System.out.println(t.text.length());

    Text t1 = new Text();
    char char1[]=t1.text.toCharArray();
    HashSet<Character> charactersList=new HashSet<Character>();
    for(char ch:char1){
        if(Character.isLetter(ch)){
            charactersList.add(ch);
        }
    }
        System.out.println("Splpiting into cahracters");
        System.out.println(charactersList.size());
    String[] sentence = t1.text.split("\\.");
    List<String> sentences = new ArrayList<>();
    for(String sent:sentence){
    sentences.add(sent);
    }
    // code for adding word frequency.
    Set<Character> uniqueword = new HashSet<>();
    for(String sent:sentences){
        for (char ch : sent.toCharArray()){
            if(Character.isLetter(ch)){
                uniqueword.add(Character.toLowerCase(ch));
            }
        }
        System.out.println("Unique charachters:");
        System.out.println(uniqueword);
    }

    }
    }