package ��������Ϸ;
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
		  //�ڴ�ʵ�ֲ�Ʊ����
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
		int temp=6;//�ж�����3������6
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
  //�ڴ�ʵ�ֲ��Դ���
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
	System.out.println("��ӭ������Ϸ���Ƿ���淨���ܣ�Yes����No");
	  str1=sc.next();
	  if(str1.equals("Yes")) {
		  System.out.println("��ѡ�� SingleChoose:200Ԫ/��");
		  System.out.println("      GroupChoose:100Ԫ/��");
		  System.out.println("      OneDChoose:5Ԫ/��");
		  System.out.println("      Guess1DChoose:10Ԫ/��");
		  System.out.println("      TowdChoose:Ԫ/50��");
		  System.out.println("      Guess2DChoose:10Ԫ/��");
		  System.out.println("      GeneralChoose:200Ԫ/��");
		  System.out.println("      SumChoose:40Ԫ/��");
		  System.out.println("      PackageChoose:200Ԫ/��");
		  System.out.println("      GuessSizeChoose:1Ԫ/��");
		  System.out.println("      GuessSameChoose:10Ԫ/��");
		  System.out.println("      OdevityChoose:10Ԫ/��");
		  System.out.println("      TractorChoose:10Ԫ/��");
	  }
	while(money>0) {
		  System.out.printf("��������%dԪ",money);
		  System.out.println();
  String str;
  while(true){
	  System.out.println("������Ͷע��ʽ");
	  str=sc.next();
	  if(str.equals("OdevityChoose")||str.equals("GuessSameChoose")||str.equals("GuessSizeChoose")||str.equals("Guess2DChoose")||str.equals("SingleChoose")||str.equals("OneDChoose")||str.equals("GroupChoose")||str.equals("Guess1DChoose")||str.equals("TowdChoose")||str.equals("GeneralChoose")||str.equals("SumChoose")||str.equals("PackageChoose")||str.equals("TractorChoose"))
	  {
	 break;	  
	  }
	  else 
	  {
		  System.out.println("�������Ͷע��ʽ�����ڣ�����������");
		  continue;		  
	  }
  }
  Random r=new Random();
  int b[]=new int[3];
  b[0]=r.nextInt(10);
  b[1]=r.nextInt(10);
  b[2]=r.nextInt(10);
  System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
  System.out.println();
  
  if(str.equals("SingleChoose")&&money>=200) {
	  money-=600;
	  int single=0;
	  while(true) {
		  System.out.println("������0-999֮�������");
	  single=sc.nextInt();
	   if(single>=0&&single<=999) {
		  break;
	  }
	  else {
		  System.out.println("��������ȷ��Ͷע����");
		  continue;
		  }	  
	  }
	  int a[]=new int[3];  
	  a[0]=single/100;
	    a[1]=(single-a[0]*100)/10;
	    a[2]=single-a[0]*100-a[1]*10;
	    
	 Single s=new Single(b);
	 System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
	 System.out.println("����õĽ���Ϊ "+(s.singlewin(a)));
	 money+=s.singlewin(a);
  }
  
  else if(str.equals("GuessSameChoose")&&money>=10) {
	  money-=10;
	  Guesssame g=new Guesssame(b);
	  System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
		 System.out.println("����õĽ���Ϊ "+(g.samewin()));
		 money+=g.samewin();
  }
  else if(str.equals("OdevityChoose")&&money>=10) {
	  money-=10;
	  String obevity;
	  while(true) {
		  System.out.println("������ѡ��������ż����even����odd");
		  obevity=sc.next();	
		if(obevity=="even"||obevity=="odd") {
			System.out.println("��������ȷ��Ͷע����");
			continue;
		}  
		else {
			Odevity o=new Odevity(b);
			System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
			  System.out.println();
			 System.out.println("����õĽ���Ϊ "+(o.Odevitywin(obevity)));
			 money+=o.Odevitywin(obevity);
			break;
		}  
	  }	  
	  
  }
  else if(str.equals("GuessSizeChoose")&&money>=1) {
	  money-=1;
	  String size;
	  while(true) {
		  System.out.println("������ѡ����ѡС��small����big");
		  size=sc.next();	
		if(size=="small"||size=="big") {
			System.out.println("��������ȷ��Ͷע����");
			continue;
		}  
		else {
			Guesssize g=new Guesssize(b);
			System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
			  System.out.println();
			 System.out.println("����õĽ���Ϊ "+(g.sizewin(size)));
			 money+=g.sizewin(size);
			break;
		}  
	  }	  
	  
  }
  
  else if(str.equals("PackageChoose")&&money>=200) {
	  money-=200;
	  int packag=0;
	  while(true) {
		  System.out.println("������0-999֮�������");
		  packag=sc.nextInt();
	   if(packag>=0&&packag<=999) {
		  break;
	  }
	  else {
		  System.out.println("��������ȷ��Ͷע����");
		  continue;
		  }	  
	  }
	  int a[]=new int[3];  
	  a[0]=packag/100;
	    a[1]=(packag-a[0]*100)/10;
	    a[2]=packag-a[0]*100-a[1]*10;
	  Package p=new Package(b);
	  System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
	  System.out.println("����õĽ���Ϊ "+(p.packagewin(a)));	
	  money+=p.packagewin(a);
  }
  else if(str.equals("TractorChoose")&&money>=10) {
	  money-=10;
	  Tractor t=new Tractor(b);
	  System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
	  System.out.println("����õĽ���Ϊ "+(t.tractorwin()));	  
	  money+=t.tractorwin();
  }
  else if(str.equals("OneDChoose")&&money>=5)
  {	   money-=5;
	  String oned;
			  while(true) {
				  System.out.println("������ȷ��λ�õ�һ�����֣�����λ����*�����磬���ȷ����λ��Ϊ2��������**2");
			oned=sc.next();	
			int temp=0;
			for(int i=0;i<3;i++) {
		 		 if(oned.charAt(i)=='*')
		 			 temp++; 		
		 	 }
				if(temp!=2) {
					System.out.println("��������ȷ��Ͷע����");
					continue;
				}  
				else {
					Oned o=new Oned(b);
					System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
					  System.out.println();
					 System.out.println("����õĽ���Ϊ "+(o.Onedwin(oned)));
money+=o.Onedwin(oned);
					break;
				}  
			  }	  
  }
  else if(str.equals("GroupChoose")&&money>=100) {
	  money-=100;
	 int group=0;
	 while(true) {
		  System.out.println("������0-999֮�������");
		  group=sc.nextInt();
		  if(group>=0&&group<=999) {
			  break;
		  }
		  else {
			  System.out.println("��������ȷ��Ͷע����");
			  continue;
			  }	   
	 }
	 int a[]=new int[3];  
	  a[0]=group/100;
	    a[1]=(group-a[0]*100)/10;
	    a[2]=group-a[0]*100-a[1]*10;
	  Group g=new Group(b);
	  System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
	  System.out.println("����õĽ���Ϊ "+(g.Groupwin(a)));
	  money+=g.Groupwin(a);
	  
  }
  else if(str.equals("Guess2DChoose")&&money>=10) {
	  money-=10;
	  int guess2d=0;
	  while(true) {
		  System.out.println("����������0-9֮���������������ͬ");
		  guess2d=sc.nextInt();
		  if(guess2d>=0&&guess2d<=99) {
			  break;
		  }
		  else {
			  System.out.println("��������ȷ��Ͷע����");
			  continue;
			  }	   
	 }
	  int a[]=new int[3];  
	  a[0]=guess2d/10;
	  a[1]=guess2d-a[0]*10;
	  Guess2D gu2=new Guess2D(b);
	  System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
	  System.out.println("����õĽ���Ϊ "+(gu2.Guess2Dwin(a)));
	  money+=gu2.Guess2Dwin(a);
		}   
  else if(str.equals("Guess1DChoose")&&money>=10) {
	  money-=10;
  int guess1d=0;
  while(true) {
	  System.out.println("������0-9֮�������");
	  guess1d=sc.nextInt();
	  if(guess1d>=0&&guess1d<=9) {
		  break;
	  }
	  else {
		  System.out.println("��������ȷ��Ͷע����");
		  continue;
		  }	   
 }
  Guess1D gu=new Guess1D(b);
  System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
  System.out.println();
  System.out.println("����õĽ���Ϊ "+(gu.Guess1Dwin(guess1d)));
  money+=gu.Guess1Dwin(guess1d);
	}   
  else if(str.equals("TowdChoose")&&money>=50)
  {
	  money-=50;
	  String towd;
	  while(true) {
		  System.out.println("������ȷ��λ�õ��������֣�����λ����*�����磬*32");
		  towd=sc.next();	
	int temp=0;
	for(int i=0;i<3;i++) {
 		 if(towd.charAt(i)=='*')
 			 temp++;
 	 }
		if(temp!=1) {
			System.out.println("��������ȷ��Ͷע����");
			continue;
		}  
		else {
			Towd t=new Towd(b);
			System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
			  System.out.println();
			 System.out.println("����õĽ���Ϊ "+(t.Towdwin(towd)));
			 money+=t.Towdwin(towd);
			break;
		}  
	  }	  	  
  }
  else if(str.equals("SumChoose")&&money>=40) {
	  money-=40;
	  int sum;
	  while(true) {
		  System.out.println("������0-27֮�������");
		  sum=sc.nextInt();
		  if(sum>=0&&sum<=27) {
			  break;
		  }
		  else {
			  System.out.println("��������ȷ��Ͷע����");
			  continue;
			  }	   
	 }
	  Sum th=new Sum(b);
	  System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
	  System.out.println();
	  System.out.println("����õĽ���Ϊ "+(th.getWins(sum)));
	  money+=th.getWins(sum);
	  
  }
  else if(str.equals("GeneralChoose")&&money>=200) {
	  money-=200;
	  int general=0;
	  while(true) {
		  System.out.println("������0-999֮�������");
		  general=sc.nextInt();
	   if(general>=0&&general<=999) {
		  break;
	  }
	  else {
		  System.out.println("��������ȷ��Ͷע����");
		  continue;
		  }	  
	  }
	  int a[]=new int[3];  
	  a[0]=general/100;
	    a[1]=(general-a[0]*100)/10;
	    a[2]=general-a[0]*100-a[1]*10;
	    
	    General g=new General(b);
	    System.out.printf("�н���Ϊ��%d %d %d",b[0],b[1],b[2]);
	    System.out.println();
	 System.out.println("����õĽ���Ϊ "+(g.Generalwin(a)));	 
	 money+=g.Generalwin(a);
  } 
  else {
	  String str3;
	  System.out.println("����������!");
	  System.out.println("�Ƿ������ע�� Yes����No");
	  str3=sc.next();
	  if(str3.equals("Yes")) {
		  continue;
	  }
	  else {
		  break;
	  }
  }
 }
	System.out.println("��Ϸ����!");
}
}
