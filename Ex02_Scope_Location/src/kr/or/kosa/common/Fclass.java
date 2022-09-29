package kr.or.kosa.common;


/*
±â´É (ÇàÀ§) ¸¸µå´Â ¹æ¹ý
ÇÔ¼ö (method)

 method : ÇàÀ§ ¶Ç´Â ±â´ÉÀÇ ÃÖ¼Ò´ÜÀ§·Î ±¸Çö : ÇÏ³ªÀÇ ÇÔ¼ö´Â ÇÏ³ªÀÇ ±â´É¸¸ ±¸Çö 
 ex ¸Ô´Â´Ù,  ÀÜ´Ù, °È´Â´Ù ... 
 
 Å¬·¡½º : field + method
 
 ex) ·Ôµ¥¿ùµå : °ÔÀÓ¹æ : ³ó±¸, µ¿Àü, »Ì±â .... 

***method ÇÔ¼ö´Â È£Ãâ¿¡ ÀÇÇØ¼­¸¸ µ¿ÀÛµÈ´Ù***
´©±º°¡ ÀÌ¸§À» ºÎ¸£Áö ¾ÊÀ¸¸é µ¿ÀÛÇÏÁö ¾Ê´Â´Ù ...!

			JAVA) 
			<void´Â ½ÇÇàÇØµµ ¹¹ ¾ÈÁÜ>
			1.void , parameter(0) : void print(String str){½ÇÇàÄÚµå}
			2.void , parameter(x) : void [print() {½ÇÇàÄÚµå} >> °øÂ¥ ()ÀÌ´Ï±î
			<returnÀº °á°ú¸¦ ÁÜ>
			3. return type , parameter(0) : int print(int data) {return 100;}
			4.return type , parameter(x) : int print() {return 100;} °øÂ¥

***void > µ¹·ÁÁÖ´Â°Ô ¾ø¾î¿ä > return type ¾ø¾î¿©
return type >> ±âº» 8°¡Áö + String  + array , class , collection , interface
ÀÌÁß¿¡¼­ ±âº» 8°¡Áö + String + class ±îÁö´Â ÀÎÁ¤ÇÏÀÚ

boolean print(return true or false)
Car print() { Car c = new Car(); return c; }  //³ª´Â ´ç½Å¿¡°Ô Car¶ó°íÇÏ´Â °´Ã¼ÀÇ ÁÖ¼Ò¸¦ return ÇÑ´Ù 
String print() ¹®ÀÚ¿­À» ¸®ÅÏ {return "A";}

parameter type >> void print(String ÆÄ¶ó¸ÞÅÍ) 
>> ±âº» 8°¡Áö Å¸ÀÔ + SString + array , class ,collection , interface
void print(int i){}
void print(String str){}
void print(Car car) // printÇÔ¼ö´Â parameter CarÅ¸ÀÔÀÇ ÁÖ¼Ò°ªÀ» ¹Þ´Â´Ù




ex)
Car car = new Car();

void print(Car car(){}
print (c); //print ÇÔ¼ö È£­Œ½Ã c¶ó´Â º¯¼ö°ª (ÁÖ¼Ò°ª)

¾î·Á¿ö¿ä : µ¿Àü±¸¸ÛÀÌ ¿©·¯°³ ÀÖ¾î ....
void print(int a, int b =, int c , int d){}
print(10,20)(x)
print(100,100,100)(x)
print(100,100,100,100)(o) 4°³¿©¾ß ÇÔ
void print(Car c, String str, int i){}

 °ü¿ëÀûÀÎ Ç¥Çö
 ÄÚµå ±ÔÄ¢ : °ü¿ëÀûÀÎ °Íµé
 class ÀÌ¸§ÀÇ Ã¹±ÛÀÚ´Â ´ë¹®ÀÚ : class Car , class Person
 methodÀÇ ÀÌ¸§Àº ´Ü¾îÀÇ Ã¹±ÛÀÚ ¼Ò¹®ÀÚ ÀÌ¾îÁö´Â ´Ü¾îÀÇ Ã¹±ÛÀÚ´Â ´ë¹®ÀÚ : getNumber()
 
 »ç¿ø¹øÈ£¸¦ °¡Áö°í »ç¿øÀÇ ¸ðµç Á¤º¸¸¦ °¡Áö°í ¿Í¶ó(ÇÔ¼ö»ý¼º)
 getEmpKistByEmpno >> Å¬·¡½º ÀÌ¸§Àº µüº¸°í ´ë·«ÀûÀ¸·Î ¾Ë¼ö ÀÖÀ» Á¤µµ·Î Áö¾î¶ó ±æ°Ô Àû¾îµµ µÈ´Ù 
 
 
 */
public class Fclass {
	public int data;
	
	//void m() >> ÄÄÆÄÀÏ·¯°¡ default void m() >> °°Àº Æú´õ ³»¿¡¼­¸¸ »ç¿ë °¡´É 
	//ÇÔ¼ö´Â 70%Á¤µµ°¡ public
	//ÇÔ¼ö 30% private : ¿Ö? ¾µ¼ö¾ø´Âµ¥ ¿Ö? -> Hint) public°ú privateÀº °°Àº Å¬·¡½º ³»¿¡¼­´Â µ¿µîÇÏ´Ù
	//Å¬·¡½º ³»ºÎ¿¡¼­¸¸ »ç¿ëÇØ¶ó >> ÀÌ·± ¿ëµµÀÇ ÇÔ¼ö >> °øÅëÇÔ¼ö >> ´Ù¸¥ ÇÔ¼ö¸¦ µµ¿ÍÁÖ´Â ÇÔ¼ö
	
	public void m() { //void, parameter°¡ ¾ø´Â
		//±â´É ±¸Çö
		//main ÇÔ¼ö¿¡¼­ ¼­¿ëÇß´ø ÄÚµå ±×´ë·Î ±¸Çö ...
		System.out.println("ÀÏ¹ÝÇÔ¼ö : void, parameter(x)");
	}
	
	
	//void m2(int)
	public void m2(int i) { //¿©±â¼­ int i°¡ ¹Ù·Î ÆÄ¶ó¸ÞÅÍ Ex02_Method_Call¿¡¼­ Á¤¼ö°ªÀ» °°ÀÌ ÀÔ·ÂÇØÁà¾ß ½ÇÇàµÊ
		System.out.println("ÀÏ¹ÝÇÔ¼ö : void, parameter(0)");
		System.out.println("parameter °ªÀº È°¿ë  iº¯¼ö´Â ÇÔ¼ö ³»ºÎ¸¸ À¯È¿ : " + i);
	}
	
	//return type m3 (x)
	public int m3() {
		//¹«Á¶°Ç °­Á¦·Î
		return 1000; //return typeÀÌ Á¸ÀçÇÏ¸é ¤¤¹Ýµå½Ã return Å°¿öµå ¸í½Ã ÇÊ¼ö**
	}
	
	public int m4(int data) {
		return 100 + data;
	}
	//¿©±â±îÁö°¡ ±âº»À¯Çü
	
	//È®Àå À¯Çü
	//reteun type(o) , parameter(o) ´ÜÁö °¹¼ö Â÷ÀÌÀÏ»Ó...
	public int sum(int i, int j, int k) {
		return i + j + k;
	}
	
	//ÇÔ¼öÀÇ Á¢±ÙÀÚ
	//default int subSum(){}  °°Àº Æú´õ µÊ
	//private int subSum(){}  °°Àº Æú´õµµ ¾ÈµÇ¿ä
	// class ³»ºÎ¿¡¼­ ´Ù¸¥ ÇÔ¼ö¸¦ µµ¿ÍÁÖ´Â °øÅëÇÔ¼ö
	//private ÇÔ¼ö ¸¸µé¾î¼­ »ç¿ëÇÑ´Ù
	
	private int subSum(int i) { //´Ù¸¥ ÇÔ¼ö°¡ È£ÃâÇØ¼­ »ç¿ë ...
		return i + 100;          //·ÎÁ÷ÀÌ ¸ðµç ÇÔ¼ö°¡ °¡Áö°í ÀÖ´Ù¸é .. º¯°æ ... ¿ìÁöº¸¼ö¤Ñ ..
	}
	public void callSuvSum() {
		//ÇÔ¼ö´Â ´Ù¸¥ ÇÔ¼ö¸¦ È£ÃâÇÒ¼ö ÀÖ´Ù
		int result = subSum(100);
		System.out.println("call result : " + result); 
		//callSuvSum°¡ subSumÀ» È£ÃâÇÏ°í °ªÀ» Àû¿ëÇØ¼­ °á°ú¸¦ ³ªÅ¸³»´Âµ¥ ±×°Ô Ex02_Method_CallÆÄÀÏ¿¡¼­ ³ªÅ¸³²
	}
	
	private int operationMethod(int data) {
		return data * 200;
	}
	public int opSum(int data) {
		int result = operationMethod(data);
		//Á¦¾î¹®
		if(result > 0) {
			return 1;
		} else {
			return -1;
		}
	}
	
	//Quiz
//	a ¿Í b µÑÁß¿¡ Å«°ªÀ» return ÇÏ´Â ÇÔ¼ö¸¦ ¸¸µå¼¼¿ä
//	ex)ÇÔ¼ö È£Ãâ½Ã max(10,5) return°ªÀº 10ÀÌ ³ª¿À¸é µÊ
	
	
	public int maxminimum(int i, int j) {
		//30Á¡
		if (i > j) {
			return i;
		} else {
			return j;
		}
		
		//60Á¡ (returnÀ» ÇÑ°³¸¸, ³ªÁß¿¡ ¼öÁ¤ ÆíÇÔ)
//		int result=0;
//		if(i > j) {
//			result = i;
//		}else {
//			result = j;
//		}
//		return result;
		
		//90Á¡
//		int maxminimum = (i>j) ? i : j;
//		return maxminimum;
		
		//100Á¡
//		return (i>j) ? i : j;
	}
	
}
