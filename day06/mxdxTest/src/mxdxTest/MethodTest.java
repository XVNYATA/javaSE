package mxdxTest;

public class MethodTest {
	
	private String name ="方法定义";
	
	public static void main(String[] args) {
		
	}
	
    //[修饰符] 返回类型 方法名称(形参列表){
        // 执行代码  
    //}
	
	int getAge(){
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("i:"+i);
		}
		/** 只要有返回类型就一定要指定return */
		return 32;
	}
	
	// 没有返回类型的方法 
	// 用void申明
	public void sing(){
		
	}
	
	private static final void jump(){
		
	}
	// 形参类型可以是：基本数据类型,引用数据类型
    public void work(String name,String address,int age ,char sex){
    	
    }
    
    public int a(People p){
    	return 1;
    }
    
    public void strudy(String[] names){
    	
    }
    
    public static void get(){
    	
    }
	
}
