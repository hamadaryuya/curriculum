package check;

public class Pet {
	//privateのnameというデータを宣言している
    private String name;
    private String masterName;

    public Pet(String name, String masterName) {
    	//thisはこのクラスのインスタンスであることを明示している
    	//このクラスのnameをnameの引数にしている
        this.name = name;
        this.masterName = masterName;
    }
    
    //Petクラスを継承しているサブクラスここではRoboPetでも使用できるようにprotected
    protected String getName() {
        return name;
    }

    protected String getMasterName() {
        return masterName;
    }

    public void introduce() {
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }
}

class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
    	//元の親クラスのインスタンスであることを明示
        super(name, masterName);
    }

    public void introduce() {
        System.out.println("◇私はロボット。名前は" + getName() + "。");
        System.out.println("◇ご主人様は" + getMasterName() + "。");
    }
}
