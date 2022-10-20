/*
this : 按眉磊脚阑 啊府虐绰 this(this.empno, this.ename)
this : 积己磊甫 龋免窍绰 this(100 , red) 


惑加包拌
何葛 , 磊侥

super(泅犁 磊侥捞 何葛狼 立辟 林家蔼) : 惑加包拌俊辑狼 何葛俊 立辟且荐 乐绰 蜡老茄 规过(super 何葛按眉狼 林家蔼)

1. super >> 惑加包拌俊辑 何葛磊盔俊 立辟
2. super >> 惑加包拌俊辑 何葛狼 积己磊甫 龋免(疙矫利栏肺)

Tip)
C# : base()
java : super()
 */


class Base {
	String basename;

	Base() {
		System.out.println("Base 扁夯 积己磊 窃荐");
	}

	Base(String basename) {
		this.basename = basename;
		System.out.println("basename : " + this.basename);
	}

	void method() {
		System.out.println("何葛 method");
	}
}

class Derived extends Base {
	String dname;

	Derived() {

		System.out.println("Derived 扁夯 积己磊 窃荐");
	}

	Derived(String dname) {

		// super 何葛狼 积己磊甫 龋瓌且荐 乐绰 super
		super(dname); // 何葛 积己磊 龋免

		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	@Override
	void method() {
		System.out.println("何葛磊盔 犁沥狼");
	}
	//绢蠢朝 何葛丛 弊府况夸 -> (磊盔捞 弊府况夸)
	//蜡老茄 规过 ... super
	void pmethod() {
		super.method();  //何葛 皋家靛
		//犁沥狼等 惑怕俊辑 何葛 磊盔阑 何甫 荐 疽绰 蜡老茄 规过 : super
		
	}
}

public class Ex06_Inherit_super {

	public static void main(String[] args) {
		Derived d = new Derived("全辨悼"); // 何葛 刚历 皋葛府 棵扼啊绊 促澜 磊侥 棵扼啊绊
		d.method();  //磊侥捞 犁沥狼甫 窍瘤 臼栏搁 何葛磊盔
		
		d.pmethod();
	}

}
