package com.cspowernode.teaching.p1;

public class finally和return的优先级 {

	/**
	 * 面试题：try..catch..finally里面的return的优先级
	 * 1、只要有finally，就一定会执行finally，哪怕你之前的代码块里面有return，都要
	 * 先执行finally里面的代码；
	 * 2、如果finally里面有return的代码，那么你之前的return代码将不再执行；
	 * 3、如果你前面的代码return后面是个表达式的话，那么表达式是先运行的，再去执行return的
	 * 此时，要return了，就会判断是否有finally；
	 * 4、如果执行了System.exit(0)，那么就不会去看finally了，直接程序终止
	 */
	public static void main(String[] args) {
//		System.out.println(test(null));
//		System.out.println(test("0"));
		System.out.println(test(""));
	}
	private static int test(String str) {
		try{
			return str.charAt(0)-'0';
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("a");
			return 1;
		}catch(RuntimeException e){
			e.printStackTrace();
			System.out.println("b");
			return 2;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			return 3;
		}finally{
			System.out.println("d");
			//如果finally里面没有return的话，结果如何
			return 4;
		}
	}

}
