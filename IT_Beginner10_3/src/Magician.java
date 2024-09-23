
public class Magician {

	// フィールド
	private String name;	// 名前
	private int hp;			// 体力
	private int mp;			// MP
	private int at;			// 攻撃力
	private int df;			// 防御力
	private int costMp;		// 消費MP
	
    // getterとsetter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3 && name.length() <= 10) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("名前が不適切です。");
        }
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);  // 0未満の場合は0に設定
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        this.mp = Math.max(mp, 0);  // 0未満の場合は0に設定
    }

    public int getAt() {
        return this.at;
    }

    public void setAt(int at) {
        this.at = Math.max(at, 0);  // 0未満の場合は0に設定
    }

    public int getDf() {
        return this.df;
    }

    public void setDf(int df) {
        this.df = Math.max(df, 0);  // 0未満の場合は0に設定
    }

    public int getCostMp() {
        return this.costMp;
    }

    public void setCostMp(int costMp) {
        this.costMp = Math.max(costMp, 0);  // 0未満の場合は0に設定
    }
    
    //　コンストラクタ
    public Magician(String name, int hp, int mp, int at, int df, int costMp) {
    	setName(name);
    	setHp(hp);
    	setMp(mp);
    	setAt(at);
    	setDf(df);
    	setCostMp(costMp);
    }

    
    // 通常攻撃
	public void attack(Monster monster) {
		System.out.println(this.name + "の攻撃！");
		System.out.println(monster.getName() + "にダメージを" + this.at/2 + "与えた！");
		monster.takeDamage(this.at/2);
	}
	
	// 魔法攻撃
	public void magicAttack(Monster monster) {
		this.mp = this.mp - this.costMp;
		System.out.println(this.name + "の魔法攻撃！");
		System.out.println(monster.getName() + "にダメージを" + this.at + "与えた！");
		System.out.println("MPを" + this.costMp + "消費した");
		System.out.println("MP:" + this.mp);
		monster.takeDamage(this.at);
	}
	
	//　回復魔法
	public void healMagic() {		
		this.hp = this.hp + 10;
		this.mp = this.mp - this.costMp;
		System.out.println(this.name + "は回復魔法を唱えた！");
		System.out.println("MPを" + this.costMp + "消費し、体力が10回復した！！");
		System.out.println("HP:" + this.hp + " MP:" + this.mp);
	}
	
	public void heal() {//休憩
		System.out.println(this.name + "が休憩した");
		this.hp = this.hp + 10;
		this.mp = this.mp + 5;
		System.out.println("HPが10、MPが5、回復した！");
		System.out.println("HP:" + this.hp + " MP:" + this.mp);
	}
	
	   // ダメージメソッド
    public void takeDamage(int damage) {
    	this.hp -= damage;
		if(this.hp > 0) {
			System.out.println(this.name + "の残りHP:" + this.hp);
		}else {
			System.out.println(this.name + "は倒れた");
		}
    }

}
