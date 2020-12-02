/**
 * バブルソート
 * チェックテスト-Java1章
 *
 */
public class Check{
  public static void main(String[] args){
      /*
      * 問1
      * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
      */
      int[] data = {3,1,2,7,5};

      /*
      * 問2
      * 以下のfor文を完成させなさい
      */
      for(int i = 0; i < data.length; i++){
          System.out.print(data[i] + " ");
      }
      
      System.out.println();
      for (int i = 0; i < data.length - 1 ; i++) {
          for (int j = data.length - 1 ; j > i; j--) {
              /*
              * 問3
              * 以下、配列の添字を入れてソートを完成させなさい
              */
              if(data[j-1] > data[j]){
                int box = data[j-1];
                data[j-1] = data[j];
                data[j] = box;
              }
          }
      }
      for(int i = 0; i < data.length; i++){
          System.out.print(data[i] + " ");
      }
  }
}

/* 
* １回目だと30行目で、変数boxに7を入れる　31行目でj-1にあった７はjになる。つまり５。右辺を代入するから。
* このままだと、両方５になるので、32行目でdata[j]を変数boxに預けていた7に戻して入れ替えを行っている。
*/