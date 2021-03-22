package hu.nive.ujratervezes.zarovizsga.words;

import java.util.ArrayList;
import java.util.List;

/*
A Words osztálynak legyen egy boolean hasMoreDigits(String s) metódusa, mely visszaadja, hogy a szóvan több számjegy
van-e, mint többi karakter. Azaz a aa111 szóban három számjegy van és kettő többi, azaz true értéket ad vissza.
 */
public class Words {

    public boolean hasMoreDigits(String s) {
        List<Character> numbers = new ArrayList<>();
        List<Character>nonNumbers= new ArrayList<>();
        for (char c : s.toCharArray()){
            if(Character.isDigit(c)){
                numbers.add(c);

            }
            if(!Character.isDigit(c)){
                nonNumbers.add(c);
            }
            return numbers.size() > nonNumbers.size();
        }
        return false;
    }
}
