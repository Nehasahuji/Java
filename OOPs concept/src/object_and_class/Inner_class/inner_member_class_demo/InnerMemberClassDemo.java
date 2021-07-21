package object_and_class.Inner_class.inner_member_class_demo;

public class InnerMemberClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass outer = new OuterClass();
//		create object of inner class
		OuterClass.InnerClass inner = outer.new InnerClass();

		inner.view();
	}

}
