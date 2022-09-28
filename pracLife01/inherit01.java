package pracLife01;

public class inherit01 {

	class Mushroom{  //버섯
		boolean fungus;  // 균류인지, 아닌지
	}
//	------------------------------------------------------------------------
	class EatableMushroom extends Mushroom{ //식용버섯
		boolean eatable;  //먹을 수 있는지, 아닌지
	}
	
	class YellowEgg extends EatableMushroom{  //노란달걀버섯
		String color;  //색깔
	}
	
	class BrownPineCone extends EatableMushroom{  //갈색솔방울버섯
		int size;  //갈색솔방울 버섯의 크기
	}
//	------------------------------------------------------------------------
	class MediMushroom extends Mushroom{  //약용버섯
		boolean medi;  //약으로 쓰이는지, 아닌지
	}
	
	class Cordyceps extends MediMushroom{  //동충하초
		boolean lifeinbug;  //곤충을 숙주로 삼는지, 아닌지
	}
	
	class Reishi extends MediMushroom{  //영지버섯
		boolean polish;  //광택의 여부
	}
//	------------------------------------------------------------------------
	class PoisonMushroom{  //독버섯
		boolean poison;  //독 함유 여부
	}
	
	class PoisonFireCoral extends PoisonMushroom{  //붉은사슴뿔버섯
		boolean cure;  //해독제의 유뮤
	}
	
	class Clown extends PoisonMushroom{  //알광대버섯
		boolean contain_tricothecene;   //트리코테신이 함유되어 있는지
	}

}
