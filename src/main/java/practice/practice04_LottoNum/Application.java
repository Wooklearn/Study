package practice.practice04_LottoNum;

import java.util.Set;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {

        Set<Integer> lotto = new TreeSet();

        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) + 1);
        }
        System.out.println("이번주 로또 번호는?");
        System.out.println(lotto);
    }

}
