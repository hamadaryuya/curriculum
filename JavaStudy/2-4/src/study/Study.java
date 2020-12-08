package study;

//①FruitsConstants.javaをインポートしなさい。
import constants.FruitsConstants;
/**
 * 本課題では、基本的なJavaの構造と、importについて理解を深めていきましょう。
 *
 * 問①〜問③まであります。
 * 全て回答し、課題にある画像と同じ表示になるようにしてください。
 *
 */
public class Study {

    public static void main(String[] args) {

        /* ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。
         *     また、課題の画像と同じ表示になるように
         *     printFruitsの引数にはFruitsConstantsから呼び出した値を設定してください。
         */
    	System.out.println("食べ物は" + FruitsConstants.FRUITS_LEMON_04);
    	System.out.println(FruitsConstants.FRUITS_COUNT_20 + "です");

    }
}