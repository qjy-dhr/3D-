package 福彩类游戏;
import java.util.Scanner;

import java.util.Random;
class ThreeDLottery{
    private int[] winNumber;

 ThreeDLottery(int[] winNumber){
  this.winNumber=winNumber;
 }
 public int[] getWinNumber() {
  return winNumber;
 }
}
class Sum extends ThreeDLottery{
	Sum(int[] winNumber){
		super(winNumber);
	}
	 int getWins(int userNumber){
		  //在此实现彩票金额返回
		  int sum1=0;
		  int sum2;
		  sum2=userNumber;
		  for(int i=0;i<3;i++) {
		   sum1+=getWinNumber()[i];
		  }
		  if(sum1==sum2) {
		   if(sum2==0||sum2==27) 
		           return 1040;
		   else if(sum2==1||sum2==26) 
		             return 345;
		   else if(sum2==2||sum2==25) 
		             return 172;
		   else if(sum2==3||sum2==24) 
		             return 104;
		   else if(sum2==4||sum2==23) 
		             return 69;
		   else if(sum2==5||sum2==22) 
		             return 49;
		   else if(sum2==6||sum2==21) 
		             return 37;
		   else if(sum2==7||sum2==20) 
		             return 29;
		   else if(sum2==8||sum2==19) 
		             return 23;
		   else if(sum2==9||sum2==18) 
		             return 19;
		   else if(sum2==10||sum2==17) 
		             return 16;
		   else if(sum2==11||sum2==16) 
		             return 15;
		   else if(sum2==12||sum2==15) 
		             return 15;
		   else if(sum2==13||sum2==14) 
		             return 14;
		   else return 0;
		  }
		  else
		  return 0;
		 }
	
	
}
class Single extends ThreeDLottery{
	Single(int[] winNumber){
		super(winNumber);
	}
	int singlewin(int[] userNumber) {
		if(userNumber[0]==getWinNumber()[0]&&userNumber[1]==getWinNumber()[1]&&userNumber[2]==getWinNumber()[2]) {			
			return 1040;
		}
		else return 0;	
	}
}
class Oned extends ThreeDLottery{
     Oned(int[] winNumber){
		super(winNumber);
	}
     int Onedwin(String userNumber) {
    	 int i;
    	 for(i=0;i<3;i++) {
    		 if(userNumber.charAt(i)=='*')
    			 continue;
    		 else 
    			 break;
    	 }
    	if(userNumber.charAt(i)-'0'==getWinNumber()[i]) 
    	 return 10;
    	else return 0;	 
     }	
}
class General extends ThreeDLottery{
	General(int[] winNumber){
		super(winNumber);
	}
    int Generalwin(int[] userNumber) {
   	 int pan=0;
   	 for(int i=0;i<3;i++) {
   	    if(userNumber[i]!=getWinNumber()[i]) {
   	    	pan=1;
   	    	break;  	    	
   	    }
   	 }
   	if(pan==1) {
   		if((userNumber[0]==getWinNumber()[0]&&userNumber[1]==getWinNumber()[1])||(userNumber[0]==getWinNumber()[0]&&userNumber[2]==getWinNumber()[2]||(userNumber[1]==getWinNumber()[1]&&userNumber[2]==getWinNumber()[2])))
   		{
   			return 21;
   			
   		}
   		else return 0;
   	}
   	else return 470;
    }   
}
class Group extends ThreeDLottery{
	 Group(int[] winNumber){
			super(winNumber);
		}
	 Boolean equal(int[] a,int b1,int b2,int b3) {
		 Boolean t=true;
		 int b[]=new int[3];
		 b[0]=b1;
		 b[1]=b2;
		 b[2]=b3;
		 for(int i=0;i<3;i++) {
			 if(a[i]==b[i]) {
				 continue;}
			 else {
				 t=false;
				 break;
			 }		 
		 }
		 return t;
	 }
	int Groupwin(int[] userNumber) {
		int temp=6;//判断是组3还是组6
		if(getWinNumber()[0]==getWinNumber()[1]||getWinNumber()[1]==getWinNumber()[2]||getWinNumber()[0]==getWinNumber()[2]) {			
			temp=3;
		}
		if(equal(userNumber,getWinNumber()[0],getWinNumber()[1],getWinNumber()[2])||equal(userNumber,getWinNumber()[0],getWinNumber()[2],getWinNumber()[1])||equal(userNumber,getWinNumber()[1],getWinNumber()[0],getWinNumber()[2])||equal(userNumber,getWinNumber()[1],getWinNumber()[2],getWinNumber()[0])||equal(userNumber,getWinNumber()[2],getWinNumber()[1],getWinNumber()[0])||equal(userNumber,getWinNumber()[2],getWinNumber()[0],getWinNumber()[1])) {
			if(temp==3) {
				return 346;
			}
			else return 173;
		}
		else return 0;
		
		
	}
}
class Guess2D extends ThreeDLottery{
	Guess2D(int[] winNumber){
		super(winNumber);
	}
int Guess2Dwin(int[] userNumber) {
	if(userNumber[0]==userNumber[1])
	{
		if((userNumber[0]==getWinNumber()[0]&&getWinNumber()[0]==getWinNumber()[1])||(userNumber[0]==getWinNumber()[0]&&getWinNumber()[0]==getWinNumber()[2])||(userNumber[0]==getWinNumber()[1]&&getWinNumber()[2]==getWinNumber()[1])) {
			return 37;
		}
		else 
			return 0;
		
	}
	else
	 {
		if((userNumber[0]==getWinNumber()[0]&&userNumber[1]==getWinNumber()[1])||(userNumber[0]==getWinNumber()[0]&&userNumber[1]==getWinNumber()[2])||(userNumber[0]==getWinNumber()[1]&&userNumber[1]==getWinNumber()[1])||(userNumber[1]==getWinNumber()[1]&&userNumber[0]==getWinNumber()[2])||(userNumber[1]==getWinNumber()[0]&&userNumber[0]==getWinNumber()[1])||(userNumber[0]==getWinNumber()[0]&&userNumber[1]==getWinNumber()[2])) {
			return 19;
		}
		else return 0;
	}
	
}
}
class Guess1D extends ThreeDLottery{
	Guess1D(int[] winNumber){
		super(winNumber);
	}
int Guess1Dwin(int userNumber) {
	if(getWinNumber()[0]==userNumber&&getWinNumber()[1]==getWinNumber()[2]&&getWinNumber()[0]==getWinNumber()[2]) {
		return 230;	
	}
	else if((getWinNumber()[0]==userNumber&&getWinNumber()[0]==getWinNumber()[1])||(getWinNumber()[0]==userNumber&&getWinNumber()[0]==getWinNumber()[2])||(getWinNumber()[1]==userNumber&&getWinNumber()[2]==getWinNumber()[1]))
	{
		return 12;
	}
	else if(getWinNumber()[0]==userNumber||getWinNumber()[1]==userNumber||getWinNumber()[2]==userNumber) {
		return 2;
	}
	else return 0;
}

}

class Tractor extends ThreeDLottery{
	Tractor(int[] winNumber){
		super(winNumber);
	}
	int tractorwin() {
		int temp=getWinNumber()[0]*100+getWinNumber()[1]*10+getWinNumber()[2];
		if(temp!=890&&temp!=98&&temp!=901&&temp!=109) {
			if(getWinNumber()[0]==getWinNumber()[1]+1&&getWinNumber()[1]==getWinNumber()[2]+1) {
				return 65;
			}
			else if(getWinNumber()[0]+1==getWinNumber()[1]&&getWinNumber()[1]+1==getWinNumber()[2]) {
				return 65;
			}
			else return 0;
		}
		else return 0;
	}
}
class Package extends ThreeDLottery{
	Package(int[] winNumber){
		super(winNumber);
	}
	 Boolean equal(int[] a,int b1,int b2,int b3) {
		 Boolean t=true;
		 int b[]=new int[3];
		 b[0]=b1;
		 b[1]=b2;
		 b[2]=b3;
		 for(int i=0;i<3;i++) {
			 if(a[i]==b[i]) {
				 continue;}
			 else {
				 t=false;
				 break;
			 }		 
		 }
		 return t;
	 }
	int packagewin(int[] userNumber) {
		if(getWinNumber()[0]==getWinNumber()[1]||getWinNumber()[1]==getWinNumber()[2]||getWinNumber()[2]==getWinNumber()[0]) {
			if(getWinNumber()[0]==userNumber[0]&&getWinNumber()[1]==userNumber[1]&&getWinNumber()[2]==userNumber[2]) {
				return 693;		
			}
			else if(equal(userNumber,getWinNumber()[0],getWinNumber()[1],getWinNumber()[2])||equal(userNumber,getWinNumber()[0],getWinNumber()[2],getWinNumber()[1])||equal(userNumber,getWinNumber()[1],getWinNumber()[0],getWinNumber()[2])||equal(userNumber,getWinNumber()[1],getWinNumber()[2],getWinNumber()[0])||equal(userNumber,getWinNumber()[2],getWinNumber()[1],getWinNumber()[0])||equal(userNumber,getWinNumber()[2],getWinNumber()[0],getWinNumber()[1])) {
				return 173;
		}
			else return 0;				
	}
		else {
			if(getWinNumber()[0]==userNumber[0]&&getWinNumber()[1]==userNumber[1]&&getWinNumber()[2]==userNumber[2]) {
				return 606;		
			}
			else if(equal(userNumber,getWinNumber()[0],getWinNumber()[1],getWinNumber()[2])||equal(userNumber,getWinNumber()[0],getWinNumber()[2],getWinNumber()[1])||equal(userNumber,getWinNumber()[1],getWinNumber()[0],getWinNumber()[2])||equal(userNumber,getWinNumber()[1],getWinNumber()[2],getWinNumber()[0])||equal(userNumber,getWinNumber()[2],getWinNumber()[1],getWinNumber()[0])||equal(userNumber,getWinNumber()[2],getWinNumber()[0],getWinNumber()[1])) {
				return 86;
			}
			else return 0;
		}	
	
}
	}
class Guesssame extends ThreeDLottery{
	Guesssame(int[] winNumber){
		super(winNumber);
	}
	int samewin() {
		Boolean temp=false;
if(getWinNumber()[0]==getWinNumber()[1]&&getWinNumber()[2]==getWinNumber()[1]) {
	temp=true;
}
		if(temp) {
			
				return 104;
		}
		else {
			return 0;
		}
	}	
}
class Guesssize extends ThreeDLottery{
	Guesssize(int[] winNumber){
		super(winNumber);
	}
	int sizewin(String userNumber) {
		int temp=0;
		for(int i=0;i<3;i++) {
			temp+=getWinNumber()[i];
		}
		if(userNumber.equals("small")) {
			if(temp>=0&&temp<=8) {
				return 6;			
			}
			else return 0;
		}
		else {
			if(temp>=19&&temp<=27) {
				return 6;			
			}
			else return 0;
			
		}
		
	}	
}
class Odevity extends ThreeDLottery{
	Odevity(int[] winNumber){
		super(winNumber);
	}
	int Odevitywin(String userNumber) {
		int temp=2;
if(getWinNumber()[0]%2==0&&getWinNumber()[1]%2==0&&getWinNumber()[2]%2==0) {
	temp=0;
}
else if(getWinNumber()[0]%2==1&&getWinNumber()[1]%2==1&&getWinNumber()[2]%2==1) {
	temp=1;
}
else {
	temp=2;
}
	if(temp==0) {
		if(userNumber.equals("even")) {
			return 8;
		}
		else return 0;
	}
	
	else if(temp==1) {
		if(userNumber.equals("even")) {
			return 0;
		}
		else return 8;
	} 
	else return 0;
	}	
}
class Towd extends ThreeDLottery{
	Towd(int[] winNumber){
		super(winNumber);
	}
	int Towdwin(String userNumber) {
		Boolean temp=true;
	for(int i=0;i<3;i++) {
		if(userNumber.charAt(i)!='*')
		{
			if(userNumber.charAt(i)-'0'!=getWinNumber()[i])
			temp=false;	
		}
	}
	if(temp==true) {
		return 104;
	}
	else return 0;
	}	
}
public class Main {
public static void main(String[] arg){
  //在此实现测试代码
	/*Scanner sc=new Scanner(System.in);
	int single=sc.nextInt();
	int n=sc.nextInt();
	 int a[]=new int[3];  
	  a[0]=single/100;
	    a[1]=(single-a[0]*100)/10;
	    a[2]=single-a[0]*100-a[1]*10;
	    int max=1;
	    String str; 
	    for(int i=0;i<n;i++) {
	    	//System.out.println("zhixng1");   
	    	str=sc.next(); 
	    	if(str.equals("single")) {
	    		//System.out.println("zhixng");
	    		int h=sc.nextInt();
	    		 int b[]=new int[3];
	    		b[0]=h/100;
	    	    b[1]=(h-b[0]*100)/10;
	    	    b[2]=h-b[0]*100-b[1]*10;
	    	    Single s=new Single(a);
	    		max=Math.max(max,s.singlewin(b));	    	    
	    	}
	    	else if(str.equals("tractor")) {
	    		Tractor t=new Tractor(a);
	    		max=Math.max(max,t.tractorwin());		
	    	}
	    	else if(str.equals("package")) {
	    		int h=sc.nextInt();
	    		 int b[]=new int[3];
	    		b[0]=h/100;
	    	    b[1]=(h-b[0]*100)/10;
	    	    b[2]=h-b[0]*100-b[1]*10;
	    		Package p=new Package(a);
	    		max=Math.max(max,p.packagewin(b));
	    	}
	    	else if(str.equals("sum")) {
	    		int h=sc.nextInt();
	    		
	    		ThreeDLottery th=new ThreeDLottery(a);
	    		max=Math.max(max,th.getWins(h));	
	    	}
            else if(str.equals("guess1d")) {
            	int h=sc.nextInt();
            	Guess1D gu=new Guess1D(a);
            	max=Math.max(max,gu.Guess1Dwin(h));
	    	}
	    	else if(str.equals("general")) {
	    		int h=sc.nextInt();
	    		 int b[]=new int[3];
	    		b[0]=h/100;
	    	    b[1]=(h-b[0]*100)/10;
	    	    b[2]=h-b[0]*100-b[1]*10;
	    		General g=new General(a);   		
	    		max=Math.max(max,g.Generalwin(b));
	    	}
	    	else if(str.equals("oned")) {
	    		 String oned;
	    		 oned=sc.nextLine();
	    		 Oned o=new Oned(a);
	    		 max=Math.max(max,o.Onedwin(oned));
	    	}   
	    	
	    		 	
	    }
	  System.out.println(max);
	    		
	 */   	Scanner sc=new Scanner(System.in);
	int money=1000;
	String str1;
	System.out.println("欢迎来到游戏，是否打开玩法介绍，Yes或者No");
	  str1=sc.next();
	  if(str1.equals("Yes")) {
		  System.out.println("可选择 SingleChoose:200元/次");
		  System.out.println("      GroupChoose:100元/次");
		  System.out.println("      OneDChoose:5元/次");
		  System.out.println("      Guess1DChoose:10元/次");
		  System.out.println("      TowdChoose:元/50次");
		  System.out.println("      Guess2DChoose:10元/次");
		  System.out.println("      GeneralChoose:200元/次");
		  System.out.println("      SumChoose:40元/次");
		  System.out.println("      PackageChoose:200元/次");
		  System.out.println("      GuessSizeChoose:1元/次");
		  System.out.println("      GuessSameChoose:10元/次");
		  System.out.println("      OdevityChoose:10元/次");
		  System.out.println("      TractorChoose:10元/次");
	  }
	while(money>0) {
		  System.out.printf("您现在有%d元",money);
		  System.out.println();
  String str;
  while(true){
	  System.out.println("请输入投注方式");
	  str=sc.next();
	  if(str.equals("OdevityChoose")||str.equals("GuessSameChoose")||str.equals("GuessSizeChoose")||str.equals("Guess2DChoose")||str.equals("SingleChoose")||str.equals("OneDChoose")||str.equals("GroupChoose")||str.equals("Guess1DChoose")||str.equals("TowdChoose")||str.equals("GeneralChoose")||str.equals("SumChoose")||str.equals("PackageChoose")||str.equals("TractorChoose"))
	  {
	 break;	  
	  }
	  else 
	  {
		  System.out.println("您输入的投注方式不存在，请重新输入");
		  continue;		  
	  }
  }
  Random r=new Random();
  int b[]=new int[3];
  b[0]=r.nextInt(10);
  b[1]=r.nextInt(10);
  b[2]=r.nextInt(10);
  System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
  System.out.println();
  
  if(str.equals("SingleChoose")&&money>=200) {
	  money-=600;
	  int single=0;
	  while(true) {
		  System.out.println("请输入0-999之间的整数");
	  single=sc.nextInt();
	   if(single>=0&&single<=999) {
		  break;
	  }
	  else {
		  System.out.println("请输入正确的投注内容");
		  continue;
		  }	  
	  }
	  int a[]=new int[3];  
	  a[0]=single/100;
	    a[1]=(single-a[0]*100)/10;
	    a[2]=single-a[0]*100-a[1]*10;
	    
	 Single s=new Single(b);
	 System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
	 System.out.println("您获得的奖金为 "+(s.singlewin(a)));
	 money+=s.singlewin(a);
  }
  
  else if(str.equals("GuessSameChoose")&&money>=10) {
	  money-=10;
	  Guesssame g=new Guesssame(b);
	  System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
		 System.out.println("您获得的奖金为 "+(g.samewin()));
		 money+=g.samewin();
  }
  else if(str.equals("OdevityChoose")&&money>=10) {
	  money-=10;
	  String obevity;
	  while(true) {
		  System.out.println("请输入选奇数还是偶数，even或者odd");
		  obevity=sc.next();	
		if(obevity=="even"||obevity=="odd") {
			System.out.println("请输入正确的投注内容");
			continue;
		}  
		else {
			Odevity o=new Odevity(b);
			System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
			  System.out.println();
			 System.out.println("您获得的奖金为 "+(o.Odevitywin(obevity)));
			 money+=o.Odevitywin(obevity);
			break;
		}  
	  }	  
	  
  }
  else if(str.equals("GuessSizeChoose")&&money>=1) {
	  money-=1;
	  String size;
	  while(true) {
		  System.out.println("请输入选大还是选小，small或者big");
		  size=sc.next();	
		if(size=="small"||size=="big") {
			System.out.println("请输入正确的投注内容");
			continue;
		}  
		else {
			Guesssize g=new Guesssize(b);
			System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
			  System.out.println();
			 System.out.println("您获得的奖金为 "+(g.sizewin(size)));
			 money+=g.sizewin(size);
			break;
		}  
	  }	  
	  
  }
  
  else if(str.equals("PackageChoose")&&money>=200) {
	  money-=200;
	  int packag=0;
	  while(true) {
		  System.out.println("请输入0-999之间的整数");
		  packag=sc.nextInt();
	   if(packag>=0&&packag<=999) {
		  break;
	  }
	  else {
		  System.out.println("请输入正确的投注内容");
		  continue;
		  }	  
	  }
	  int a[]=new int[3];  
	  a[0]=packag/100;
	    a[1]=(packag-a[0]*100)/10;
	    a[2]=packag-a[0]*100-a[1]*10;
	  Package p=new Package(b);
	  System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
	  System.out.println("您获得的奖金为 "+(p.packagewin(a)));	
	  money+=p.packagewin(a);
  }
  else if(str.equals("TractorChoose")&&money>=10) {
	  money-=10;
	  Tractor t=new Tractor(b);
	  System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
	  System.out.println("您获得的奖金为 "+(t.tractorwin()));	  
	  money+=t.tractorwin();
  }
  else if(str.equals("OneDChoose")&&money>=5)
  {	   money-=5;
	  String oned;
			  while(true) {
				  System.out.println("请输入确定位置的一个数字，其他位输入*，例如，如果确定个位数为2，请输入**2");
			oned=sc.next();	
			int temp=0;
			for(int i=0;i<3;i++) {
		 		 if(oned.charAt(i)=='*')
		 			 temp++; 		
		 	 }
				if(temp!=2) {
					System.out.println("请输入正确的投注内容");
					continue;
				}  
				else {
					Oned o=new Oned(b);
					System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
					  System.out.println();
					 System.out.println("您获得的奖金为 "+(o.Onedwin(oned)));
money+=o.Onedwin(oned);
					break;
				}  
			  }	  
  }
  else if(str.equals("GroupChoose")&&money>=100) {
	  money-=100;
	 int group=0;
	 while(true) {
		  System.out.println("请输入0-999之间的整数");
		  group=sc.nextInt();
		  if(group>=0&&group<=999) {
			  break;
		  }
		  else {
			  System.out.println("请输入正确的投注内容");
			  continue;
			  }	   
	 }
	 int a[]=new int[3];  
	  a[0]=group/100;
	    a[1]=(group-a[0]*100)/10;
	    a[2]=group-a[0]*100-a[1]*10;
	  Group g=new Group(b);
	  System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
	  System.out.println("您获得的奖金为 "+(g.Groupwin(a)));
	  money+=g.Groupwin(a);
	  
  }
  else if(str.equals("Guess2DChoose")&&money>=10) {
	  money-=10;
	  int guess2d=0;
	  while(true) {
		  System.out.println("请输入两个0-9之间的整数，可以相同");
		  guess2d=sc.nextInt();
		  if(guess2d>=0&&guess2d<=99) {
			  break;
		  }
		  else {
			  System.out.println("请输入正确的投注内容");
			  continue;
			  }	   
	 }
	  int a[]=new int[3];  
	  a[0]=guess2d/10;
	  a[1]=guess2d-a[0]*10;
	  Guess2D gu2=new Guess2D(b);
	  System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
	  System.out.println("您获得的奖金为 "+(gu2.Guess2Dwin(a)));
	  money+=gu2.Guess2Dwin(a);
		}   
  else if(str.equals("Guess1DChoose")&&money>=10) {
	  money-=10;
  int guess1d=0;
  while(true) {
	  System.out.println("请输入0-9之间的整数");
	  guess1d=sc.nextInt();
	  if(guess1d>=0&&guess1d<=9) {
		  break;
	  }
	  else {
		  System.out.println("请输入正确的投注内容");
		  continue;
		  }	   
 }
  Guess1D gu=new Guess1D(b);
  System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
  System.out.println();
  System.out.println("您获得的奖金为 "+(gu.Guess1Dwin(guess1d)));
  money+=gu.Guess1Dwin(guess1d);
	}   
  else if(str.equals("TowdChoose")&&money>=50)
  {
	  money-=50;
	  String towd;
	  while(true) {
		  System.out.println("请输入确定位置的两个数字，其他位输入*，例如，*32");
		  towd=sc.next();	
	int temp=0;
	for(int i=0;i<3;i++) {
 		 if(towd.charAt(i)=='*')
 			 temp++;
 	 }
		if(temp!=1) {
			System.out.println("请输入正确的投注内容");
			continue;
		}  
		else {
			Towd t=new Towd(b);
			System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
			  System.out.println();
			 System.out.println("您获得的奖金为 "+(t.Towdwin(towd)));
			 money+=t.Towdwin(towd);
			break;
		}  
	  }	  	  
  }
  else if(str.equals("SumChoose")&&money>=40) {
	  money-=40;
	  int sum;
	  while(true) {
		  System.out.println("请输入0-27之间的整数");
		  sum=sc.nextInt();
		  if(sum>=0&&sum<=27) {
			  break;
		  }
		  else {
			  System.out.println("请输入正确的投注内容");
			  continue;
			  }	   
	 }
	  Sum th=new Sum(b);
	  System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
	  System.out.println("您获得的奖金为 "+(th.getWins(sum)));
	  money+=th.getWins(sum);
	  
  }
  else if(str.equals("GeneralChoose")&&money>=200) {
	  money-=200;
	  int general=0;
	  while(true) {
		  System.out.println("请输入0-999之间的整数");
		  general=sc.nextInt();
	   if(general>=0&&general<=999) {
		  break;
	  }
	  else {
		  System.out.println("请输入正确的投注内容");
		  continue;
		  }	  
	  }
	  int a[]=new int[3];  
	  a[0]=general/100;
	    a[1]=(general-a[0]*100)/10;
	    a[2]=general-a[0]*100-a[1]*10;
	    
	    General g=new General(b);
	    System.out.printf("中奖号为：%d %d %d",b[0],b[1],b[2]);
	    System.out.println();
	 System.out.println("您获得的奖金为 "+(g.Generalwin(a)));	 
	 money+=g.Generalwin(a);
  } 
  else {
	  String str3;
	  System.out.println("哈哈你买不起!");
	  System.out.println("是否继续下注！ Yes或者No");
	  str3=sc.next();
	  if(str3.equals("Yes")) {
		  continue;
	  }
	  else {
		  break;
	  }
  }
 }
	System.out.println("游戏结束!");
}
}
