//package by.academy.classwork.lesson7;
//
//public class ClassworkDemo<T, V, K> extends Comparable<String>, V extends Averege <Number> & Serializabel, K extends Data{
//
//	private T varT;
//	private V varV;
//	private K varK;
//
//	public ClassworkDemo() {
//		super();
//	}
//
//	public ClassworkDemo(T varT, V varV, K varK) {
//		super();
//		this.varT = varT;
//		this.varV = varV;
//		this.varK = varK;
//	}
//
//	public T getVarT() {
//		return varT;
//	}
//
//	public void setVarT(T varT) {
//		this.varT = varT;
//	}
//
//	public V getVarV() {
//		if(varV==null) {
//			return null;
//		}
//		return varV.getClass().getName();
//	}
//
//	public void setVarV(V varV) {
//		this.varV = varV;
//	}
//
//	public K getVarK() {
//		if(varK==null) {
//			return null;
//		}
//		return varK.getClass().getName();
//	}
//
//	public void setVarK(K varK) {
//		this.varK = varK;
//	}
//
//	public String getKName() {
//		if(varV==null) {
//			return null;
//		}
//		return varV.getClass().getName();
//	}
//
//	public String getTName() {
//		return varT.getClass().getName();
//	}
//
//	public String getVName() {
//		return varV.getClass().getName();
//	}
//
//	public static void main(String[] args) {
//
//		ClassworkDemo <String, Cat, Integer> demo = new ClassworkDemo<>;
//		System.out.println(demo.getKName());
//		System.out.println(demo.getVName());
//		System.out.println(demo.getTName());
//	}
//}
