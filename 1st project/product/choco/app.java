import java.util.*;

class a{
	int a;
	void set_a(int i){
a=10;
}}

class b extends a{
	int b;
	void set_b(int j){
		  b=45;
		  System.out.println("a="+a+"b="+b);
		  
	}
}

class process extends b{
	void dis(){
		System.out.println(b);
	}
	void mult(){
		int c=a*b;
		System.out.println("multiple is "+c);
	}
}

class inheritance{
	
	public static void main(String args[]){
		
	a obj1=new a();
	b obj2=new b();
	process obj3=new process();
	
	System.out.println("Enter the number ");
	Scanner aa=new Scanner(System.in);
	Scanner bb=new Scanner(System.in);
	int get1=aa.nextInt();
	int get2=bb.nextInt();
	System.out.println(get1);
	System.out.println(get2);
	obj1.set_a(get1);
	obj2.set_b(get2);
	System.out.println("\n choice\n 1.display\n 2.multiple");
	Scanner cc=new Scanner(System.in);
	int choice=cc.nextInt();
	
	obj3.dis();
	switch(choice)
	{
		case 1:
		obj3.dis();
		break;
		
		case 2:
		obj3.mult();
		break;
	}
	}
}
