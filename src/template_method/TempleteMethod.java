package template_method;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TempleteMethod {
	public String process(String method, Object... param) {
		Class<?>[] clazzes = new Class<?>[param.length];
		for(int i=0 ; i< param.length ; i++){
			clazzes[i] = param[i].getClass();
		}		
		Method m;
		try {
			m = this.getClass().getDeclaredMethod(method,clazzes);
			return (String)m.invoke(this,param);
		} catch ( IllegalAccessException
				| IllegalArgumentException
				| InvocationTargetException
				| NoSuchMethodException
				| SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	public String process(String method, String param) {
		
		String s="";
		try {
			Method m = this.getClass().getDeclaredMethod(method,String.class);
			System.out.println("before invoke !!!");
			check(m.getAnnotation(Permissions.class).value());
			s = (String) m.invoke(this,param);
			System.out.println("after invoke !!!");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	private void check(Permission p) {
		if(p.equals(Permission.readPlan)){
			System.out.println("readPlan!!");
			return;
		}
		System.out.println("don't readPlan!!");	
	}

	@Permissions(Permission.writePlan)
	public String create(String param){
		System.out.println("do create." + param);
		return "return from create!!";
	}
	public String create(String p1,String p2,String p3){
		System.out.println("do create.");
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3);
		return "return from create!!";
	}
	
	public String create(String p1,String p2,String p3, Integer i){
		System.out.println("do create.");
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3);
		System.out.println("i = " + i);
		return "return from create!!";
	}
	public String create(){
		System.out.println("do create with no parameters.");
		return "return from create!!";
	}
}
