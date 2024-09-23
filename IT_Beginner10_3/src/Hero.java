
public class Hero {
	
	// フィールド
    private String name;  // 名前
    private int hp;       // 体力
    private int at;       // 攻撃力
    private int df;       // 防御力

    // getterとsetter
    public String getName() {
        return this.name;
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
    
    // コンストラクタ
    public Hero(String name, int hp, int at, int df) {
    	setName(name);
    	setHp(hp);
    	setAt(at);
    	setDf(df);   	
    }

    // 攻撃メソッド
    public void attack(Monster monster) {
        System.out.println(this.name + "の攻撃！");
        System.out.println(monster.getName() + "にダメージを" + this.at + "与えた！");
        monster.takeDamage(this.at);
    }

    // 防御メソッド
    public void defence() {
        this.df += 10;
        System.out.println(this.name + "は防御をした");
        System.out.println("防御力が10upし、" + this.df + "になった");
    }

    // 回復メソッド
    public void heal() {
        this.hp += 10;
        System.out.println(this.name + "は休憩した");
        System.out.println("HPが10回復し、" + this.hp + "になった");
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
