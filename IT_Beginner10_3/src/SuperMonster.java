
public class SuperMonster extends Monster {

	//　追加フィールド
	private int poisonAt;
	private int poisonCount;
	
	//　getterとsetter
	public int getPoisonAt() {
		return this.poisonAt;
	}
	
	public void setPoisonAt(int poisonAt) {
		this.poisonAt = Math.max(poisonAt, 0);
	}
	
	public int getPoisonCount() {
		return this.poisonCount;
	}
	
	public void setPoisonCount(int poisonCount) {
		this.poisonCount = Math.max(poisonCount, 0);
	}
	
    //　コンストラクタ
    public SuperMonster(String name, int hp, int at, int df, int poisonAt, int poisonCount) {
    	super(name, hp, at, df);
    	setPoisonAt(poisonAt);
    	setPoisonCount(poisonCount);
    }

	//　追加メソッド
	//　毒攻撃(vs 勇者)
	public void attack(Hero hero) {
		super.attack(hero);
		if(this.poisonCount > 0) {
	        System.out.println(this.getName() + "の毒攻撃！");
	        System.out.println(hero.getName() + "に追加ダメージを" + this.poisonAt + "与えた！");
	        hero.takeDamage(this.poisonAt);
	        this.poisonCount --;
	        System.out.println("残り毒攻撃回数:" + this.poisonCount);
		}else {
			System.out.println(this.getName() + "は毒攻撃を使えない！");
		}
	}

	// 毒攻撃（vs 魔法使い）
	public void attack(Magician magician) {
		super.attack(magician);
		if(this.poisonCount > 0) {
	        System.out.println(this.getName() + "の毒攻撃！");
	        System.out.println(magician.getName() + "に追加ダメージを" + this.poisonAt + "与えた！");
	        magician.takeDamage(this.poisonAt);
	        this.poisonCount --;
	        System.out.println("残り毒攻撃回数:" + this.poisonCount);
		}else {
			System.out.println(this.getName() + "は毒攻撃を使えない！");
		}
	}

}
