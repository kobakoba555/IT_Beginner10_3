
public class Story {

	public static void main(String args[]) {
		
		// 勇者生成
		SuperHero sh = new SuperHero("エイト", 100, 50, 30);
		System.out.println("勇者誕生！");
		System.out.println("名前：" + sh.getName());
		System.out.println("体力：" + sh.getHp());
		System.out.println("攻撃力：" + sh.getAt());
		System.out.println("防御力：" + sh.getDf());
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

		// 魔法使い生成
		SuperMagician smg = new SuperMagician("ゼシカ", 70, 50, 40, 20, 10);
		System.out.println("魔法使い誕生！");
		System.out.println("名前：" + smg.getName());
		System.out.println("体力：" + smg.getHp());
		System.out.println("MP：" + smg.getMp());		
		System.out.println("攻撃力：" + smg.getAt());
		System.out.println("防御力：" + smg.getDf());
		System.out.println("基本消費MP：" + smg.getCostMp());		
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		
		//　モンスター生成
		SuperMonster sm = new SuperMonster("ポイズンドラゴン", 300, 30, 20, 10, 2);
		System.out.println("モンスターが現れた！");
		System.out.println("名前：" + sm.getName());
		System.out.println("体力：" + sm.getHp());
		System.out.println("攻撃力：" + sm.getAt());
		System.out.println("防御力：" + sm.getDf());
		System.out.println("毒攻撃力：" + sm.getPoisonAt());
		System.out.println("毒攻撃回数：" + sm.getPoisonCount());
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

		//バトル
		System.out.println("バトル開始！");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

		//勇者の攻撃
		sh.attack(sm);
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		
		//モンスターの攻撃
		sm.attack(smg);
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

		//魔法使いの回復魔法
		smg.healMagic();
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		
		//勇者の攻撃
		sh.attack(sm);
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

		//モンスターの攻撃
		sm.attack(sh);
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		
		//魔法使いの超攻撃魔法
		smg.superMagicAttack(sm);
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

		//勇者の回復
		sh.heal();
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

		//モンスターの攻撃
		sm.attack(smg);
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		
		//魔法使いの超攻撃魔法
		smg.superMagicAttack(sm);
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

	}
}
