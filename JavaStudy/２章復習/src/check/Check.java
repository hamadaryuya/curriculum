package check;

import constants.Constants;
//イメージは階層　それを取り込んでクラスや関数を使用できる状態にした
//パッケージ名の後に*でもOK 実行時に戻る
public class Check {
	//課題①
	//private修飾子は、現在のクラス（Checkクラスからのみアクセスできる)
	//他のクラスから呼び出すことは不可 static修飾子で唯一のものにしている
	//継承されず、オーバーライドすることも出来ない。インスタンス化をしなくても
	//クラスから直接アクセスできる。
	//static修飾子をここに記載していないとmainメソッドで、呼び起こすことが出来ない
	//static修飾子によって、インスタンス化していなくてもクラスからアクセスが可能
	private static String firstName = "濱田";
	private static String lastName = "龍也";
	
	//課題②
	//voidはメソッドの戻り値が無い時に使う
	//表示するのみで値を返していない。ただ、データを表示している。
	//printNameに先ほどの2つの変数を引数としていれる
	//そして、その2つの引数を変数sumNameに代入
	//要は、printNameという動作の型に何をするかというのを記述している。
	//別にsumNameに代入をしなくても、入力していた引数に代入をすれば表示はできる
	//なぜ、ここでインスタンスの生成をしていないかというと、javaはmainメソッドから
	//読み込まれて、このprintNameが読み取られないからmainに書いている
	private void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド  → " + firstName + lastName);
	}
	public static void main(String[] args) {
		//インスタンスを生成。ここに記述する理由は、mainメソッドから読み込むため
		Check nm = new Check();
		//これが、インスタンスの実体が実際に動作を行う指示。ここで、printNameの上に処理が向かう
		nm.printName(firstName,lastName);
		//課題③
		//同様にインスタンスを生成。この実体がメソッドを行うが、定数は、別のパッケージにあるので
		//それをインストールしている。他クラスのアクセスには、クラス名.フィールド変数で指定している。
		Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		//最終的にインスタンス作成した実体で、Petクラスの動作を指示している。
		pt.introduce();
		rp.introduce();
	}
}

