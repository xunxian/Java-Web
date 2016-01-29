package com.mes.face;
interface A {
	public void funA();
}
interface B{
	public void funB();
}
class X implements A,B{
	@Override
	public void funA(){
		
		System.out.println("实现A接口");
	}

	@Override
	public void funB() {
		System.out.println("实现B接口");
	}
}
public class TestFace extends X{

	public static void main(String[] args) {
		X test=new TestFace();
		test.funA();
		test.funB();
		
	}

}
